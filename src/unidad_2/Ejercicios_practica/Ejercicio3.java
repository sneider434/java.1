package unidad_2.Ejercicios_practica;

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
            do {
                System.out.println("ingrese la nota de la materia #"+(i+1));
                    notas[i]=scanner.nextDouble();
                if(notas[i]<0.0 || notas[i]>10.0){
                    System.out.println("error-----------------------");
                    System.out.println("intente de nuevo");
                }
                 
            } while (notas[i]<0.0 || notas[i]>10.0);
           
        }
        // en este for mostraremos todas las notas
        for(int x =0;x<numero_notas;x++){
            System.out.println(" nota #"+(x+1)+" = "+ notas[x]);
            promedio+=notas[x];// aqui se acumula las 5 notas y se suman
        }
        // aqui el promedio general
        System.out.println(promedio/5);
        // encontrar la nota mayor y nota menor
        nota_menor=nota_mayor;
        for(int x=0;x<numero_notas;x++){
            if(notas[x]>nota_mayor){//verifica si la nota es mayor que la variable que inicia en cero.
                nota_mayor=notas[x];// si es asi la variable se iguala al valor de esa nota
             }
        }
        nota_menor=nota_mayor;// la variable de control empieza con el valor de la nota mayor
        for(int i=0;i<numero_notas;i++){
             if(nota_menor>notas[i]){//verifica si la nota es menor que la variable de control 
                nota_menor=notas[i];// si la condicion se cumple se va actualizandop a la nota mas baja.
             }
        }
         // mostrar la nota menor y mayor
         System.out.println(" la nota menor fue de : "+ nota_menor);
         System.out.println("la mota mayor fue de : "+ nota_mayor);
         scanner.close();

    }
}
