
package guiaEjercicios7;

/**
 * @author Nicolas Biglia
 */
public class Main {
    public static void main(String[] args) {
        Auto honda = new Auto("Blanco Perlado", "Honda", "CRV", "HRB 602", 5);
        Auto peugeot = new Auto("Negro", "Peugeot", "207", "BVE 125", 3);
        Auto fiat = new Auto("Gris", "Fiat", "Siena", "FFL 742", 5);
       // Auto vacio = new Auto();
        
        System.out.println("El auto numero 1 es un "+ honda.getMarca() + " "+ honda.getModelo() + " con patente "+ honda.getPatente());
        System.out.println("El auto numero 2 es un "+ peugeot.getMarca() + " "+ peugeot.getModelo() + " con patente "+ peugeot.getPatente());
        System.out.println("El auto numero 3 es un "+ fiat.getMarca() + " "+ fiat.getModelo() + " con patente "+ fiat.getPatente());
        
        System.out.println("");
        //System.out.println(vacio.getMarca());
        
        Mueble sillon = new Mueble("Sillon", "Tela", 1.54 , 2.30 , 10);
        Mueble mesa = new Mueble("Mesa", "Roble", 2.20 , 2.40 , 18);
        Mueble silla = new Mueble("Silla", "Madera", 1.40 , 0.60 , 40);
        
        System.out.println(sillon.toString());
        System.out.println(mesa.toString());
        System.out.println(silla.toString());
        
        sillon.setMaterial("Madera");
        mesa.setMaterial("Madera");
        
        System.out.println(sillon.toString());
        System.out.println(mesa.toString());
        System.out.println(silla.toString());
        
        System.out.println("");
        
        Mascota pug = new Mascota("Sara", "Perro", "Hembra", "Atigrado", "Pelo Corto", "Pug");
        Mascota albino = new Mascota("Tobiano", "Caballo", "Macho", "Blanco", "Corto", "Bayo");
        Mascota garfield = new Mascota("Garfield", "Gato", "Macho", "Naranja", "Pelo semilargo", "Tigrado");
        Mascota twitty = new Mascota("Tweety", "Canario", "Macho", "Amarillo", "Plumas", "Canario amarillo");
        Mascota pochita = new Mascota("Pochi", "Perro", "Hembra", "Blanco", "Rulos", "Caniche");
        
        Mascota mascotas[] = new Mascota[5];
        
        mascotas[0] = pug;
        mascotas[1] = albino;
        mascotas[2] = garfield;
        mascotas[3] = twitty;
        mascotas[4] = pochita;
        
        for(Mascota mascota : mascotas){
            System.out.println(mascota.getNombre() + " es un "+ mascota.getEspecie() + " " + mascota.getSexo()
            + " y de raza "+ mascota.getRaza());
        }
        
        pochita.setNombre("Enanis");
        albino.setNombre("Spirit");
        System.out.println("");
        System.out.println(pochita.toString());
        System.out.println(albino.toString());
        
        System.out.println("");
        
        for(Mascota animales : mascotas){
            if(animales.getEspecie().equals("Perro")){
                System.out.println(animales.toString());
            }
        }
    }      
}
