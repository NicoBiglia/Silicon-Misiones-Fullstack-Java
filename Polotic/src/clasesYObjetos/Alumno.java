
package clasesYObjetos;


public class Alumno {
    String nombre, apellido, curso;
    int edad;
    
    
    public Alumno(String nombre, String apellido, String curso, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.edad = edad;
    }
    
    public void saludar(){
        System.out.println("Hola, mi nombre es "+ this.nombre + " "+ this.apellido + " y tengo "+this.edad + " años");
    }
    
    public void darPresente(){
        System.out.println("Presente");
        
        
    }
}
