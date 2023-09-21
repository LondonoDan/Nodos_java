
package lista_productos;

import javax.swing.JOptionPane;

public class listas_LS {
   Nodo inicio;
   private int total;

   
   //Constructor vacio
    public listas_LS() {
    }
   
   
    //Constructor con datos
    public listas_LS(Nodo inicio, int total) {
        this.inicio = null;
        this.total = total;
    }
    
    // Método para saber cuantos elementos (nodos) tiene la lista.
    public int totalProductos(){
        return total;
    }
    
    //metodo de lista, este metodo lo puedo llamar despues para validar si mi lista esta vacia o no 
    public boolean validar(){
        return inicio == null;
        
    }
    
    //Metodo para insertar un nodo a una lista
    
    public void insertar_Nodo(productos P){
    Nodo nuevo1= new Nodo(P); //creando el nodo o instanciandolo
    //validando si la lista esta vacia o no, llamamos el método que creamos para validar 
    if(validar()){  
        inicio = nuevo1;
    
    }else{
        nuevo1.setSiguiente(inicio);
            inicio = nuevo1;
    }
            
            JOptionPane.showMessageDialog(null,"Nodulo insertado");
            total++;
    }
    
    
    //Mostrar todos los elementos de la lista
    public void mostrar(){
    
    Nodo activo = inicio;
    while (activo.getSiguiente()!= null){
        System.out.println(activo.getProducto().toString());
        activo = activo.getSiguiente();
    
    }
    System.out.println(activo.getProducto());
}
    
    
    //Buscar un Producto por el codigo
        public boolean buscarCodigo(int cod){
        Nodo aux = inicio;
            // Bandera para indicar si el valor existe.
            boolean encontrado = false;
            
            // Recorre la lista hasta encontrar el elemento o hasta
            // llegar al final de la lista.
            while (aux != null && encontrado != true) {
             // Consulta si el valor del nodo es igual al de referencia.
                if (cod == aux.getProducto().codigo) {
                    
                    
                    encontrado = true;
                    System.out.println("producto encontrado, el producto encontrado es: "+aux.getProducto().codigo);
                    
                } else {
                    
                    // Avanza al siguiente. nodo. Informa si no se encontro el producto
                    aux = aux.getSiguiente();
                    System.out.println("No se encontro el producto");
                }
            }
            // Retorna el resultado de la bandera.
            return encontrado;
        }
        
        public void productosTotal(){
            double totalPrecio = 0;
            Nodo auxilar = inicio;
            if(validar()){
                JOptionPane.showMessageDialog(null, "Lista vacia, precio $0");
            }else{
                while(auxilar !=null){
                 totalPrecio = totalPrecio + (auxilar.getProducto().valor_unitario * auxilar.getProducto().getStock());
                 auxilar = auxilar.getSiguiente();
                }
                JOptionPane.showMessageDialog(null, "Total de los precios $" + totalPrecio+1);
            }
                    
            
        }
        
    
}
