
package guiaEjercicios7;

/*
 * @author Nicolas Biglia
 */

/*
Crear una clase llamada Auto, que tenga los siguientes atributos: color, marca, modelo,
patente, cantidad de puertas (tener en cuenta todos sus atributos, constructores y métodos
getters y setters).
✓ Crear 3 objetos Auto utilizando parámetros
✓ Crear 1 objeto Auto sin parámetros.
✓ Mostrar por pantalla la marca, modelo y patente de los 3 autos creados con
parámetros.
✓ Intentar obtener la marca del auto creado sin parámetros. ¿Se obtiene algún valor?
De ser así… ¿Qué valor se obtiene

*/
public class Auto {
    private String color, marca , modelo , patente ;
    private int cantidadPuertas; 

    public Auto(String color, String marca, String modelo, String patente, int cantidadPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
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

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
}
