package unidad_2.Ejercicios_practica;

import java.util.Scanner;

public class Estudiantes {
    private String nombre;
    private double[] notas ;
    public Estudiantes(String nombre){
        this.nombre=nombre;
        this.notas=new double[5];
    }
    public void ingresarnotas(){
        Scanner scanner= new Scanner(System.in);
       
        for(int i =0;i<this.notas.length;i++){
            System.out.println(" ingrese la nota : "+ (i+1));
            notas[i]= scanner.nextDouble();
        }
    }
    public void hallarnotamayor(){
        double contador =0;
        int posicion =0;
        for(int i =0;i<notas.length;i++){
            if(notas[i]>contador){
                posicion=i+1;
                contador=notas[i];
            }
        }
        System.out.println(" la nota mayor es :  "+ contador + " en la posicion "+ posicion);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese el nombre del estudiante ");
        String nombre = scanner.nextLine();

        Estudiantes estudiantes1 = new Estudiantes(nombre);
        estudiantes1.ingresarnotas();
        estudiantes1.hallarnotamayor();
        scanner.close();
    }
}
