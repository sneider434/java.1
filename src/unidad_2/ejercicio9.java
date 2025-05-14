package unidad_2;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temp_maxima = new double[5];
        double[] temp_minima = new double[5];
        // aqui ingresamos la temperatura maxima de cada dia 
        for(int i=0;i<temp_maxima.length;i++){
            System.out.println(" Ingrese la temperatura maxima  del dia # "+(i+1));
            temp_maxima[i]= scanner.nextDouble();
        }
            // aqui ingresamos la temperatura minima de cada dia 
        for(int i =0;i< temp_minima.length;i++){
            System.out.println(" Ingrese la temperatura minima del dia # "+(i+1));
            temp_maxima[i]= scanner.nextDouble();
        }
        // esta seccion es para almacenar los promedios de cada dia
        double[] promedio_dia = new double[5];
       for(int i =0;i < temp_maxima.length;i++){
        promedio_dia[i]=(temp_maxima[i]+temp_minima[i])/2;
       }

       // mostrar el promedio de cada dia
       for(int i =0;i < temp_maxima.length;i++){
        System.out.println(" el promedio del dia : "+ i+ " fue de : "+ promedio_dia[i]);
       }
           
       // hallar los dias con menos temperatura
       double promedio_total =0;
        for( int i =0; i < temp_minima.length;i++){ 
            promedio_total=+promedio_dia[i];
        }

        // aqui sacamos el promedio de temperatura total
        promedio_total= promedio_total/5;

        // mostramos los dias con menor temperaturas
        for( int i =0;i<temp_maxima.length;i++){
            if(promedio_dia[i]<promedio_total){
                System.out.println("los dias con menos temperatura fueron : ");
                System.out.println(" dia :"+ i);
                System.out.println("Con una temperatura de : "+ promedio_dia[i]);
            }
        }
        // aqui el usuario ingresa una temperatura y la comparamos
        System.out.println("ingrese una temperatura");
        double temperatura_comparativa = scanner.nextDouble();

        for(int i =0; i < temp_maxima.length;i++){
        if(temp_maxima[i]== temperatura_comparativa){
            System.out.println(" Los dias que tuvieron una temperatura maxima igual a la ingresa son : ");
            System.out.println(" dia :"+ i+ " con una temperatura de : "+ promedio_dia[i]);
        }
        else{
            System.out.println("lo sentimos , no coicide ninguna temperatura");
        }
        }
        scanner.close();
    }

}
