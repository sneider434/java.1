import java.util.Scanner;

public class menu {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("que desea hacer");
        System.out.println("1). "+ "sumar ");
        System.out.println("2):"+ "dividir");
        System.out.println("3)."+"multiplicar");
        int respuesta = scanner.nextInt() ;
        switch (respuesta) {
            case 1 :
                 System.out.println("ingrese 2 numeros");
                 int nu1 = scanner.nextInt();
                 int nu2 = scanner.nextInt();
                 System.out.println(nu1+nu2);
                break;
            case 2 :
               System.out.println("ingrese 2 numeros");
                double nume1 = scanner.nextDouble();
                double nume2 = scanner.nextDouble();
                System.out.println(nume1/nume2);
                break;
            case 3 :
                System.out.println("ingrese 2 numeros");
                double numero1= scanner.nextDouble ();
                double numero2 = scanner.nextDouble ();
                System.out.println(numero1*numero2);
                break;

            default:
               System.out.println("error , try again");
                break;
        }
        scanner.close();
    }
   
}
