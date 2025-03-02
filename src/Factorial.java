import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca un número
        System.out.print("Introduce un número para calcular su factorial: ");
        int n = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es " + factorial);

        scanner.close();
    }
}

