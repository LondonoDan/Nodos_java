
package estudiantesyempleados;


public class empleado {
    private String codigo_Empleado;
    private String nombre_Empleado;
    private int edad_Empleado;
    private int anos_antiguedad;
    private double salario;

    public empleado() {
    }

    public empleado(String codigo_Empleado, String nombre_Empleado, int edad_Empleado, int anos_antiguedad, double salario) {
        this.codigo_Empleado = codigo_Empleado;
        this.nombre_Empleado = nombre_Empleado;
        this.edad_Empleado = edad_Empleado;
        this.anos_antiguedad = anos_antiguedad;
        this.salario = salario;
    }

   


    public String getCodigo_Empleado() {
        return codigo_Empleado;
    }

    public void setCodigo_Empleado(String codigo_Empleado) {
        this.codigo_Empleado = codigo_Empleado;
    }

    public String getNombre_Empleado() {
        return nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }

    public int getEdad_Empleado() {
        return edad_Empleado;
    }

    public void setEdad_Empleado(int edad_Empleado) {
        this.edad_Empleado = edad_Empleado;
    }

    public int getAnos_antiguedad() {
        return anos_antiguedad;
    }

    public void setAnos_antiguedad(int anos_antiguedad) {
        this.anos_antiguedad = anos_antiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "empleado: " + "codigo_Empleado:  " + codigo_Empleado + ", nombre_Empleado: " + nombre_Empleado + ", edad_Empleado: " + edad_Empleado + ", anos_antiguedad: " + anos_antiguedad + ", salario: " + salario ;
    }
    
    
    
}
