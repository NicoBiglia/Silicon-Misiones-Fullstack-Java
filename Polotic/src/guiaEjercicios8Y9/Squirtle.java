
package guiaEjercicios8Y9;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle(int num_pokedex, int temporadaQueAparece, double pesoPokemon, String nombrePokemon, String sexo, String tipo) {
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
    public void atacarHidrobomba() {
        System.out.println(getNombrePokemon() + " usó Hidro Bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(getNombrePokemon() + " usó Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println(getNombrePokemon() + " usó Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println(getNombrePokemon() + " usó Hidropulso");
    }
    
}
