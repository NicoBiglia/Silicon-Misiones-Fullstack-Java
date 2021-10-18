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
public class Flor extends Planta {
    
    private String colorPetalos, colorPistillo, variedadFlor , estacionParaFlorecer;
    private double promedioPetalos;

    public Flor(String colorPetalos, String colorPistillo, String variedadFlor, String estacionParaFlorecer, double promedioPetalos, String nombre, String alturaTallo, String climaIdeal, boolean tieneHojas) {
        super(nombre, alturaTallo, climaIdeal, tieneHojas);
        this.colorPetalos = colorPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadFlor = variedadFlor;
        this.estacionParaFlorecer = estacionParaFlorecer;
        this.promedioPetalos = promedioPetalos;
    }

   

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionParaFlorecer() {
        return estacionParaFlorecer;
    }

    public void setEstacionParaFlorecer(String estacionParaFlorecer) {
        this.estacionParaFlorecer = estacionParaFlorecer;
    }

    public double getPromedioPetalos() {
        return promedioPetalos;
    }

    public void setPromedioPetalos(double promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }
    
    public void mensaje(){
        System.out.println("Hola soy una Flor");
    }
    
}
