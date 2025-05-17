package unidad_2.Ejercicios_practica;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cuadrado =0;// variable para guardar el numero elevado al cuadrado
        double cubo=0;// variable para guardar el numero elevado al cubo
        int[] vectorNumeros = new int[10];
        System.out.println("ingrese numeros aleatorios");
        for(int i =0;i<vectorNumeros.length;i++){
            vectorNumeros[i]=scanner.nextInt();
        }
        for(int k =0;k<vectorNumeros.length;k++){
          cuadrado=Math.pow(vectorNumeros[k],2);// con esta funcion elevamos el numero ingresado al cuadrado
          System.out.println("cuadrado de : "+vectorNumeros[k]+" = "+cuadrado);
          cubo=Math.pow(vectorNumeros[k],3);// con esta funcion elevamos el numero ingresado al cubo
          System.out.println("cubo de :"+vectorNumeros[k]+" = "+cubo);
        }
        scanner.close();
    }
}
