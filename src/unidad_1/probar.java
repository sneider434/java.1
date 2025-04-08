package unidad_1;
import java.util.Arrays;
import java.util.Scanner;

public class probar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};

for (int i = 0; i < numeros.length / 2; i++) {
    int temp = numeros[i];
    numeros[i] = numeros[numeros.length - 1 - i];
    numeros[numeros.length - 1 - i] = temp;
}

System.out.println("Array invertido: " + Arrays.toString(numeros));
scanner.close();
    }
}
