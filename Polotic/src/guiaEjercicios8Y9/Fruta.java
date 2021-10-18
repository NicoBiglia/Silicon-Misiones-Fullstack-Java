
package guiaEjercicios8Y9;

/**
 *
 * @author Nico Biglia
 */
public class Fruta {
    
    /*
    Crear una clase llamada Fruta, que tenga los siguientes atributos: nombre, color, calorías, tipoCascara, esComestible (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
        ✓ Crear un vector de tipo Fruta que pueda almacenar 5 frutas. Crear 5 frutas y guardarlas en el vector.
        ✓ Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las frutas almacenadas.
        ✓ Cambiar todos los datos de dos frutas. Mostrar por pantalla los datos de todas las frutas luego del cambio.
        ✓ Recorrer el vector y mostrar por pantalla únicamente a las frutas que sean de color verde.
    */
    
    private String nombre, color, tipoCascara;
    private double calorias;
    private boolean esComestible;

    public Fruta(String nombre, String color, String tipoCascara, double calorias, boolean esComestible) {
        this.nombre = nombre;
        this.color = color;
        this.tipoCascara = tipoCascara;
        this.calorias = calorias;
        this.esComestible = esComestible;
    }

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

    public String getTipoCascara() {
        return tipoCascara;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public boolean isEsComestible() {
        return esComestible;
    }

    public void setEsComestible(boolean esComestible) {
        this.esComestible = esComestible;
    }
    
    
}
