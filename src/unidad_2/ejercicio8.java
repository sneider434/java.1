package unidad_2;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] alumnos_clase = new String[1000][2];// metriz donde se almacena todo
        int contador=0;
        String nombres = "";
        int edad =0;
        while (true) {
            System.out.println("ingrese nombre del estudiante #"+(contador+1));
         nombres= scanner.nextLine();
            if(nombres.contains("*")){
            break;
            }
            System.out.println(" ingrese la edad de el alumno #"+(contador+1));
            edad = scanner.nextInt();
            scanner.nextLine();

            alumnos_clase[contador][0]= nombres;
            alumnos_clase[contador][1]=String.valueOf(edad);
           contador++;
        }
        int edadmayor=0;
        for(int i=0;i<contador;i++){
            int edad_alumno = Integer.parseInt(alumnos_clase[i][1]);
            if(edad_alumno>18){
              System.out.println(" el estudiante "+ alumnos_clase[i][0]+" Es mayor de edad con : "+ alumnos_clase[i][1]);
            }else{
                System.out.println(" el estudiante "+ alumnos_clase[i][0]+" No es mayor de edad con : "+ alumnos_clase[i][1]);
            }
            if(edad_alumno>edadmayor){
                edadmayor = edad_alumno;
            }
        }
        System.out.println("el alumno con mayor edad tiene : "+ edadmayor  );
        scanner.close();
    }
}
