package unidad_2.Ejercicios;

public class Practica1 {
    public static void cambiarnumeros(int[] tem){
    int temporal =0;
    temporal= tem[0];
    tem[0]=tem[1];
    tem[1]=temporal;

    }
    public static void main(String[] args) {
        int[] numeros = {1,3};
        System.out.println(numeros[0]+" w "+numeros[1]);
        cambiarnumeros(numeros);
        System.out.println(numeros[0]+" w "+numeros[1]);
    }
}
