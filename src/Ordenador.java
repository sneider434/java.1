import java.util.Scanner;

public class Ordenador{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca el primer número
        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        // Pedir al usuario que introduzca el segundo número
        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Pedir al usuario que introduzca el tercer número
        System.out.println("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        // Comparar los números utilizando operadores lógicos y de comparación
        boolean esMayorQueSegundo = num1 > num2;
        boolean esMenorQueTercero = num1 < num3;

        // Mostrar el resultado de la comparación
        if (esMayorQueSegundo && esMenorQueTercero) {
            System.out.println("El primer número es mayor que el segundo y menor que el tercero.");
        } else {
            System.out.println("El primer número NO es mayor que el segundo y menor que el tercero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
