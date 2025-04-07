import java.util.Scanner;

public class Numeronarcisistas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unidad= 1 ;int decima=0;int centena=0;
        int x =1;
        while (x > 0) {
            System.out.println("ingrese un numero de tres cifras ( 100 - 999)");
        int numero = scanner.nextInt();
            if (numero>999 || numero < 100){
                System.out.println("error -------------- intente de nuevo;");
                x=1;
            }else{
                x=x-1;
                unidad = numero % 10 ;
                decima = (numero/10)% 10;
                centena = numero / 100;
               
            }
            double h1 = Math.pow(unidad,3);
            double h2 = Math.pow(decima, 3);
            double h3 = Math.pow(centena,3);
            if(h1+h2+h3==numero){
               System.out.println(" es un numero narcisista");
            }else {
                System.out.println(" no es un numero narcisista");
            }
        }
        scanner.close();
       
        }
       
}
