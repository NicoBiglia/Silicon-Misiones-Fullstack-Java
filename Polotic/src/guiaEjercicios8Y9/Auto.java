
package guiaEjercicios8Y9;


public class Auto extends Vehiculo {
    
    private String materialAsientos;
    private int cantidadCaballosFuerza;

    public Auto(String materialAsientos, int cantidadCaballosFuerza, String patente, String motor, String color, String marca, String modelo, int numChasis, int cantAsientos) {
        super(patente, motor, color, marca, modelo, numChasis, cantAsientos);
        this.materialAsientos = materialAsientos;
        this.cantidadCaballosFuerza = cantidadCaballosFuerza;
    }

    public String getMaterialAsientos() {
        return materialAsientos;
    }

    public void setMaterialAsientos(String materialAsientos) {
        this.materialAsientos = materialAsientos;
    }

    public int getCantidadCaballosFuerza() {
        return cantidadCaballosFuerza;
    }

    public void setCantidadCaballosFuerza(int cantidadCaballosFuerza) {
        this.cantidadCaballosFuerza = cantidadCaballosFuerza;
    }
    
    @Override
    public String presentarse(){
        return "Hola soy un auto y mi marca es " + getMarca(); 
    }
}
