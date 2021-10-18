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
public class Arbusto extends Planta {
    
    private String variedadArbusto, colorHojas;
    private double ancho;
    private boolean esDomestico, sePodaONo;

    public Arbusto(String variedadArbusto, String colorHojas, double ancho, boolean esDomestico, boolean sePodaONo, String nombre, String alturaTallo, String climaIdeal, boolean tieneHojas) {
        super(nombre, alturaTallo, climaIdeal, tieneHojas);
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.sePodaONo = sePodaONo;
    }

    

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
    
    public void mensaje(){
        System.out.println("Hola soy un arbusto");
    }
}
