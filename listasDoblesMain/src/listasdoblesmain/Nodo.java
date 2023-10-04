package listasdoblesmain;

public class Nodo {
    private Celulares_clase Celulares_clase;
    private Nodo atras, adelante;
    
    
    //Constructor vacio
    public Nodo() {
    }
    
    //Constructor con datos
    public Nodo(Celulares_clase Celulares_clase) {
        this.Celulares_clase = Celulares_clase;
        this.atras = null;
        this.adelante = null;
    }

  
    
    // Getters and setters

    public Celulares_clase getCelulares_clase() {
        return Celulares_clase;
    }

    public void setCelulares_clase(Celulares_clase Celulares_clase) {
        this.Celulares_clase = Celulares_clase;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    public Nodo getAdelante() {
        return adelante;
    }

    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
    }
    
    
}
