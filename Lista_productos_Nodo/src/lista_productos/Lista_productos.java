
package lista_productos;

import javax.swing.JOptionPane;


public class Lista_productos {

    
    public static void main(String[] args) {
    listas_LS productoss = new listas_LS();
    int opcion,busquedaCod;
    productos P;
    int opc=0;
    //inicio del codigo- información. 
   
        do{
           opc= Integer.parseInt(JOptionPane.showInputDialog("(っ◔◡◔)っ ♥ Ingrese la opción ♥✋ "
                   + "\n Opción #【1】 Mostrar la lista de productos "
                   + "\n Opción #【2】 Insertar productos "
                   + "\n Opción #【3】 Buscar un producto en especifico"
                   + "\n Opción #【4】 validar total productos ingresados "
                   + "\n Opción #【5】 validar el precio total de todos los productos ingresados "
                   + "\n Opción #【6】 ♥ Salir ♥ "));
   
        switch (opc) {
            case 1:
                if(!productoss.validar()){
                    System.out.println("(っ◔◡◔)っ ♥ lista de productos ♥: ");
                    productoss.mostrar();
                }else{
                    System.out.println("la lista no tiene productos agregados ");
                    
                }          
               break;
            case 2:
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto "));
                int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese de cuanto es el stock "));
                double valor_unitario = Double.parseDouble(JOptionPane.showInputDialog("Valor unitario "));
                P = new productos(codigo, valor_unitario,stock);
                productoss.insertar_Nodo(P);
                break;
                
            case 3:
                busquedaCod =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto para buscar")); 
                productoss.buscarCodigo(busquedaCod);
                break;
            case 4:
                 
                JOptionPane.showMessageDialog(null, "La cantidad de productos ingresados es de: " +productoss.totalProductos());
                break;
            case 5:
                productoss.productosTotal();
                break;
            case 6: 
                System.exit(0);
                break;
            default:
                 JOptionPane.showMessageDialog(null, "Opcion no valida ingresa una de las opciones que muestra el menú");
                break;
        }
        }while(opc != 6);

    
    
    
   
     
     
    
   
                                            
    
    
    
    
    
    }
}
