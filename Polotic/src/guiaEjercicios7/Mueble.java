
package guiaEjercicios7;

/**
 *
 * @author Nico Biglia
 */

/*
 Crear una clase llamada Mueble que tenga los siguientes atributos: nombre, alto, ancho,
material, cantidad.
✓ Crear 3 muebles utilizando parámetros.
✓ Mostrar por pantalla el nombre y el material de los 3 muebles.
✓ Colocar “Madera” como material de los 3 muebles creados.
✓ Mostrar nuevamente por pantalla el nombre y el material de los 3 muebles que
fueron cambiados.
*/
public class Mueble {
    private String nombre, material ;
    private double alto , ancho;
    private int cantidad;

    public Mueble(String nombre, String material, double alto, double ancho, int cantidad) {
        this.nombre = nombre;
        this.material = material;
        this.alto = alto;
        this.ancho = ancho;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Mueble {" + "nombre = " + nombre + ", material = " + material + '}';
    }
    
    
}
