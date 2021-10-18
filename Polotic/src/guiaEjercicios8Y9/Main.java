
package guiaEjercicios8Y9;

/**
 *
 * @author Nico Biglia
 */
public class Main {
    public static void main(String[] args) {
        
        /*
        
        Crear una clase llamada VideoJuego, que tenga los siguientes atributos: codigo, titulo, consola, cantidadJugadores, categoría (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
        ✓ Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. Crear 5 videojuegos y guardarlos en el vector.
        ✓ Recorrer el vector creado y mostrar por pantalla el titulo, consola y cantidad de jugadores de los videojuegos almacenados.
        ✓ Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar por pantalla los datos de todos los videojuegos luego del cambio.
        ✓ Recorrer el vector y mostrar por pantalla únicamente a los videojuegos que sean de la consola “Nintendo 64”.
        

        Videojuego crashBandicoot = new Videojuego("31PW", "Crash Bandicoot", "PlayStation 1", "Aventura", 1);
        Videojuego superMario = new Videojuego("32ND", "Super Mario Bros", "Super Nintendo", "Aventura", 2);
        Videojuego wow = new Videojuego("o9i2", "World of Warcraft", "PC", "MMORPG", 1);
        Videojuego pokemonRojo = new Videojuego("33sd", "Pokemon Rojo Fuego", "Nintendo Gameboy Advance", "RPG", 1);
        Videojuego mario64 = new Videojuego("31mr", "Super Mario 64", "Nintendo 64", "Aventura", 1);
        
        Videojuego juegos[] = new Videojuego[5]; 
        
        juegos[0] = crashBandicoot;
        juegos[1] = superMario;
        juegos[2] = wow;
        juegos[3] = pokemonRojo;
        juegos[4] = mario64;
        
        for(int i = 0; i < juegos.length; i++){
            System.out.println("El juego "+ juegos[i].getTitulo()+ " pertenece a la consola "+ 
                    juegos[i].getConsola()+ " y puede ser jugado hasta por "+ juegos[i].getCantidadJugadores()+ " jugador/es.");
        }
        
        crashBandicoot.setTitulo("PES2006");
        crashBandicoot.setCantidadJugadores(4);
        crashBandicoot.setCategoría("Deportes");
        superMario.setTitulo("Super Metroid");
        superMario.setCantidadJugadores(1);
        superMario.setConsola("Nintendo 64");
        
        System.out.println("");
        
        for(int i = 0; i < juegos.length; i++){
            System.out.println("El juego "
                    + juegos[i].getTitulo()+ " pertenece a la consola "
                    + juegos[i].getConsola()+" su categoria es "
                    + juegos[i].getCategoría() +" y puede ser jugado hasta por "
                    + juegos[i].getCantidadJugadores()+ " jugador/es.");
        }
        
        System.out.println("");
        
        for(int i = 0; i < juegos.length; i++) {
            if(juegos[i].getConsola().equals("Nintendo 64")){
                System.out.println("El juego "
                    + juegos[i].getTitulo()+ " pertenece a la consola "
                    + juegos[i].getConsola());
            }
        }
        */
        /*
        Crear una clase llamada Fruta, que tenga los siguientes atributos: nombre, color, calorías, tipoCascara, esComestible (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
        ✓ Crear un vector de tipo Fruta que pueda almacenar 5 frutas. Crear 5 frutas y guardarlas en el vector.
        ✓ Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las frutas almacenadas.
        ✓ Cambiar todos los datos de dos frutas. Mostrar por pantalla los datos de todas las frutas luego del cambio.
        ✓ Recorrer el vector y mostrar por pantalla únicamente a las frutas que sean de color verde.
        
        
        Fruta melon = new Fruta("Melon", "Amarillo", "Dura", 300.65, true );
        Fruta manzana = new Fruta("Manzana", "Rojo", "Blanda", 70 , true );
        Fruta limon = new Fruta("Limon", "Amarillo", "Rugosa", 90, true );
        Fruta frutilla = new Fruta("Frutilla", "Rojo", "Blanda", 20, true );
        Fruta sandia = new Fruta("Sandia", "Verde", "Dura", 450.57, true );
        
        Fruta frutas[] = new Fruta[5];
        
        frutas[0] = melon;
        frutas[1] = manzana;
        frutas[2] = limon;
        frutas[3] = frutilla;
        frutas[4] = sandia;
        
        for(int i = 0; i < frutas.length; i++){
            System.out.println("La fruta "+ frutas[i].getNombre()+ " tiene "+ 
                    frutas[i].getCalorias()+ " calorias.");
        }
          
        melon.setNombre("Durazno");
        melon.setColor("Naranja");
        melon.setTipoCascara("Pelusita");
        melon.setCalorias(95.64);
        melon.setEsComestible(true);
        
        frutilla.setNombre("Tomate");
        frutilla.setColor("Rojo");
        frutilla.setTipoCascara("Blanda");
        frutilla.setCalorias(45.32);
        frutilla.setEsComestible(true);
        
        
        System.out.println("");
        
        for(int i = 0; i < frutas.length; i++){
            System.out.println("La Fruta "
                    + frutas[i].getNombre()+ " es de color "
                    + frutas[i].getColor()+" tiene "
                    + frutas[i].getCalorias() +" calorias y su cascara es "
                    + frutas[i].getTipoCascara());
        }
        
        System.out.println("");
        
         for(int i = 0; i < frutas.length; i++){
            if(frutas[i].getColor() == "Verde"){
             System.out.println("La fruta "+ frutas[i].getNombre()+ " es de color "+ frutas[i].getColor());
            }
        }
        */
        
        /*
        
        2) Herencia, Polimorfismo y encapsulamiento
        
        Ejercicio Nº 1
        • Crear una clase Planta con los atributos: nombre, alto del tallo, tieneHojas, clima ideal. (con sus métodos y constructores correspondientes)
        • Crear sus clases hijas que compartan sus atributos y métodos:
            o Árbol: variedad, tipo de tronco, radio de tronco, color, tipo de hojas.
            o Flor: color de pétalos, cantidad promedio de pétalos, color del pistilo, color de los pétalos, variedad de flor, estación que florece
            o Arbusto: Ancho arbusto, esDomestico, variedad arbusto, color de hojas, sePodaONo
        • Una vez creada las clases crear los siguientes métodos:
            o Árbol: método para mostrar un mensaje en pantalla que diga “Hola soy un árbol”
            o Flor: método para mostrar un mensaje en pantalla que diga “Hola soy una flor”
            o Arbusto: método para mostrar un mensaje en pantalla que diga “Hola soy un arbusto”
        • Crear en el Main un objeto de cada clase hija. Llamar a los 3 métodos desde cada objeto.
        • Cambiar el modificador de acceso de los métodos de public a private. Intentar acceder desde el main a estos métodos.
        
        Arbol arbol = new Arbol("secoya", "grueso", "verde", "grandes", 20.5, "arbolSecoya", "20metros", "verano", true);
        Arbusto arbusto = new Arbusto("zarza", "negras", 4, true, false, "zarza espinosa", "2", "invierno", false);
        Flor flor = new Flor("azul", "amarillo", "flor de boquita", "primavera", 30.5, "Flor Boca", "15", "caluroso", true);
        
        arbol.mensaje();
        arbusto.mensaje();
        flor.mensaje();
        
        */
        
        /*
        Ejercicio Nº 2
        • Crear una clase Vehiculo con los atributos: patente, num de chasis, motor, color, marca, modelo cantidad de asientos (con sus métodos y constructores correspondientes).
        • Crear sus clases hijas que compartan sus atributos y métodos:
            o Auto: materialasientos, cantidad_caballos
            o Moto: cilindrada, material_manubrio
            o Colectivo: aptoDiscapacitados, poseeLectorSube, tipoColectivo
            o Camion: tieneAcoplado, cantidadEjes
        • Una vez creada las clases, crear en el Main un vector de tipo Vehículo y almacenar 3 autos, 3 motos, 2 colectivos y 1 camión (crear un objeto para cada uno de ellos).
        • Crear los siguientes métodos (en cada subclase correspondiente):
            o Auto: método para mostrar un mensaje en pantalla que diga “Hola soy un auto y mi marca es: ” (mostrar marca)
                    o Moto: método para mostrar un mensaje en pantalla que diga “Hola soy una moto y mi cilindrada es de: ” (mostrar cilindrada)
            o Colectivo: método para mostrar un mensaje en pantalla que diga “Hola soy un colectivo y mi cantidad de asientos es de: ” (mostrar cantidad de asientos).
            o Camion: método para mostrar un mensaje en pantalla que diga “Hola soy un camión y mi cantidad de Ejes es de: ” (mostrar cantidad de ejes).
        • Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo. 
        
        
        Auto focus = new Auto("Cuero", 300, "AA 32 BF", "V1 ", "Azul", "Ford", "Focus",  154844 , 5);
        Auto palio = new Auto("Tela", 150, "HFV 332", "1.8 ", "Gris", "Fiat", "Palio",  331536 , 3);
        Auto gol = new Auto("Tela", 150, "FTG 758", "1.5 ", "Negro", "Volkswagen", "Gol",  448414 , 3);
        Moto harley = new Moto(220, "Acero", "AB 233 HC", "120 V", "Negro", "Harley Davidson", "205", 3133266, 1);
        Moto zanella = new Moto(80, "Plastico", "No tiene", "60 v", "Gris", "Zanella", "Zanellita", 654433, 1);
        Moto bmw = new Moto(300, "Acero", "AB 133 DS", "220 V", "Negro", "BMW", "255", 377766, 2);
        Colectivo tamse = new Colectivo(true, true, "Trolebus", "BDC 322", "V2 ", "Naranja", "Chevrolet", "Bondix", 84384, 48);
        Colectivo fonobus = new Colectivo(true, false, "Fonobus", "HJK 212", "V1 ", "Naranja", "Chevrolet", "Fono", 112221, 32);
        Camion scania = new Camion(true, 8, "BHH 133", "V3", "Blanco", "Scania", "2200", 458754, 6);
        
        Vehiculo vehiculos[] = new Vehiculo[9];
        
        vehiculos[0] = focus;
        vehiculos[1] = palio;
        vehiculos[2] = gol;
        vehiculos[3] = harley;
        vehiculos[4] = zanella;
        vehiculos[5] = bmw;
        vehiculos[6] = tamse;
        vehiculos[7] = fonobus;
        vehiculos[8] = scania;
        
        for(int i = 0; i < vehiculos.length; i++){
            System.out.println(vehiculos[i].presentarse());
        }
        */
        
        /*
        3) Clases abstractas
        Ejercicio Nº 1
        • Crear una clase abstracta llamada consola, la cual tenga los atributos: codigo_consola, nombre, empresaDesarrollo y año de lanzamiento. Al mismo tiempo, crear un método abstracto “cargarJuego” que indique un mensaje por pantalla que diga “Cargando juego. Por favor espere”.
           A partir de la clase abstracta creada crear las siguientes subclases hijas:
            ✓ Nintendo64: La cual tiene un atributo propio norma y otro para determinar si lee cartuchos piratas. Al mismo tiempo, implementa un método propio “leerCartucho” el cual recibirá el nombre de un juego como parámetro e indicará un mensaje por pantalla indicando esta situación. Por ejemplo: “Leyendo cartucho Banjo Kazooie”.
            ✓ PlayStation2: La cual tiene los atributos propios norma, chipeadaONo y tamañoMemoryCard. Al mismo tiempo, implementa un método propio “leerDvd” el cual recibirá el nombre de un juego como parámetro e indicará un mensaje por pantalla indicando esta situación. Por ejemplo: “Leyendo DVD Fifa 2009”. Por otro lado, también implementa un método propio llamado “grabarEnMemory” el cual debe informar al usuario que se ha guardado correctamente un juego en la memory card.
            ✓ Xbox One: La cual tiene una serie de atributos propios para manejar: Si está conectada a internet o no, si la calidad 4K está activada y si se permite la descarga automática de actualizaciones. Al mismo tiempo implementa un método propio “leerJuegoDigital” el cual recibirá el nombre de un juego como parámetro e indicará un mensaje por pantalla indicando esta situación. Por ejemplo: “Leyendo GTA V desde tienda”.
           Una vez desarrolladas cada una de las clases, se solicita desde la clase Main, crear una instancia de cada una de ellas y llamar a sus correspondientes métodos.7
           Tener en cuenta que todas las consolas, al heredar de una clase abstracta, deben implementar el/los método/s de su clase madre utilizando sobreescritura de métodos.
        
        
        Nintendo64 nintendo = new Nintendo64("Normativa", false , "N37H13", "Super Mario 64", "Nintendo", 2002);
        PlayStation2 play = new PlayStation2("Nose", "30mb", true, "P323LD", "GTA San Andreas", "Sony", 2003);
        XboxOne xbox = new XboxOne(true, true, true, "X832HB", "Halo Infinite", "Microsoft", 2014);
        
        System.out.println(nintendo.leerCartucho("Zelda"));
        System.out.println(nintendo.cargarJuego());
        System.out.println("");
        System.out.println(play.leerDvd("Crash Bandicoot"));
        System.out.println(play.cargarJuego());
        System.out.println(play.grabarEnMemory());
        System.out.println("");
        System.out.println(xbox.cargarJuego());
        System.out.println(xbox.leerJuegoDigital("Gears of War 5"));
        */
        
        /*
        4) Clases Abstractas + Interfaces
        Ejercicio Nº 1
        Un fanático de Pókemon desea implementar para el modelado de un videojuego los diferentes ataques de cada una de estas criaturas. 
        Para ello, cuenta con una clase abstracta llamada Pokemon, la cual posee los atributos: num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece y tipo, 
        e implementa métodos para los ataques comunes que suele tener la mayoría, entre ellos se encuentran: atacarPlacaje(), atacarArañazo() y atacarMordisco(). 
        Sin embargo, este fanático también desarrolló una serie de interfaces para contemplar los ataques de Pókemons de cierto tipo:
            ✓ IElectrico: con los métodos atacarImpactrueno(), atacarPunioTrueno(), atacarRayo(), atacarRayoCarga().
            ✓ IPlanta: con los métodos atacarParalizar(), atacarDrenaje(), atacarHojaAfilada(), atacarLatigoCepa().
            ✓ IFuego: con los métodos atacarPunioFuego(), atacarAscuas(), atacarLanzallamas().
            ✓ IAgua: con los métodos atacarHidrobomba(), atacarPistolaAgua(), atacarBurbuja(), atacarHidropulso().
        A partir de estas interfaces, el Pokefanático desea crear las clases que manejen a los personajes principales del videojuego, los cuales son los pokemons starters de la primera temporada (Charmander, Bulbasaur y Squirtle) y Pikachu; 
        para ello tener en cuenta que: Charmander es de tipo fuego, Bulbasaur es de tipo planta, Squirtle es de tipo agua y Pikachu de tipo eléctrico.
        Una vez implementadas la clase abstracta e interfaces, sobrescribir los métodos correspondientes para adaptarlos a cada Pókemon mostrando un mensaje en pantalla que indique qué pókemon es y qué ataque está realizando, por ejemplo: “Soy Charmander y estoy atacando con Ascuas” o “Soy Pikachu y estoy atacando con placaje”. 
        Luego de realizar lo mencionado, crear las instancias necesarias y llamar a cada uno de los métodos de cada Pokemon.
        
        
        Pikachu pikachu = new Pikachu(25, 1, 7.5, "Pikachu", "Macho", "Electrico");
        Bulbasaur bulbasaur = new Bulbasaur(1, 1, 12, "Bulbasaur", "Macho", "Planta");
        Squirtle squirtle = new Squirtle(4, 1, 10, "Squirtle", "Hembra", "Agua");
        Charmander charmander = new Charmander(7, 1, 9, "Charmander", "Macho", "Fuego");
        
        charmander.atacarLanzallamas();
        charmander.atacarArañazo();
        System.out.println("");
        bulbasaur.atacarArañazo();
        bulbasaur.atacarParalizar();
        System.out.println("");
        pikachu.atacarPlacaje();
        pikachu.atacarPunioTrueno();
        System.out.println("");
        squirtle.atacarPlacaje();
        squirtle.atacarHidrobomba();
        */
    }
}
