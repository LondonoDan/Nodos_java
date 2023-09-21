package lista_productos;

public class productos {
   int codigo;
   double valor_unitario;
   private int stock;
   
   

   //constructor
    public productos(int codigo, double valor_unitario, int stock) {
        this.codigo = codigo;
        this.valor_unitario = valor_unitario;
        this.stock = stock;
    
    }  

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    

    @Override
    public String toString() {
        return "productos{" + "codigo=" + codigo + ", descripcion="  + valor_unitario + ", stock=" + stock + '}';
    }
   
    
    
    
    
}
