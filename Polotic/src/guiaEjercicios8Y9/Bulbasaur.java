
package guiaEjercicios8Y9;


public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur(int num_pokedex, int temporadaQueAparece, double pesoPokemon, String nombrePokemon, String sexo, String tipo) {
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
    public void atacarParalizar() {
        System.out.println(getNombrePokemon() + " usó Paralizar");
    }

    @Override
    public void atacarDrenaje() {
                System.out.println(getNombrePokemon() + " usó Drenaje");

    }

    @Override
    public void atacarHojaAfilada() {
                System.out.println(getNombrePokemon() + " usó Hoja Afilada");

    }

    @Override
    public void atacarLatigoCepa() {
                System.out.println(getNombrePokemon() + " usó Latigo Cepa");

    }
    
}
