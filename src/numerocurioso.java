import java.util.Scanner;

public class numerocurioso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x =1;
        while (x > 0) {
            System.out.println("ingresew un numero de tres cifras ( 100 - 999)");
        int numero = scanner.nextInt();
            if (numero>999 || numero < 100){
                System.out.println("error -------------- intente de nuevo;");
                x=3;
            }else{
                x=x-1;
                int unidad = numero % 10 ;
                int decima = (numero/10)% 10;
                int centena = numero / 100;
            
            }
        }
        scanner.close();
       
        }
       
}
