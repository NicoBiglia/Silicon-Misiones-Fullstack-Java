
package guiaEjercicios8Y9;

public class Vehiculo {
   
    private String patente, motor, color, marca , modelo;
    private int numChasis, cantAsientos;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String motor, String color, String marca, String modelo, int numChasis, int cantAsientos) {
        this.patente = patente;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.numChasis = numChasis;
        this.cantAsientos = cantAsientos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(int numChasis) {
        this.numChasis = numChasis;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
    
    public String presentarse() {
        return "Hola soy un vehiculo";
    }
}
