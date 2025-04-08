package unidad_1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese nemuero 1");
       int nume1 = scanner.nextInt();
       System.out.println("ingrese numero 2 ");
       int nume2 = scanner.nextInt();
       if (nume1>nume2){
         System.out.println("suma es :"+ nume1+nume2);
         System.out.println("la diferencia es . "+ (nume1-nume2));
       }else if (nume2>nume1){
        System.out.println("producto : "+nume2*nume1);
        float divi = nume2/nume1;
        System.out.println("division :"+divi );
        scanner.close();
    }
    }
}
