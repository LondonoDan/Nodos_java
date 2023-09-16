
package estudiantesyempleados;

public class Nodo {
    public Nodo enlace;
    private Nodo enlace1;
    private estudiantes estudiantess;
    private empleado empleadoss;

    public Nodo() {
    }

    public Nodo(estudiantes estudiantess) {
        this.enlace = null;
        this.estudiantess = estudiantess;
        
    }

    public Nodo(empleado empleadoss) {
        this.enlace= null;
        this.empleadoss = empleadoss;
    }

    

    public Nodo getEnlace1() {
        return enlace1;
    }

    public void setEnlace1(Nodo enlace) {
        this.enlace1 = enlace1;
    }

    public estudiantes getEstudiantess() {
        return estudiantess;
    }

    public void setEstudiantess(estudiantes estudiantess) {
        this.estudiantess = estudiantess;
    }

    public empleado getEmpleadoss() {
        return empleadoss;
    }

    public void setEmpleadoss(empleado empleadoss) {
        this.empleadoss = empleadoss;
    }
    
    
    
    
    
    
}
