
package guiaEjercicios8Y9;

public class PlayStation2 extends Consola{
    
    private String norma, tamañoMemoryCard;
    private boolean esChipeada;

    public PlayStation2(String norma, String tamañoMemoryCard, boolean esChipeada, String codigoConsola, String nombre, String empresaDesarrollo, int añoLanzamiento) {
        super(codigoConsola, nombre, empresaDesarrollo, añoLanzamiento);
        this.norma = norma;
        this.tamañoMemoryCard = tamañoMemoryCard;
        this.esChipeada = esChipeada;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public String getTamañoMemoryCard() {
        return tamañoMemoryCard;
    }

    public void setTamañoMemoryCard(String tamañoMemoryCard) {
        this.tamañoMemoryCard = tamañoMemoryCard;
    }

    public boolean isEsChipeada() {
        return esChipeada;
    }

    public void setEsChipeada(boolean esChipeada) {
        this.esChipeada = esChipeada;
    }
    
    public String leerDvd(String juego){
        return "Leyendo DVD "+ juego;
    }
    
    public String grabarEnMemory(){
        return "Se han guardado los datos correctamente";
    }
}
