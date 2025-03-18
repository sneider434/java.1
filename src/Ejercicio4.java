import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     System.out.println("ingrese su sueldo");
     int nume = scanner.nextInt();
     if (nume> 3000){
      System.out.println("debe pagar impuestos");
     }
        
    }
}
