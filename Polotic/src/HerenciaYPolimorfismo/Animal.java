
package HerenciaYPolimorfismo;

/**
 *
 * @author Nico Biglia
 */
public class Animal {

    public Animal(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }
    
    
    private String nombre, color, raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre = " + nombre + ", color = " + color + " , raza = " + raza + '}';
    }
    
    
}
