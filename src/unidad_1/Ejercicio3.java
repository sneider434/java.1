
package unidad_1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     System.out.println("INGRESE UN NUMERO DE 1 - 99");
        int nume = scanner.nextInt();
        if (nume< 99 & nume > 1 ){
          if (nume<10){
            System.out.println("es un numero de un digito");
  
          }else{
            System.out.println(" es un numero de 2 digitos");
          }
        }else {
          System.out.println("A ingresado un numero invalido");
        }
        scanner.close();
        
    }
}
