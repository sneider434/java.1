import java.util.Scanner;

public class Operadores  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Suma
        double suma = num1 + num2;
        System.out.println("Suma: " + suma);

        // Resta
        double resta = num1 - num2;
        System.out.println("Resta: " + resta);

        // Multiplicación
        double multiplicacion = num1 * num2;
        System.out.println("Multiplicación: " + multiplicacion);

        // División
        double division = num1 / num2;
            System.out.println("División: " + division);

        // Módulo
        double modulo = num1 % num2;
            System.out.println("Módulo: " + modulo);

        scanner.close();
    }
}