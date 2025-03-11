import java.util.Scanner;

public class Quizz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO POSITIVO");
        int n = scanner.nextInt();
        System.out.println("_____________________________________________________");
         for (int i =1; i <= n ; i++){
            for (int j =i;j<=n ; j++){
                System.out.print(j + " ");
            }
            for  (int j = n - 1; j >= i; j--){
                System.out.print(j + " ");
            }
            System.out.println();
         }
         scanner.close();
    }
}
