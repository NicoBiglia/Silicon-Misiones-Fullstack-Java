
package guiaEjercicios8Y9;

/**
 *
 * @author Nico Biglia
 */

/*
Crear una clase Planta con los atributos: nombre, alto del tallo, tieneHojas, clima ideal. (con sus métodos y constructores correspondientes)
• Crear sus clases hijas que compartan sus atributos y métodos:
    o Árbol: variedad, tipo de tronco, radio de tronco, color, tipo de hojas.
    o Flor: color de pétalos, cantidad promedio de pétalos, color del pistilo, color de los pétalos, variedad de flor, estación que florece
    o Arbusto: Ancho arbusto, esDomestico, variedad arbusto, color de hojas, sePodaONo
*/

public class Planta {
    private String nombre, alturaTallo, climaIdeal;
    private boolean tieneHojas;

    public Planta(String nombre, String alturaTallo, String climaIdeal, boolean tieneHojas) {
        this.nombre = nombre;
        this.alturaTallo = alturaTallo;
        this.climaIdeal = climaIdeal;
        this.tieneHojas = tieneHojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlturaTallo() {
        return alturaTallo;
    }

    public void setAlturaTallo(String alturaTallo) {
        this.alturaTallo = alturaTallo;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }
    
    
}
