
package guiaEjercicios8Y9;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(int num_pokedex, int temporadaQueAparece, double pesoPokemon, String nombrePokemon, String sexo, String tipo) {
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
    public void atacarImpactrueno() {
        System.out.println(getNombrePokemon() + " usó Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(getNombrePokemon() + " usó Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println(getNombrePokemon() + " usó Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(getNombrePokemon() + " usó Rayo Carga");
    }
    
}
