package unidad_2.Ejercicios_parcial_2;

public class Ejercicio3 {
    public static void modificararray(int[] arr){
        for( int i =0;i<arr.length;i++){
            arr[i] *= 2;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] numeros = {2,4,6,8,10};
        
          System.out.println(java.util.Arrays.toString(numeros));
        
        modificararray(numeros);
        System.out.println(java.util.Arrays.toString(numeros));

    }
}
