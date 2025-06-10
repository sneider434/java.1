package unidad_2.Ejercicios_practica;

import java.util.Scanner;

public class Triangulo {
    private int base ;
    private int altura ;
    public Triangulo(int base,int altura){
        this.base=base;
        this.altura=altura;

    }
    public void hallararea(){
        double area =0.0;
        area= (base*altura)/2;
        System.out.println("el area del triangulo es : "+area);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int altura = scanner.nextInt();
        Triangulo triangulo1 = new Triangulo(base,altura);
        triangulo1.hallararea();
        scanner.close();
    }
}
