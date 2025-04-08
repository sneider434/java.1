package unidad_2;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cuadrado =0;
        double cubo=0;
        int[] vectorNumeros = new int[10];
        System.out.println("ingrese numeros aleatorios");
        for(int i =0;i<vectorNumeros.length;i++){
            vectorNumeros[i]=scanner.nextInt();
        }
        for(int k =0;k<vectorNumeros.length;k++){
          cuadrado=Math.pow(vectorNumeros[k],2);
          System.out.println("cuadrado de  "+vectorNumeros[k]+" = "+cuadrado);
          cubo=Math.pow(vectorNumeros[k],3);
          System.out.println("cubo="+vectorNumeros[k]+" = "+cubo);
        }
        scanner.close();
    }
}
