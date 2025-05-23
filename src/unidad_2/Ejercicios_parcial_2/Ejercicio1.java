package unidad_2.Ejercicios_parcial_2;

public class Ejercicio1 {
    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a = 12;
        int b=2;
        System.out.println("a" +"="+a);
        System.out.println("b"+"="+b);
        intercambiar(a, b);
        System.out.println("a" +"="+a);
        System.out.println("b"+"="+b);
    }
}