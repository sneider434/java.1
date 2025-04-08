package unidad_1;
import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Introduce el primer nombre: ");
              String nombre1 = scanner.nextLine();
      
              System.out.print("Introduce el segundo nombre: ");
              String nombre2 = scanner.nextLine();
      
             
              System.out.println("\nNombres en orden alfabético:");
              if (nombre1.compareToIgnoreCase(nombre2) < 0) {
                  System.out.println(nombre1);
                  System.out.println(nombre2);
              } else {
                  System.out.println(nombre2);
                  System.out.println(nombre1);
              }

      
      
       scanner.close();
 }
}
      
 
