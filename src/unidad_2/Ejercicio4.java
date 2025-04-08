package unidad_2;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vectorNumeros = new int[10];
        System.out.println("ingrese numeros aleatorios");
        for(int i =0;i<vectorNumeros.length;i++){
            vectorNumeros[i]=scanner.nextInt();
            if(vectorNumeros[i]<0){
                break;
            }
        }
        for(int i=0;i<vectorNumeros.length;i++){
            System.out.println(vectorNumeros[i]);
        }
        scanner.close();

    }
}
