
package guiaEjercicios8Y9;

/**
 *
 * @author Nico Biglia
 */

/*
Crear una clase llamada VideoJuego, que tenga los siguientes atributos: codigo, titulo, consola, cantidadJugadores, categoría (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
✓ Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. Crear 5 videojuegos y guardarlos en el vector.
✓ Recorrer el vector creado y mostrar por pantalla el titulo, consola y cantidad de jugadores de los videojuegos almacenados.
✓ Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar por pantalla los datos de todos los videojuegos luego del cambio.
✓ Recorrer el vector y mostrar por pantalla únicamente a los videojuegos que sean de la consola “Nintendo 64”.
*/

public class Videojuego {
    private String codigo, titulo, consola, categoría;
    private int cantidadJugadores;

    public Videojuego(String codigo, String titulo, String consola, String categoría, int cantidadJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.categoría = categoría;
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }
    
    
}
