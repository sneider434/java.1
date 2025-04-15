package unidad_1;
import java.util.Scanner;
public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numestudiantes=0;  // variable para saber cuantos estudiantes son 
        System.out.println("ingrese numero de estudiantes que desea ingresar");
        numestudiantes= scanner.nextInt();
        scanner.nextLine(); // limpiar salto de linea
        double[][] notas = new double [numestudiantes][3];
        String[] nombres = new String[numestudiantes];
        int[] codigo = new int[numestudiantes];
        int promedio_mayor=0;
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
            scanner.nextLine();
            promedio_estudiante[x]=suma/3;// se almacena cada promedio
            for (int i =0;i<numestudiantes;i++){
                if (promedio_estudiante[i]>promedio_estudiante[promedio_mayor]){
                    promedio_mayor=i;
                }
              }
        }
          for(int i=0;i<numestudiantes;i++){// este for muestra los aprobados y no aprobados
            if(promedio_estudiante[i]>=3.0){
               System.out.println("el estudiante "+ nombres[i]+" / con el codigo "+codigo[i]+" / aprobo con un promedio de "+promedio_estudiante[i]);
            }else{
                System.out.println("el estudiante "+ nombres[i]+" / con el codigo "+codigo[i]+" / no aprobo con un promedio de "+promedio_estudiante[i]);
            }
          }
          double suma_promedio=0;
          for(int i=0;i<numestudiantes;i++){
            suma_promedio+=promedio_estudiante[i];
          }
          double promedio_general = suma_promedio/numestudiantes;
          System.out.println("El promedio general del grupo fue de : "+ promedio_general);
          
          
          System.out.println("El mejor estudiante es " + nombres[promedio_mayor] +   " con código " + codigo[promedio_mayor] +   " y promedio " + promedio_estudiante[promedio_mayor]);
          scanner.close();
          for(int i=0;i<notas.length;i++){
            for (int x =0;x<notas.length;x++)
            System.out.println(notas[x][i]);
          }
    }
}
