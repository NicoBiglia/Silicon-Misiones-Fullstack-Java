
package guiaEjercicios8Y9;

public class Colectivo extends Vehiculo {
    
    private boolean aptoParaDiscapacitados, poseeLectorSube;
    private String tipoColectivo;

    public Colectivo(boolean aptoParaDiscapacitados, boolean poseeLectorSube, String tipoColectivo, String patente, String motor, String color, String marca, String modelo, int numChasis, int cantAsientos) {
        super(patente, motor, color, marca, modelo, numChasis, cantAsientos);
        this.aptoParaDiscapacitados = aptoParaDiscapacitados;
        this.poseeLectorSube = poseeLectorSube;
        this.tipoColectivo = tipoColectivo;
    }

    public boolean isAptoParaDiscapacitados() {
        return aptoParaDiscapacitados;
    }

    public void setAptoParaDiscapacitados(boolean aptoParaDiscapacitados) {
        this.aptoParaDiscapacitados = aptoParaDiscapacitados;
    }

    public boolean isPoseeLectorSube() {
        return poseeLectorSube;
    }

    public void setPoseeLectorSube(boolean poseeLectorSube) {
        this.poseeLectorSube = poseeLectorSube;
    }

    public String getTipoColectivo() {
        return tipoColectivo;
    }

    public void setTipoColectivo(String tipoColectivo) {
        this.tipoColectivo = tipoColectivo;
    }
    
    @Override
    public String presentarse(){
        return "Hola soy un colectivo y mi cantidad de asientos es " + getCantAsientos(); 
    }
}
