package unidad_2.Ejercicios_parcial_2;

public class Ejercicio4 {
    public static  int incrementar(int x){
        x *= 2;
        System.out.println("dentro del metodo x : "+ x);
        return x;

    }
    public static void main(String[] args) {
        int x =5;
        System.out.println("valor original x = "+x);
        x = incrementar(x);
        System.out.println("despues de modificar x : "+ x);
    }
}
