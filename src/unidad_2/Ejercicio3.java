package unidad_2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        int numero_notas= notas.length;// variable para saber la longitud del vector
        double promedio=0;
        double nota_mayor=0;
        double nota_menor =0;
        // en este for se llena el vector que llevara las 5 notas del estudiante
        for ( int i =0;i<numero_notas;i++){
            System.out.println("ingrese la nota de la materia #"+(i+1));
            notas[i]=scanner.nextDouble(); 
        }
        // en este for mostraremos todas las notas
        for(int x =0;x<numero_notas;x++){
            System.out.println(" nota #"+x+" = "+ notas[x]);
            promedio+=notas[x];// aqui se acumula las 5 notas y se suman
        }
        // aqui el promedio general
        System.out.println(promedio/5);
        // encontrar la nota mayor y nota menor
        nota_menor=nota_mayor;
        for(int x=0;x<numero_notas;x++){
            if(notas[x]>nota_menor){
                nota_menor=notas[x];
             }
        }
        for(int i=0;i<numero_notas;i++){
             if(nota_mayor>notas[i]){
                nota_mayor=notas[i];
             }
        }
         // mostrar la nota menor y mayor
         System.out.println(" la nota menor fue de : "+ nota_menor);
         System.out.println("la mota mayor fue de : "+ nota_mayor);

    }
}
