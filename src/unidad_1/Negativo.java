package unidad_1;
import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nume = scanner.nextDouble();
        if (!(nume<0)){
            System.out.println(" el numero es positivo");
        } else if (!(nume>0)) {
            System.out.println("el numero es negativo");
        }
        scanner.close();
    }
   
}
