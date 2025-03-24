import java.util.Scanner;

public class Numerocapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int x=0;
        while(x>=0){
            int numero= scanner.nextInt();
            if(numero<0){
              System.out.println("eror-----------------ingrese de nuevo");
            }else{
                x=-1;
            }
        }
        
        scanner.close();
    }

}
