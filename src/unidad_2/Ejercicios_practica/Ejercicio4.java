package unidad_2.Ejercicios_practica;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vectorNumeros = new int[10];
        int contador_numeros =0;
        System.out.println("ingrese numeros aleatorios");
        for(int i =0;i<vectorNumeros.length;i++){
            int numero =scanner.nextInt();// en esta variable se ingresa el numero aleatorio
            if(numero<0){// si algun numero es negativo el for se rompe
             break;
            }
            vectorNumeros[i]=numero;// aqui almacenamos cada numero aleatorio
            contador_numeros++;// y aqui contamos cuantos numeros ingresamos hasta que se termine o rompa el for
        }
        for(int i=0;i<contador_numeros;i++){
            System.out.println(vectorNumeros[i]);// aqui simplemente mostramos los numeros 
        }
        scanner.close();

    }
}
