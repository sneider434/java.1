package unidad_2.Ejercicios_practica;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][]  diagonal = new int[5][5];
        int   longitud_matriz = diagonal.length;
        
        for (int i=0;i<longitud_matriz;i++){
            for(int j =0;j<longitud_matriz;j++){
                if ( i== j){
                   diagonal[i][j]=1; // aqui se recorre la columna
                    
                }else{
                    diagonal[i][j]=0;  // y aqui la fila solo cambando a i por j
                }
            }
        }
        // mostrar la matriz
        for(int i =0;i<longitud_matriz;i++){
            for(int j=0;j<longitud_matriz;j++){
                System.out.print(diagonal[i][j]+"\t");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
