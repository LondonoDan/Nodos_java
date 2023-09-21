
package estudiantesyempleados;

import javax.swing.JOptionPane;


public class EstudiantesYempleados {

    
    public static void main(String[] args) {
        informacionU listEmp_Est = new informacionU();
        int opcion=0;
        estudiantes est;
        empleado emple;
        
        
        
        do{
            opcion =  Integer.parseInt(JOptionPane.showInputDialog("Seleccione una de las siguientes opciones : "
                    + "\n 1: registrar usuario"
                    + "\n 2: Imprimir informacion. "
                    + "\n 3: Buscar. "
                    + "\n 4: Salir "));
            
            switch(opcion){
                case 1:
                 int op = Integer.parseInt(JOptionPane.showInputDialog("\n 1 Registrar estudiante. \n 2: Registrar empleado "));
                 
            switch (op) {
                case 1:
                    {
                        String nombre_Estudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante ");
                        int edad_Estudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante "));
                        String codigo_Estudiante = JOptionPane.showInputDialog("Ingrese el codigo ");
                        double nota_definitiva = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante"));
                        String opt = JOptionPane.showInputDialog("1 Registrar al inicio \n 2 Registrar al final");
                        est = new estudiantes(codigo_Estudiante, nombre_Estudiante, edad_Estudiante, nota_definitiva);
                        switch(opt){
                            
                            case"1":
                                
                                listEmp_Est.insertar_Nodo_Estudiantes(est);
                                break;
                                
                            case"2":
                                
                                listEmp_Est.Insertar_Nodo_Final_Estudiantes(est);
                                break;
                        } break;
                    }
                case 2:
                    {
                        String nombre_Empleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                        int edad_Empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado "));
                        String codigo_Empleado = JOptionPane.showInputDialog("Ingrese el codigo ");
                        int anos_antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años que lleva en la empresa "));
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
                        String opt = JOptionPane.showInputDialog("1 Registrar al inicio \n 2 Registrar al final");
                        emple = new empleado (codigo_Empleado,nombre_Empleado,edad_Empleado,anos_antiguedad,salario);
                        switch(opt){
                            
                            case"1":
                                
                                listEmp_Est.insertar_Nodo_Empleados(emple);
                                break;
                                
                            case"2":
                                
                                listEmp_Est.Insertar_Nodo_Final_Empleados(emple);
                                break;
                        } break;
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
                 break;
                
                case 2:
                    int opcio = Integer.parseInt(JOptionPane.showInputDialog("\n 1 Mostrar los estudiantes. "
                            + "\n 2: Mostrar los empleados "));
                    switch(opcio){
                        case 1:
                            if(!listEmp_Est.validar()){
                                System.out.println("(っ◔◡◔)っ ♥ lista de Estudiantes ♥: ");
                                listEmp_Est.imprimir_Lista_Estudiantess();
                            }else{
                                System.out.println("♥ No hay estudiantes insertados ♥: ");
                            }
                            break;
                            
                        case 2:
                            if(!listEmp_Est.validar()){
                                System.out.println("(っ◔◡◔)っ ♥ lista de Empleados ♥: ");
                                listEmp_Est.Imprimir_Lista_empleados();
                            }else{
                                System.out.println("♥ No hay empleados insertados ♥: ");

                            }
                            break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida"); 
                    }
                    break;
                    case 3: 
                      double OP = Double.parseDouble(JOptionPane.showInputDialog("\n 1 Buscar con codigo de estudiante."
                              + " \n 2: Buscar con código de empleado "));
                      
                      if(OP == 1){
                        
                        listEmp_Est.buscarCodigo_Estudiante();

                    }
                    else if(OP == 2){
                        listEmp_Est.buscarCodigo_Empleados();
                    }
                    {
                        JOptionPane.showMessageDialog(null, "Opcion no valida"); 
                    }
                    break;
                    case 4: 
                        System.exit(0);
                        
                        break;
              
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");  
                }
              
        }while(opcion != 4); 
        
    }
    
}
