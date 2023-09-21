package lista_productos;

public class Nodo {
    private productos producto;
    private Nodo siguiente;
    

    public Nodo() {
    }

    public Nodo(productos producto) {
        this.producto = producto;
        this.siguiente = null;
    }


    public productos getProducto() {
        return producto;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setProducto(productos producto) {
        this.producto = producto;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

   
    
    
    
}
