/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaYPolimorfismo;

/**
 *
 * @author Asus
 */
public class Mamifero extends Animal {
    
    public Mamifero(String nombre, String color, String raza) {
        super(nombre, color, raza);
    }
    
    public boolean esCarnivoro, esHervivoro, esOvnivoro;
    
    public void correr(){
        System.out.println("Soy un "+ this.getNombre() + " y estoy corriendo");
    }

    public boolean isEsCarnivoro() {
        return esCarnivoro;
    }

    public void setEsCarnivoro(boolean esCarnivoro) {
        this.esCarnivoro = esCarnivoro;
    }

    public boolean isEsHervivoro() {
        return esHervivoro;
    }

    public void setEsHervivoro(boolean esHervivoro) {
        this.esHervivoro = esHervivoro;
    }

    public boolean isEsOvnivoro() {
        return esOvnivoro;
    }

    public void setEsOvnivoro(boolean esOvnivoro) {
        this.esOvnivoro = esOvnivoro;
    }
    
    
}
