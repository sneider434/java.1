import java.util.Scanner;

public class Exercise {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese un numero");
        int num = scanner.nextInt();
        if (num <= 0){
            System.out.println(" el numero no es valido");
            scanner.close();
            return;
        }

        System.out.println(" ingrese un numero");
    
        scanner.close();
          
      
 }

}