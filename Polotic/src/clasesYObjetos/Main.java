
package clasesYObjetos;

public class Main {
    public static void main(String[] args) {
        Alumno nico = new Alumno("Nicolas", "Biglia", "Programacion", 26);
        PlanillaDeAsistencia planilla = new PlanillaDeAsistencia();
        
        nico.saludar();
        nico.darPresente();
        planilla.nombreCurso = "Programacion";
        
        
    }
}
