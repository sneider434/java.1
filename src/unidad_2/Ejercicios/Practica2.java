package unidad_2.Ejercicios;

public class Practica2 {
    public static void modificararreglo(int[] temp){
        for(int i =0;i<temp.length;i++){
            if(temp[i]% 2 ==0){
                temp[i]*=4;
            }
        }
    }
    public static void main(String[] args) {
        int[] numeros={2,3,4,5,6,7,8,9,10,11,12,13};
            
        
        for(int i=0;i<numeros.length;i++){
            
            System.out.println(numeros[i]);

        }
        System.out.println("");
        modificararreglo(numeros);
        System.out.println("arreglo modificado = ");
        for(int i=0;i<numeros.length;i++){
            
            System.out.println(numeros[i]);

        }
   }
}
