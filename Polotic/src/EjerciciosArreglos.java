
import java.util.Scanner;


/**
 *
 * @author Nicolas Biglia
 */
public class EjerciciosArreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 
        Ejercicio 1:
        Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa, Ludmila
        Realizar un recorrido para cargar los mismos y mostrarlos por pantalla.
        
        
        String arreglo[] = {"Alejandra", "Leonardo", "Rosa", "Guillermo", "Gabriel", "Daniel", "Luisa", "Ludmila"};
        
        for (int i = 0; i < arreglo.length; i++){
            System.out.println(" "+arreglo[i]);
        }
        */
        
        
        /*
        Ejercicio 2:
        Realizar un programa que permita cargar 10 numeros en un vector.
        Una vez cargados, se necesita que el programa determine cual es el mayor y cual es el menor.
        
        
        int arreglo[] = new int [10];
        int i , mayor = -50000 , menor = 50000000;
        System.out.println("Ingrese 10 numeros: ");
        for(i = 0; i < arreglo.length; i++){
            arreglo[i] = entrada.nextInt();
        }
        
        for(i = 0; i < arreglo.length; i++){
            if(arreglo[i] > mayor){
                mayor = arreglo[i];
            }
            if(arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        
        System.out.println("El numero menor es: "+ menor + " y el numero mayor es: " + mayor);
        */
        
        /*
        Ejercicio 3:
        Realizar un programa que permita la carga de 15 numeros en un vector.
        Una vez cargados, se necesita que el programa cuente e informe por pantalla cuantas veces 
        se cargo el numero 3.
        
        
        int contadorNumero3 = 0 , i;
        int arreglo[] = new int [15];
        
        System.out.println("Ingrese 15 numeros: ");
        for(i = 0; i < arreglo.length; i++){
            arreglo[i] = entrada.nextInt();
        }
        
        for(i = 0; i < arreglo.length; i++){
            if(arreglo[i] == 3){
                contadorNumero3++;
            }
        }
        
        System.out.println("El numero 3 se ingreso "+contadorNumero3 + " veces");
        */
        
        /*
        Ejercicio 4:
        Un empleado desea almacenar en un vector sus 12 sueldos del año.
        A partir de esto, necesita un programa que determine y muestre por pantalla
        la suma total de sus 12 sueldos y el promedio que tuvo en el año.
        
        int suma = 0;
        double promedio = 0;
        int sueldos [] = new int [12];
        String meses [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        for(int i = 0; i< sueldos.length; i++){
            System.out.println("Ingrese el sueldo de "+ meses[i]);
            sueldos[i] = entrada.nextInt();
            suma = suma + sueldos[i];
        }
        
        for(int i = 0; i < sueldos.length; i++){
            System.out.println("El sueldo de "+meses[i]+ " es de: "+sueldos[i]);
        }
        
        promedio = suma / 12;
        
        System.out.println("La sumatoria total es: $ "+suma);
        System.out.println("El sueldo promedio anual es: $ "+promedio);
        */
        
        /*
        Ejercicio 5:
        En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas
        de 5 ciudades del Pais. En el primer vector se guardan los nombres de
        las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las
        temperaturas máximas alcanzadas en la última semana. Se necesita un programa que
        permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá
        poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la
        temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).

        
        String nombres[] = new String[5];
        double tempMax[] = new double[5], tempMin[] = new double[5];
        int i;
        double minima = 1000, maxima = -1000;
        String ciudadMaxima = null, ciudadMinima = null;
        
        //Recorro los tres arreglos cargando los datos correspondientes
        for(i = 0; i < nombres.length ; i++){
            System.out.println("Ingrese el nombre de la ciudad Nro "+ i);
            nombres[i] = entrada.nextLine();
            System.out.println("Ingrese la temperatura maxima: ");
            tempMax[i] = entrada.nextDouble();
            System.out.println("Ingrese la temperatura minima: ");
            tempMin[i] = entrada.nextDouble();
            entrada.nextLine();
        }
        
        for(i = 0; i < nombres.length ; i++){
            System.out.println("En "+nombres[i]+" hace una temperatura minima de "+tempMin[i]+" y una maxima de "+tempMax[i] );
            if(tempMax[i] > maxima){
                maxima = tempMax[i];
                ciudadMaxima = nombres[i];
            }
            if(tempMin[i] < minima){
                minima = tempMin[i];
                ciudadMinima = nombres[i];
            }
        }
        
        System.out.println("La ciudad con la temperatura mas alta es "+ ciudadMaxima + ", y la temperatura fue de "+maxima+ " grados");
        System.out.println("La ciudad con la temperatura mas alta es "+ ciudadMinima + ", y la temperatura fue de "+minima+ " grados");
        */  
    }
}
