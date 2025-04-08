package unidad_1;
import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese numero 1");
       int nume1 = scanner.nextInt();
       System.out.println("ingrese numero 2 ");
       int nume2 = scanner.nextInt();
        if (nume1>nume2){
          System.out.println(nume1);
        }else {
          System.out.println(nume2);
        }
        scanner.close();
    }
}
