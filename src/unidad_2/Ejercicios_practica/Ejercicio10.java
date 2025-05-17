package unidad_2.Ejercicios_practica;

import java.util.Scanner;
import java.util.Random;// se importa una clase que da numeros aleatorios enteros
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int [][] matriz = new int[5][5];// variable principal 
        int longitud_matriz = matriz.length;// hallar la longitud de dicha matriz
        Random numero_aleatorio = new Random(); // se crea un objeto de dicha clase

        // aqui cargamos la matriz con valores enteros aleatorios
        for( int i =0;i<longitud_matriz;i++){
            for( int x =0;x<longitud_matriz;x++){
                matriz[i][x]=numero_aleatorio.nextInt(100)+1;
            }
        }
        // MOSTRAR LA MATRIZ
        for(int i =0;i<longitud_matriz;i++){
            for(int j =0;j<longitud_matriz;j++){
                System.out.print(matriz[i][j]+ "\t" );
            }
            System.out.println("");
        }
        System.out.println("_______________________________________________");
        // aqui hallaremos y mostraremos la suma de cada fila y columna
        int suma_columnas = 0;
        int suma_filas=0;
        for( int i=0;i<longitud_matriz;i++){
            for(int x=0;x<longitud_matriz;x++){
                suma_columnas+=matriz[i][x];
                suma_filas+=matriz[x][i];// se intercambian las pocisiones de x , i para que recorra la fila en vez de la columna
            }
            System.out.println(" la suma de los numeros de la columna # "+(i+1)+" es de : "+ suma_columnas);
            suma_columnas=0;
            System.out.println("");
             System.out.println(" la suma de los numeros de la fila # "+(i+1)+" es de : "+ suma_filas);
            suma_filas=0;
            System.out.println("");
        }
        scanner.close();
    }    
}
