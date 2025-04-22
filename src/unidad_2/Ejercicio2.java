package unidad_2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] caracteres = new String[5];// vector inicial 
        String[] caracteresinversos = new String[5];// vector inverso 
       
        for(int i = 0; i < caracteres.length; i++) {
            System.out.print("Ingrese un caracter: ");
            // Leer el caracter ingresado por el usuario
            caracteres[i] = scanner.nextLine();
        }
         // almacenar los caracteres en un vector diferente
        for (int x=0;x<caracteres.length;x++){// este for recore el vector inverso
            caracteresinversos[x]=caracteres[caracteres.length-1-x];
        }
        for( int i=0;i<caracteres.length;i++){// mostrar los caracteres de forma inversa
            System.out.println(caracteresinversos[i]);
        }
        scanner.close();
    }
        
}
    
