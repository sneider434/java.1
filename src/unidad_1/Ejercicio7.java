package unidad_1;
import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese numero ");
      int numero = scanner.nextInt();
      if (numero > 1 & numero < 10){
        System.out.println("es un numero de 1 digito");
      }
      
     if (numero>9 & numero < 100){
      System.out.println(" es un numero de 2 digitos");
    }else if (numero > 99 & numero < 1000){
      System.out.println("es un numero de 3 digitos");
    }
    scanner.close();
  }
}

