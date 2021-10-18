/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaEjercicios8Y9;

/**
 *
 * @author Asus
 */
public class Moto extends Vehiculo {
    
    private int cilindrada;
    private String materialManubrio;

    public Moto(int cilindrada, String materialManubrio, String patente, String motor, String color, String marca, String modelo, int numChasis, int cantAsientos) {
        super(patente, motor, color, marca, modelo, numChasis, cantAsientos);
        this.cilindrada = cilindrada;
        this.materialManubrio = materialManubrio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMaterialManubrio() {
        return materialManubrio;
    }

    public void setMaterialManubrio(String materialManubrio) {
        this.materialManubrio = materialManubrio;
    }
    
    @Override
    public String presentarse(){
        return "Hola soy una moto y mi cilindrada es " + getCilindrada(); 
    }
}
