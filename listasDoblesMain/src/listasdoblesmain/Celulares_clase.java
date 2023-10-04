
package listasdoblesmain;

public class Celulares_clase {
    private int Imei;
    private String marca;
    private String tipoProcesador;
    private int capacidadMemoria;
    private String color;

    
    //Constructor vacio
    public Celulares_clase() {
    }

    
    //Constructor con datos solo strings
    public Celulares_clase(String marca, String tipoProcesador, String color) {
        this.marca = marca;
        this.tipoProcesador = tipoProcesador;
        this.color = color;
    }

    
    
    
    
    
    
    
    //Constuctor con datos enteros
    public Celulares_clase(int Imei, int capacidadMemoria) {
        this.Imei = Imei;
        this.capacidadMemoria = capacidadMemoria;
    }

    
    //Constructor con datos
    public Celulares_clase(int Imei, String marca, String tipoProcesador, int capacidadMemoria, String color) {
        this.Imei = Imei;
        this.marca = marca;
        this.tipoProcesador = tipoProcesador;
        this.capacidadMemoria = capacidadMemoria;
        this.color = color;
    }
    
    
    
    //Getters y setters

    public int getImei() {
        return Imei;
    }

    public void setImei(int Imei) {
        this.Imei = Imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    public int getCapacidadMemoria() {
        return capacidadMemoria;
    }

    public void setCapacidadMemoria(int capacidadMemoria) {
        this.capacidadMemoria = capacidadMemoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    //To string

    @Override
    public String toString() {
        return "Celulares_clase{" + "Imei=" + Imei + ", marca=" + marca + ", tipoProcesador=" + tipoProcesador + ", capacidadMemoria=" + capacidadMemoria + ", color=" + color + '}';
    }
    
}
