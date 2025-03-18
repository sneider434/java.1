import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese numero ");
       int numero = scanner.nextInt();
       if (numero>0){
        System.out.println(" es positivo");
       }else if (numero == 0){
        System.out.println(" es nulo");
       }else if (numero < 0)
       System.out.println("es negativo");
    }
}
