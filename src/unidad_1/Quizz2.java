package unidad_1;
import java.util.Scanner;
public class Quizz2 {
    public static void main(String[] args) {
       System.out.println("ingrese un numero");
       Scanner scanner = new Scanner(System.in);
       int nume = scanner.nextInt();
       boolean esPerfecto= false;
       if (nume > 1){
         int sumDivisores = 1;
         for (int i=2;i <= Math.sqrt(nume);i++){
            System.out.println(i);
           if ( nume % i == 0 ){
            sumDivisores += i;
            if (i !=nume/i){
              sumDivisores+=nume/i;
                  
            }


           }
         
         esPerfecto= (sumDivisores==nume);
         

         }
         System.out.println(" el numero " + nume + " tiene  "+ sumDivisores + "divisores");
         System.out.println(" el numero es perfecto ?   "+ esPerfecto);

 
       }



        scanner.close();
    }
}
