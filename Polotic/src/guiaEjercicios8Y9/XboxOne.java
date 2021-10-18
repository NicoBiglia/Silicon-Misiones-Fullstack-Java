
package guiaEjercicios8Y9;


public class XboxOne extends Consola {
    
    private boolean conectadaInternet, activado4K, descargaActualizaciones;

    public XboxOne(boolean conectadaInternet, boolean activado4K, boolean descargaActualizaciones, String codigoConsola, String nombre, String empresaDesarrollo, int añoLanzamiento) {
        super(codigoConsola, nombre, empresaDesarrollo, añoLanzamiento);
        this.conectadaInternet = conectadaInternet;
        this.activado4K = activado4K;
        this.descargaActualizaciones = descargaActualizaciones;
    }

    public boolean isConectadaInternet() {
        return conectadaInternet;
    }

    public void setConectadaInternet(boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public boolean isActivado4K() {
        return activado4K;
    }

    public void setActivado4K(boolean activado4K) {
        this.activado4K = activado4K;
    }

    public boolean isDescargaActualizaciones() {
        return descargaActualizaciones;
    }

    public void setDescargaActualizaciones(boolean descargaActualizaciones) {
        this.descargaActualizaciones = descargaActualizaciones;
    }
    
    public String leerJuegoDigital(String juego){
        return "Leyendo " + juego + " desde la tienda.";
    }
}
