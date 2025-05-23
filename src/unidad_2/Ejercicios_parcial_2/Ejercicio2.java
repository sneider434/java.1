package unidad_2.Ejercicios_parcial_2;
class rectangulo {
    int ancho =0;
    int alto =0;
    rectangulo (int ancho , int alto){
        this.ancho = ancho;
        this.alto  =  alto;
    }
}
public class Ejercicio2 {
    public static void modificarrectangulo(rectangulo r){
        r.ancho=30;
        r.alto=10;
        System.out.println("ancho : "+r.ancho+"  alto :"+r.alto);
    }
    public static void main(String[] args) {
        rectangulo mirectangulo = new rectangulo(34, 67);
        System.out.println("ancho = "+ mirectangulo.ancho+"alto = "+mirectangulo.alto);
        modificarrectangulo(mirectangulo);
       
    }
}
