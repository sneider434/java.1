package unidad_2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[5];
        for(int i=0;i<vector1.length;i++){
            vector1[i]= scanner.nextInt();
        }
        scanner.close();
    }
}
