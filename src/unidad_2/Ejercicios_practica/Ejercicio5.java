package unidad_2.Ejercicios_practica;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros desea ingresar");
        int cantidad_numeros = scanner.nextInt();// se sabe la cantidad exacta de numeros a trabajar
        int[] numeros_aleatorios = new int[cantidad_numeros];
        for(int i =0;i<cantidad_numeros;i++){
            System.out.println(" ingrese el numero #"+(i+1));// se ingresa los numeros aleatorios
         numeros_aleatorios[i]= scanner.nextInt();
        }
        // este for es el principal y se escoge cada posicion del vector y lo comparamos con el resto
        for(int j=0;j<cantidad_numeros;j++){
         int numero_menor =j;// asumimos que el numero menor esta en esa posicion
         for(int i =j+1;i<cantidad_numeros;i++){// en este for recorremos el resto de posiciones para compararlo con el "numero menor"
            
         // aqui verificamos que el numero escogido es menor o no con los demas
         if(numeros_aleatorios[i]<numeros_aleatorios[numero_menor]){
                numero_menor=i; //si se cumple esa condicion el numero menor ahora esta en esa posicion
            }
         }
         int numero_temporal = numeros_aleatorios[j];// aqui usamos esta variable para guaradar el numero original del primer for
         numeros_aleatorios[j]=numeros_aleatorios[numero_menor];// y luego esa posicion del original se cambia osea el numero original se cambia por el menor encontrado
         numeros_aleatorios[numero_menor]=numero_temporal;// y en la posicion que estaba el numero menor ahora su valor es el numero original
        }
        System.out.println("numeros ordenados de menor a mayor");
        System.out.println("----------------------------");
        for(int k =0;k<cantidad_numeros;k++){
            System.out.println(numeros_aleatorios[k]);// y aqui simplemente se muestra de forma ordenada
        }
        scanner.close();
        
    }
}
