
package guiaEjercicios8Y9;


public class Camion extends Vehiculo {
    
    private boolean tieneAcoplado;
    private int cantidadEjes;

    public Camion(boolean tieneAcoplado, int cantidadEjes, String patente, String motor, String color, String marca, String modelo, int numChasis, int cantAsientos) {
        super(patente, motor, color, marca, modelo, numChasis, cantAsientos);
        this.tieneAcoplado = tieneAcoplado;
        this.cantidadEjes = cantidadEjes;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }
    
    @Override
    public String presentarse(){
        return "Hola soy un camion y mi cantidad de ejes es " + getCantidadEjes(); 
    }
}
