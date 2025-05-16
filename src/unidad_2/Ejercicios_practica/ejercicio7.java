package unidad_2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[5];// inicializamos el primer vector
        for(int i=0;i<vector1.length;i++){
            vector1[i]= scanner.nextInt();// le damos sus valores
        }
        int[] vector2 = new int[5];// inicializamos el segundo vector
        for(int i=0;i<vector1.length;i++){
            vector2[i]= scanner.nextInt();// le damos sus valores
        }
        int[] vector3= new int[5];// inicializamos el vector 3 
        for(int x =0;x<vector3.length;x++){
          vector3[x]=vector1[x]+vector2[x];//davos los valores automaticamente sumando al vector1 con el vector2
        }
        for(int k=0;k<vector3.length;k++){// mostrar los resultados
            System.out.println("el vector resultante es : ");
            System.out.println(vector3[k]);
        }
        scanner.close();
    }
}
