package unidad_1;
import java.util.Scanner;

public class Taller1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese cuantos estudiantes desea ");
        int n = scanner.nextInt();
        int[] estudiantes = new int[n];
        for ( int k =0;k< n;k++){
            estudiantes[k]= scanner.nextInt();
        }
         scanner.close();
    }
}
