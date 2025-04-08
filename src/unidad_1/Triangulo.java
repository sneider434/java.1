package unidad_1;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero de coloumnas");
        int columnas = scanner.nextInt();
        int filas=0;
        for (int x =0;x<columnas;x++){
            filas=filas+1;
            System.out.println(filas);
        }
        String figura = "*";String espacio = "";
        for (int d = 0;d<columnas;d++){
            
            for(int j=columnas;j>filas;j++){
                System.out.print(figura);
            }
            filas=filas+1;
            System.out.println();
            System.out.println(espacio);
        }
       

        scanner.close();
        }
}
