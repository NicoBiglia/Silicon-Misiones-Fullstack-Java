
package guiaEjercicios8Y9;

public class Nintendo64 extends Consola {
    
    private String norma;
    private boolean leePiratas;

    public Nintendo64(String norma, boolean leePiratas, String codigoConsola, String nombre, String empresaDesarrollo, int añoLanzamiento) {
        super(codigoConsola, nombre, empresaDesarrollo, añoLanzamiento);
        this.norma = norma;
        this.leePiratas = leePiratas;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isLeePiratas() {
        return leePiratas;
    }

    public void setLeePiratas(boolean leePiratas) {
        this.leePiratas = leePiratas;
    }
    
    
    public String leerCartucho(String juego){
        return "Leyendo cartucho "+ juego;
    }
    
}
