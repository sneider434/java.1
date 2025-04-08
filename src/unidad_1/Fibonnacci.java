package unidad_1;
import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca la cantidad de términos de la serie de Fibonacci
        System.out.print("Introduce la cantidad de términos de la serie de Fibonacci: ");
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1;
        System.out.println("Serie de Fibonacci de " + n + " términos:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            // Calcular el siguiente término
            int siguienteTermino = num1 + num2;
            num1 = num2;
            num2 = siguienteTermino;
        }

        scanner.close();
    }
}
