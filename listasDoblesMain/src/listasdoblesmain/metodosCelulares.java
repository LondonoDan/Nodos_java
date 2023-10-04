
package listasdoblesmain;

import javax.swing.JOptionPane;

public class metodosCelulares {
    Nodo inicio,fin;
    int tamano;

    
    //Constructor con datos

    public metodosCelulares() {
        this.inicio = null;
        this.fin = null;
         this.tamano=tamano;
    }
    
    
    
    //metodo para saber cuantos datos hay en la lista
   public int total_datos(){
        return tamano;
        
   }
    //metodo de lista, este metodo lo puedo llamar despues para validar si mi lista esta vacia o no 
    public boolean Validar_lista(){
        return inicio == null;
        
        
    }
    
    //Metodo para insertar un nodo al inicio
   public void insertarNodo_inicio(Celulares_clase dato){
        Nodo nuevo = new Nodo(dato);
        if (inicio== null) {
            inicio=nuevo;
            fin=nuevo;
        }else{
            nuevo.setAtras(inicio);
            inicio.setAdelante(nuevo);
            inicio=nuevo;
        }
        
        JOptionPane.showMessageDialog(null,"Nodo insertado al inicio ");
        
        
        tamano++;
        
    }
   
   //metodo para insertar un nodo al final 
    
   public void insertarNodo_final(Celulares_clase dato){
        Nodo auxiliar = new Nodo(dato);
        if (inicio== null) {
            inicio =auxiliar;
            fin = auxiliar;
        }else{
            auxiliar.setAdelante(fin);
            fin.setAtras(auxiliar);
            fin=auxiliar;
        }
        JOptionPane.showMessageDialog(null,"Nodo insertado al final ");
        tamano++;
        
        
    }
   
   //metodo para mostrar los datos 
   public void mostrarlistaCelulares(){
       Nodo celularess = inicio;
       while(celularess !=null){
           System.out.println(celularess.getCelulares_clase().toString());
           celularess = celularess.getAtras();
           
       }
   }
 }
