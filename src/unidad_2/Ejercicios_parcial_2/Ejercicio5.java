package unidad_2.Ejercicios_parcial_2;

public class Ejercicio5 {
    public static void modificarcadena( String texto){
        texto = " askfdcnk";
        System.out.println(" modificada = "+ texto);
    }
    public static void main(String[] args) {
        String palabra = "hola";
        System.out.println(" sin modificar : "+ palabra);
        modificarcadena(palabra);
        System.out.println("palabra modificada ; "+ palabra);
    }
}
