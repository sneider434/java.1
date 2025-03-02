import java.util.Scanner;
public class Media {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese numero 1");
       int nume = scanner.nextInt();
       System.out.println("ingrese numero 2");
       int nume2 = scanner.nextInt();
       System.out.println("ingrese numero 3 ");
       int nume3 = scanner.nextInt();
       double promedio = (nume+nume2+nume3)/3.00;
       System.out.println("el promedio es : " + promedio);
       scanner.close();
    }
}
