
package guiaEjercicios8Y9;

public abstract class Consola {
    
    private String codigoConsola, nombre, empresaDesarrollo;
    private int añoLanzamiento;

    public Consola(String codigoConsola, String nombre, String empresaDesarrollo, int añoLanzamiento) {
        this.codigoConsola = codigoConsola;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getCodigoConsola() {
        return codigoConsola;
    }

    public void setCodigoConsola(String codigoConsola) {
        this.codigoConsola = codigoConsola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
    
    
    public String cargarJuego(){
        return "Cargando juego. Por favor espere...";
    }
}
