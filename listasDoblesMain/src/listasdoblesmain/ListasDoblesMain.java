
package listasdoblesmain;

import javax.swing.JOptionPane;


public class ListasDoblesMain {

    
    public static void main(String[] args) {
        //Listas doblemente enlazada
        metodosCelulares CELULARES = new metodosCelulares();
        Celulares_clase C;
        int opcion=0;
        int opci=0;
        
        do{
        opci= Integer.parseInt(JOptionPane.showInputDialog("(っ◔◡◔)っ ♥ Ingrese la opción ♥✋ " 
                + "\n Opción #【1】 Insertar celulares "
                + "\n Opción #【2】 mostrar datos "
                + "\n Opción #【3】 validar total productos ingresados "
                + "\n Opción #【4】 ♥ Salir ♥ "));
        switch (opci) {
            case 1: 
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("(っ◔◡◔)っ ♥ Ingrese la opción ♥✋ que datos conoces del celular "
                            + "\n opcion #【1】 ninguno. "
                            + "\n opcion #【2】 marca, tipo, color "
                            + "\n opcion #【3】 Imei, capacidad "
                            + "\n opcion #【4】 Todos los datos "));
                    
                    switch (opcion) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "El usuario no conoce datos");
                            C = new Celulares_clase();
                            break;
                        case 2:
                            String marca = JOptionPane.showInputDialog("Ingrese cual es la marca del Celular");
                            String tipoProcesador = JOptionPane.showInputDialog("Ingrese cual es el tipo de procesar del Celular");
                            String color = JOptionPane.showInputDialog("Ingrese cual es el color del Celular");
                            int opt = Integer.parseInt(JOptionPane.showInputDialog("1 Registrar al inicio \n 2 Registrar al final"));
                            C = new Celulares_clase(marca, tipoProcesador, color);
                            
                            if( opt == 1){
                                CELULARES.insertarNodo_inicio(C);
                            }else{
                                CELULARES.insertarNodo_final(C);
                            }
                            
                            
                            
                             break;
                        case 3:
                            int Imei = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Imei del Celular "));
                            int capacidadMemoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de cuanta es la capacidad de memoria del Celular "));
                            int option = Integer.parseInt(JOptionPane.showInputDialog("1 Registrar al inicio \n 2 Registrar al final"));
                            C = new Celulares_clase(Imei, capacidadMemoria);
                            if( option == 1){
                                CELULARES.insertarNodo_inicio(C);
                            }else{
                                CELULARES.insertarNodo_final(C);
                            }
                            
                            
                            break;
                            
                            
                        case 4: 
                            marca = JOptionPane.showInputDialog("Ingrese cual es la marca del Celular");
                            tipoProcesador = JOptionPane.showInputDialog("Ingrese cual es el tipo de procesar del Celular");
                            color = JOptionPane.showInputDialog("Ingrese cual es el color del Celular");
                            Imei = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Imei del Celular "));
                            capacidadMemoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de cuanta es la capacidad de memoria del Celular "));
                            int op = Integer.parseInt(JOptionPane.showInputDialog("1 Registrar al inicio \n 2 Registrar al final"));
                            C = new Celulares_clase(Imei, marca, tipoProcesador, capacidadMemoria, color);
                            if( op == 1){
                                CELULARES.insertarNodo_inicio(C);
                            }else{
                                CELULARES.insertarNodo_final(C);
                            }
                            
                            break;
                                    
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida ingresa una de las opciones que muestra el menú");
                            break;
                        }
                break;
                 
            case 2:
                
                    if(!CELULARES.Validar_lista()){
                        System.out.println("(っ◔◡◔)っ ♥ lista de celulares ♥: ");
                        CELULARES.mostrarlistaCelulares();
                    }else{
                        System.out.println("la lista no tiene datos agregados aun ");
                    }
                break;
                
                
            case 3:
                System.out.println("(っ◔◡◔)っ ♥ total de productos agregados es de♥ : " +CELULARES.total_datos());
                
                break;
            case 4:
                System.exit(0);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida ingresa una de las opciones que muestra el menú");
                break;
            }
        
        }while(opci != 4);
        
    }
    
}
