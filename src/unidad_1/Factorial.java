package unidad_1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca un número
        System.out.print("Introduce un número para calcular su factorial: ");
        int n = scanner.nextInt();
        int x =n ;
        int facto = 1;
         int i =1;
        while ( i <= n) {
             facto = facto * n;

            n=n-1;
        }

       

        System.out.println("El factorial de " +x + " es " + facto);

        scanner.close();
    }
}

