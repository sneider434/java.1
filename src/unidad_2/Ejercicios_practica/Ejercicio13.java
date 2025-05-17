package unidad_2.Ejercicios_practica;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ¿Cuantos trabajadores tiene?");// esto es para saber cuantos  trabajadores son
        int cantidad_trabajadores= scanner.nextInt();
        scanner.nextLine();// limpiar salto de linea
        String[] nombres = new String[cantidad_trabajadores]; // se inicializa el vector de los nombres
       for(int i =0;i<cantidad_trabajadores;i++){
            System.out.println(" ingrese el nombre de trabajador # "+ (i+1));
            nombres[i]=scanner.nextLine();// se carga dicho vector
       }
       double[][] kms = new double[cantidad_trabajadores][7];// se crea una variable para los 7 dias de cada trabajador
       for(int x =0;x< cantidad_trabajadores;x++){
        for(int j =0;j<7;j++){
            System.out.println("Ingrese los kms realizados cada dia del trabajador # "+(x+1));
            System.out.println(" Ingrese el dia # "+(j+1));
            kms[x][j]= scanner.nextDouble();// se carga 
        }
       }
       double[] promedio_kms = new double[cantidad_trabajadores];
       for(int x =0;x<cantidad_trabajadores;x++){
        for(int j =0;j<7;j++){
           promedio_kms[x]+=kms[x][j];
        }
       }
      // resultados en pantalla
      for(int i =0;i<cantidad_trabajadores;i++){
        System.out.println(" el trabajador "+ nombres[i]+ " manejo un total de "+promedio_kms[i]+" en la semana");
      } 
        scanner.close();
    }
}
