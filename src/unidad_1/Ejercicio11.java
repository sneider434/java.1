package unidad_1;
import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese el sueldo");
      int sueldo = scanner.nextInt();
      System.out.println("ingrese sus años de antiguedad");
      int years= scanner.nextInt();
      if ( sueldo < 500 &  years>= 10){
        double aumento= (sueldo*0.20)+sueldo;
        System.out.println("tiene un aumento del 20%"+ aumento);

      }else if (sueldo < 500 &  years< 10){
        
        double aumento= (sueldo*0.05)+sueldo;
        System.out.println("tiene un aumento del 5%"+ aumento);
      }else {
        System.out.println("su sueldo es de : "+ sueldo);
        scanner.close();
      }
 }
}
