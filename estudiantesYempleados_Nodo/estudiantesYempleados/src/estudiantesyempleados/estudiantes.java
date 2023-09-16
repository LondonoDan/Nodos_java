
package estudiantesyempleados;

public class estudiantes {
   private String codigo_Estudiante;
   private String nombre_Estudiante;
   private int edad_Estudiante;
   private double nota_definitiva;

   
   //constructor vacio
    public estudiantes() {
    }
   
   //constructor con datos

    public estudiantes(String codigo_Estudiante, String nombre_Estudiante, int edad_Estudiante, double nota_definitiva) {
        this.codigo_Estudiante = codigo_Estudiante;
        this.nombre_Estudiante = nombre_Estudiante;
        this.edad_Estudiante = edad_Estudiante;
        this.nota_definitiva = nota_definitiva;
    }

    public String getCodigo_Estudiante() {
        return codigo_Estudiante;
    }

    public void setCodigo_Estudiante(String codigo_Estudiante) {
        this.codigo_Estudiante = codigo_Estudiante;
    }

    public String getNombre_Estudiante() {
        return nombre_Estudiante;
    }

    public void setNombre_Estudiante(String nombre_Estudiante) {
        this.nombre_Estudiante = nombre_Estudiante;
    }

    public int getEdad_Estudiante() {
        return edad_Estudiante;
    }

    public void setEdad_Estudiante(int edad_Estudiante) {
        this.edad_Estudiante = edad_Estudiante;
    }

    public double getNota_definitiva() {
        return nota_definitiva;
    }

    public void setNota_definitiva(double nota_definitiva) {
        this.nota_definitiva = nota_definitiva;
    }

    @Override
    public String toString() {
        return "estudiante: " + "codigo_Estudiante: " + codigo_Estudiante + ", nombre_Estudiante: " + nombre_Estudiante + ", edad_Estudiante: " + edad_Estudiante + ", nota_definitiva: " + nota_definitiva ;
    }
   
    
    
   
}
