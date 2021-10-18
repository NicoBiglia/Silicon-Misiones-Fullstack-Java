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
public class Main {
    public static void main(String[] args) {
        
        Animal vaca = new Animal("Vaca", "Blanco y Negro", "Vaca comun");
        
        System.out.println(vaca.toString());
        
        Mamifero perro = new Mamifero("Perro", "Marron", "Chihuahua");
        
        perro.esOvnivoro = true;
        
        System.out.println(perro.toString() + " " + perro.esOvnivoro);
    }
}
