import java.util.Scanner;

public class Numerocapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int x=0; int unidad=0; int centena=0;int numero=0;
        while(x>=0){
             numero= scanner.nextInt();
            if(numero<0 || numero<100 || numero > 999){
              System.out.println("eror-----------------ingrese de nuevo");
            }else {
                x=-1;
            }
        }
        unidad = numero % 10 ;
        centena = numero / 100;
        if (unidad==centena){
            System.out.println("es un numero capicua");
        }else {
            System.out.println(" no es un numero capicua");
        }
        
        scanner.close();
    }

}
