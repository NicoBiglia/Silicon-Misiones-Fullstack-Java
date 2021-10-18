
package guiaEjercicios8Y9;

public abstract class Pokemon {
    
    private int num_pokedex, temporadaQueAparece;
    private double  pesoPokemon ;
    private String nombrePokemon, sexo, tipo;

    public Pokemon(int num_pokedex, int temporadaQueAparece, double pesoPokemon, String nombrePokemon, String sexo, String tipo) {
        this.num_pokedex = num_pokedex;
        this.temporadaQueAparece = temporadaQueAparece;
        this.pesoPokemon = pesoPokemon;
        this.nombrePokemon = nombrePokemon;
        this.sexo = sexo;
        this.tipo = tipo;
    }
    

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public int getTemporadaQueAparece() {
        return temporadaQueAparece;
    }

    public void setTemporadaQueAparece(int temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract void atacarPlacaje();
    
    public abstract void atacarArañazo();
    
    public  abstract void atacarMordisco();
}
