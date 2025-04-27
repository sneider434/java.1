package unidad_2;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] alumnos_clase = new String[1000][2];// metriz donde se almacena todo
        int verificador=1; int contador=0;
        String nombres = "";
        int edad =0;
        do {
            contador=contador+1;
            System.out.println("ingrese nombre del estudiante #"+contador);
         nombres= scanner.nextLine();
            if(nombres.contains("*")){
            break;
            }
            alumnos_clase[contador][1]= nombres;
             System.out.println(" ingrese la edad de el alumno");
             edad = scanner.nextInt();
            alumnos_clase[contador][2]="edad";
            scanner.nextLine();
        } while (verificador==1);
        
        for(int i=0;i<contador;i++)
        System.out.println(alumnos_clase[i][2]);

        scanner.close();
    }
}
