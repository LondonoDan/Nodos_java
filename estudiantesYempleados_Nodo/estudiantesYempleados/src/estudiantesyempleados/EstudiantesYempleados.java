
package estudiantesyempleados;

import javax.swing.JOptionPane;


public class EstudiantesYempleados {

    
    public static void main(String[] args) {
        informacionU listEmp_Est = new informacionU();
        int opcion=0;
        estudiantes est;
        empleado emple;
        
        
        
        do{
            opcion =  Integer.parseInt(JOptionPane.showInputDialog("Seleccione una de las siguientes opciones : \n 1: registrar usuario"
                    + " \n 2: Imprimir informacion. \n 3: Buscar. \n 4: Salir "));
            
            switch(opcion){
                case 1:
                 double op = Double.parseDouble(JOptionPane.showInputDialog("\n 1.1 Registrar estudiante. \n1.2: Registrar empleado "));
                 
                 if(op == 1.1){
                 String nombre_Estudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante ");
                 int edad_Estudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante "));
                 String codigo_Estudiante = JOptionPane.showInputDialog("Ingrese el codigo ");
                 double nota_definitiva = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante"));
                 String opt = JOptionPane.showInputDialog("1.1.1 Registrar al inicio \n1.1.2 Registrar al final");
                 est = new estudiantes(codigo_Estudiante, nombre_Estudiante, edad_Estudiante, nota_definitiva);

               
                 
                      switch(opt){
                          
                     case"1.1.1":         
          
                          listEmp_Est.insertar_Nodo_Estudiantes(est);
                         break;
                         
                      case"1.1.2": 
               
                           listEmp_Est.Insertar_Nodo_Final_Estudiantes(est);
                          break;
                      }
                      
                 } 
                 
                        
               
                 
                 else if(op == 1.2){
                 String nombre_Empleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                 int edad_Empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado "));
                 String codigo_Empleado = JOptionPane.showInputDialog("Ingrese el codigo ");
                 int anos_antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años que lleva en la empresa "));
                 double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
                 String opt = JOptionPane.showInputDialog("1.1.1 Registrar al inicio \n1.1.2 Registrar al final");
                 emple = new empleado (codigo_Empleado,nombre_Empleado,edad_Empleado,anos_antiguedad,salario);
                 
                  switch(opt){
                          
                     case"1.1.1":         
          
                          listEmp_Est.insertar_Nodo_Empleados(emple);
                         break;
                         
                      case"1.1.2": 
               
                           listEmp_Est.Insertar_Nodo_Final_Empleados(emple);
                          break;
                      }
                 
                 }
                 else{
                        JOptionPane.showMessageDialog(null, "Opcion no valida"); }
                 break;
                
                case 2:
                    
                    double opcio = Double.parseDouble(JOptionPane.showInputDialog("\n 2.1 Mostrar los estudiantes. \n 2.2: Mostrar los empleados "));
                    if(opcio == 2.1){
                      System.out.println("Datos del estudiante");
                      listEmp_Est.imprimir_Lista_Estudiantess();
                    }else if(opcio == 2.2){
                        System.out.println("Datos del empleado");
                        listEmp_Est.Imprimir_Lista_empleados();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Opcion no valida"); 
                    }
                    break;
                    
                    case 3: 
                      double OP = Double.parseDouble(JOptionPane.showInputDialog("\n 3.1 Buscar con codigo de estudiante. \n 3.2: Buscar con código de empleado "));
                      
                      if(OP == 3.1){
                        
                        listEmp_Est.buscarCodigo_Estudiante();

                    }
                    else if(OP == 3.2){
                        listEmp_Est.buscarCodigo_Empleados();
                    }
                    else{
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
