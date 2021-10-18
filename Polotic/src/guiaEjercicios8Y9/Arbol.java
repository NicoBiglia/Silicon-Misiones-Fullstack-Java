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
public class Arbol extends Planta {
    
    private String variedad, tipoDeTronco, color, tipoDeHojas;
    private double radioDeTronco;

    public Arbol(String variedad, String tipoDeTronco, String color, String tipoDeHojas, double radioDeTronco, String nombre, String alturaTallo, String climaIdeal, boolean tieneHojas) {
        super(nombre, alturaTallo, climaIdeal, tieneHojas);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
        this.radioDeTronco = radioDeTronco;
    }



    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    public double getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }
    
    public void mensaje(){
        System.out.println("Hola soy un arbol");
    }
}
