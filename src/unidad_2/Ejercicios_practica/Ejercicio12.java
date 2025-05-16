package unidad_2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] marco = new int[5][15];
        int longitud_matriz = marco.length;// aqui se haya la longitud de la matriz
        
        for(int i=0;i<longitud_matriz;i++ ){
            for(int j =0;j<15;j++){
                if( i == 0 || i == 4){// si es la primera y la ultima fila se escribe 1 directamente
                    System.out.print(1);
                }else{
                    if( j == 0 || j == 14){// aqui si la posicion inicial y final de las 5 columnas son 1 o 14 en la primera fila se escribe 1 
                        System.out.print(1);
                    }else{ // si no es si o si esa posicion , entonces se escribe 0 
                         System.out.print(0);// se escribe 0 para el resto del centro de la matriz
                    }
                }
            }
            System.out.println(""); // este espacio es para sepárar las 5 columnas

        }






        scanner.close();
    }
}
