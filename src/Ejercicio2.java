import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrsese 3 notas de 1-10");
        System.out.println("Ingrese nota 1");
        int nota1 = scanner.nextInt();
        System.out.println("ingrese nota 2 ");
        int nota2= scanner.nextInt();
        System.out.println("ingrese nota 3 ");
        int nota3= scanner.nextInt();
        float promedio= (nota1+nota2+nota3)/3;
        if (promedio >= 7){
          System.out.println("APROBADO");
        }else  {
          System.out.println("NO APROBADO");
        }
        scanner.close();
    }
}
