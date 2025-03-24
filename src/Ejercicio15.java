import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int nume = 5;
      for (int x = 1;x<11;x++){
        System.out.println("5 "+"* " + x+"= "+nume*x);
      }
      scanner.close();
 }
}
