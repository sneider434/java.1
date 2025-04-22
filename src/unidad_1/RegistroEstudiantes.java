package unidad_1;
import java.util.Scanner;
public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numestudiantes=0;  // variable para saber cuantos estudiantes son 
        System.out.println("ingrese numero de estudiantes que desea ingresar");
        numestudiantes= scanner.nextInt();
        scanner.nextLine(); // limpiar salto de linea
        double[][] notas = new double [numestudiantes][3]; // variable de las notas
        String[] nombres = new String[numestudiantes];// variable de los nombres de estudiantes
        int[] codigo = new int[numestudiantes];// variable donde se almacenan las codigos 
       
      
        double[] promedio_estudiante = new double[numestudiantes];
        // este for es para ingresar nombres y codigos del numero de estudiantes
        for(int x =0;x<numestudiantes;x++ ){
            System.out.println("ingrese nombre del estudiante numero : " +(x+1) + " : ");// de posicion 0 a 1
            nombres[x]= scanner.nextLine();
            System.out.println("ingrese codigo del estudoiante "+ (x+1)+ " : ");// lo mismo que lo anterior
            codigo[x]= scanner.nextInt();
            scanner.nextLine(); // limpiar salto de linea
            
            // este for se encarga de ingresar las notas  de cada estudiante
            double suma =0;
            for(int j=0;j<3;j++){
                System.out.println("ingrese la nota de la materia numero "+(j+1)+ " del estudiante "+ nombres[x]);   
                do {
                    notas[x][j]= scanner.nextDouble();
                    if (notas[x][j]>5.0 || notas[x][j]<0.0){ // este if verifica la validez de la nota
                        System.out.println("A ingresado una nota invalida");
                        System.out.println("Intente de nuevo------");
                    }
                    
                }   while(notas[x][j]>5.0 || notas[x][j]<0.0) ;
                suma += notas[x][j];// se suman las 3 notas a cada estudiante        
            }
            scanner.nextLine();// limpiar salto de linea
            promedio_estudiante[x]=suma/3;// se almacena cada promedio

           
            
        }
        // todo lo que saldra en la terminal

        double promedio_mayor=promedio_estudiante[0];// variable para verificar los promedios y saber  cual es el mayor

        // identificar el mejor promedio
        for (int i =1;i<numestudiantes;i++){
            if (promedio_estudiante[i]>promedio_mayor){
                promedio_mayor=promedio_estudiante[i];
            }
        }
        System.out.println("\n--- Resultados ---");
        System.out.println("--------------------------------------");
        System.out.println("estudiante/s  con  el/los  mejor/es  promedio/s");
        // Mostrar  los/el estudiante/s con el mejor promedio
         for (int x =0;x<numestudiantes;x++){
            if ( promedio_estudiante[x]==promedio_mayor){
                System.out.println("el estudiante : "+nombres[x]+ "con el codigo : "+ codigo[x]+ " obtuvo el mejor promedio de:  "+ promedio_mayor);
            }
         }
         System.out.println("--------------------------------------");
         System.out.println("estudiantes aprobados y no aprobados");
        // aprobados y no aprobados
          for(int i=0;i<numestudiantes;i++){// este for muestra los aprobados y no aprobados
            if(promedio_estudiante[i]>=3.0){
               System.out.println("el estudiante "+ nombres[i]+" / con el codigo "+codigo[i]+" / aprobo con un promedio de "+promedio_estudiante[i]);
            }else{
                System.out.println("el estudiante "+ nombres[i]+" / con el codigo "+codigo[i]+" / no aprobo con un promedio de "+promedio_estudiante[i]);
            }
          }
          System.out.println("--------------------------------------");
          System.out.println("promedio general");
           // promedio general del curso
           double suma_promedio=0;
            for(int i=0;i<numestudiantes;i++){
             suma_promedio+=promedio_estudiante[i];
            }
            double promedio_general = suma_promedio/numestudiantes;
            System.out.println("El promedio general del grupo fue de : "+ promedio_general);

         scanner.close();
         
          
    }
  }
