
package guiaEjercicios8Y9;


public class Charmander extends Pokemon implements IFuego{

    public Charmander(int num_pokedex, int temporadaQueAparece, double pesoPokemon, String nombrePokemon, String sexo, String tipo) {
        super(num_pokedex, temporadaQueAparece, pesoPokemon, nombrePokemon, sexo, tipo);
    }

   @Override
    public void atacarPlacaje() {
        System.out.println(getNombrePokemon() + " usó Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println(getNombrePokemon() + " usó Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println(getNombrePokemon() + " usó Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println(getNombrePokemon() + " usó Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
       System.out.println(getNombrePokemon() + " usó Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println(getNombrePokemon() + " usó Lanzallamas");
    }
    
}
