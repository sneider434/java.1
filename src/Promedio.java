import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese notas");
        int n = scanner.nextInt(); 
        int[] notas = new int[n]; 
        for (int x = 0;x<6;x++){
            notas[x]=scanner.nextInt();
        }
    }
    
}
