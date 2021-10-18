
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class EjercicioMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        
        /*
        Ejercicio 1:
        
        Llevar a cabo un programa que permite cargar completamente con números 5 una matriz de 4x5 (4 filas, 5 columnas).
        
        int matriz [][] = new int [4][5];
        int i , j;
        
        for(i = 0; i < 4; i++){
            for(j = 0; j < 5; j++){
                matriz[i][j] = 5;
            }
        }
        
        for(i = 0; i < 4; i++){
          
            for(j = 0; j < 5; j++){
               // System.out.println("El valor de la posicion f: "+ i + " c: "+j + " es de "+ matriz[i][j] );
               System.out.print(matriz[i][j]+" ");
               
            }
            System.out.println(i);
        }
        */
        
        
        /*
        Ejercicio 2:
        Llevar a cabo un programa que permita completar con números 1 toda la diagonal principal
        de una matriz de 6 x 6. Entiéndase por diagonal principal aquella que comienza en [0,0] y
        termina en [6,6].
        
        int matriz[][] = new int[6][6];
        int f , c;
        
        for(f = 0; f < 6; f++){
            for(c = 0; c < 6; c++){
                if(f == c){
                    matriz[f][c] = 1;
                }else{
                    matriz[f][c] = 5;
                }
            }
        }
        
        for(f = 0; f < 6; f++){
            for(c = 0; c < 6; c++){
                System.out.println("El valor de la posicion f: "+f + " c: "+ c + " es de: "+matriz[f][c]);
            }
        }
        */
        
        /*
        Ejercicio 3:
        Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 (3 filas,
        3 columnas) con razas de perros. Una vez cargada, se debe permitir al usuario ingresar por
        teclado una raza de perro que quiera buscar; el programa deberá poder encontrarla y
        mostrar un mensaje con la posición (fila, columna) donde la encontró. En caso de que la
        raza de perro no se encuentre en la matriz, se deberá informar la situación mediante un
        mensaje por pantalla.
        
        String razas[][] = new String[3][3];
        int f , c, cont = 1;
        String razaBuscada;
       
        
        //Cargo los valores en la matriz
        for(f = 0; f < 3; f++){
            for(c = 0; c < 3; c++){
                System.out.println("Ingrese la raza de perro: ");
                razas[f][c] = entrada.nextLine();
                cont++;
            }
        }
        
        //Muestro los valores por pantalla
        for(f = 0; f < 3; f++){
            for(c = 0; c < 3; c++){
                System.out.println("F: "+f+ " C: "+ c + " Valor: "+ razas[f][c]);
            }
        }
        
        //Pido una raza a buscar
        System.out.println("Que raza quiere buscar? ");
        razaBuscada = entrada.nextLine();
        
        //Recorro la matriz buscando la palabra;
        for(f = 0; f < 3; f++){
            for(c = 0; c < 3; c++){
                if(razaBuscada.equals(razas[f][c])){
                    System.out.println("Tu raza se encuentra en la fila "+ f + " columna "+ c);
                } else {
                   cont--;
                }
            }
        }
        if(cont == 1){
            System.out.println("No se encuentra tu raza");
        }
        */
        
        
        
        /*
        Ejercicio 4:
        En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario.
        Cada fila corresponde a las notas y al promedio de cada alumno.
            i. Se necesita un programa que permita a un profesor cargar en las 3 primeras
               posiciones de cada fila las notas del alumno y que en la última columna se calculen los promedios.
            ii. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el
                promedio correspondiente recorriendo la matriz
       
        
        double notas[][] = new double[4][4];
        int f, c  ;
        double suma = 0, promedio;
        
        for(f = 0; f < 4; f++){   //Recorro la matriz
            for(c = 0; c < 4 ; c++){
                if(c < 3){    //Si la columna no es la ultima, ingreso las notas
                    System.out.println("Ingrese las notas del alumno "+f);
                    
                    notas[f][c] = entrada.nextDouble();
                    suma = suma + notas[f][c];
                }
                if(c == 3){     // Cuando llego a la ultima columna calculo el promedio y luego vuelvo a inicializar en 0 la suma.
                    promedio = suma / 3;
                    notas[f][c] = promedio;
                    suma = 0;
                   
                }
            }
        }
        
        //Muestro la Matriz
        for(f = 0; f < 4 ; f++){
            for(c = 0; c < 4; c++){
               
                System.out.println("F: "+f+" C: "+c+ " el valor es: "+notas[f][c]);
                
            }
        }
        */
        
        /*
        Ejercicio 5:
        Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno
        por la mañana, otro al mediodía y otro por la noche. Para administrar estos datos, utiliza
        una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de
        asientos disponibles
        
        i. Se necesita un programa que permita la carga de la matriz con la cantidad de
            asientos para cada vuelo.
        
        ii. Al mismo tiempo, el programa debe permitir a un usuario ingresar el número de
            destino al que quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la
            mañana, al mediodía o a la noche) y la cantidad de pasajes que necesita.
        
        iii. A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad
            suficiente de asientos para la cantidad de pasajes que se requiere. En caso de que
            así sea, se debe mostrar un cartel por pantalla que diga “su reserva fue realizada
            con éxito” y se debe descontar del total de asientos los solicitados por el usuario. En
            caso de no haber más asientos disponibles, se debe informar otro cartel que diga
            “disculpe, no se pudo completar su operación dado que no hay asientos disponibles”.
        
        Desde la compañía de vuelos manifiestan que NO CONOCEN cuantas ventas/reservas se
        hacen por día. Por lo cual, para finalizar las ventas se ingresa la palabra “finish”
       
        
        int f , c;
        int matriz[][] = new int[6][3];
        String opcion;
        
        for(f = 0; f < 6; f++){
            for(c = 0; c < 3; c++){
                
                System.out.println("Ingrese la cantidad de asientos disponibles: ");
                matriz[f][c] = entrada.nextInt();
                
            }
        }
        
        for(f = 0; f < 6; f++){
            for(c = 0; c < 3; c++){
                System.out.print(matriz[f][c] + " ");
                
            }
            System.out.println(f);
        }
        
        //Permitimos al usuario ingresar el destino y el vuelo.
         System.out.println("Bienvenido, Ingrese una opcion: ");
         System.out.println("\t1- Ingrese su destino >> ");
         System.out.println("\t2- Ingrese el turno >> ");
         System.out.println("\t3- cantidad de pasajes >> ");
         System.out.println("\tfinish - salir del programa ");
         
         
        opcion = entrada.nextLine();
         
         if(opcion == "finish"){
             System.out.println("Usted quiere abandonar el programa");
         }
        */
        
    }
}
