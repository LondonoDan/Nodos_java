package estudiantesyempleados;

import javax.swing.JOptionPane;

public class informacionU {
    Nodo inicio;
    Nodo fin;

    public informacionU() {
    }

    public informacionU(Nodo inicio, Nodo fin) {
        this.inicio = null;
        this.fin = null;
        
    }
    
    
    
    //metodo de lista, este metodo lo puedo llamar despues para validar si mi lista esta vacia o no 
    public boolean validar(){
       return inicio == null;
    }
    //metodo de lista, este metodo lo puedo llamar despues para validar si mi lista esta vacia o no 
    public boolean validarr(){
        return fin == null;
    }
    
    
    //Metododo para insertar estudiantes al inicio
    
    public void insertar_Nodo_Estudiantes(estudiantes estu){
    Nodo estudiantes1 = new Nodo(estu); //creando el nodo o instanciandolo
    //validando si la lista esta vacia o no, llamamos el método que creamos para validar 
    if(validar()){  
        inicio = estudiantes1;
    
    }else{
        estudiantes1.setEnlace1(inicio);
            inicio = estudiantes1;
    }
            
            JOptionPane.showMessageDialog(null,"Estudiante insertado al inicio");
    }
    
    //Metodo para insertar estudiantes al final
     public void Insertar_Nodo_Final_Estudiantes(estudiantes estu){
        Nodo estudiantes1 = new Nodo(estu);
        if(inicio== null){
            inicio= estudiantes1;
        }
        else{
            Nodo Es= inicio;
            while(Es.enlace != null){
                Es = Es.enlace;
            }
            Es.enlace= estudiantes1;
        }
        JOptionPane.showMessageDialog(null,"Estudiante insertado al final");
    }

    

    
    //Metodo insertar empleados al inicio
    
    public void insertar_Nodo_Empleados(empleado emp){
    Nodo empleado1 = new Nodo(emp); //creando el nodo o instanciandolo
    //validando si la lista esta vacia o no, llamamos el método que creamos para validar 
    if(validar()){  
        inicio = empleado1;
    
    }else{
        empleado1.setEnlace1(inicio);
            inicio = empleado1;
    }
            
            JOptionPane.showMessageDialog(null,"Empleado insertado al inicio");
    }
    
    //Metodo para insetar al final de empleados
     public void Insertar_Nodo_Final_Empleados(empleado emp){
        Nodo empleado1 = new Nodo(emp);
        if(inicio== null){
            inicio= empleado1;
        }
        else{
            Nodo Es= inicio;
            while(Es.enlace != null){
                Es = Es.enlace;
            }
            Es.enlace= empleado1;
        }
        JOptionPane.showMessageDialog(null,"Empleado insertado al final");
    }

    
    
    //Mostrar todos los elementos de la lista de estudiantes
     public void imprimir_Lista_Estudiantess(){
        Nodo estudiantes1 = inicio ;
        do{
            
            System.out.println( estudiantes1.getEstudiantess().toString());
            estudiantes1 = estudiantes1.enlace; 
                
                
                 } while (estudiantes1 != null);
        }
     
      //Mostrar todos los elementos de la lista de empleados
    public void Imprimir_Lista_empleados(){
       Nodo empleado1 = inicio  ;
        do{
            System.out.println( empleado1.getEmpleadoss().toString());   
            empleado1 = empleado1.enlace;
                  
                
                
                
                
                 } while (empleado1 != null);
        
        }

    
     //Método buscar codigo esrudiante
    public void buscarCodigo_Estudiante(){

        
        Nodo aux = inicio;
         String cod = JOptionPane.showInputDialog("Digite el codigo del estudiante");
        boolean encontrado = false;
      
      
         while(aux != null){
        
            if (aux.getEstudiantess().getCodigo_Estudiante().equals(cod)){
               JOptionPane.showMessageDialog(null,"Estudiante encontrado: "+ aux.getEstudiantess().getNombre_Estudiante());
              encontrado = true;
               break;
              
            }
            
            aux = aux.enlace;
            
            
         }
            if (!encontrado){
                
                JOptionPane.showMessageDialog(null, "No fue encontrado el estudiante");
    }
      
            
 
            }       
            
        
    //Metodo buscar codigo empleado 
    public void buscarCodigo_Empleados(){
        
       
        Nodo aux = inicio;
         String cod = JOptionPane.showInputDialog("Digite el codigo del empleado");
        boolean encontrado = false;
      
      
         while(aux != null){
        
            if (aux.getEmpleadoss().getCodigo_Empleado().equals(cod)){
               JOptionPane.showMessageDialog(null,"Empleado encontrado: "+ aux.getEmpleadoss().getNombre_Empleado());
              encontrado = true;
               break;
              
            }
            
            aux = aux.enlace;
            
            
         }
            if (!encontrado){
                
                JOptionPane.showMessageDialog(null, "No fue encontrado el empleado");
    }
      
            
 
    }
}

        
    



            
       
            
            
    


        
    
    
    
    


