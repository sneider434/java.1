package unidad_1;
import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese 10 notas ");
      int w=0;int e = 0;
      for (int x =1;x<11;x++){
        System.out.println("INGRESE NOTA "+x );
        int nota= scanner.nextInt();
        if (nota> 7){
          
          w=w+1;
        }else {
          
          e=e+1;
        }
      }
      System.out.println("notas superiores a 7 :"+ w);
      System.out.println("notas inferiores a 7 :"+ e);
      scanner.close();
 }
}
