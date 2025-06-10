package unidad_2.Ejercicios_practica;

import java.util.Scanner;

public class Persona {
    private String nombre ;
    private int edad;
    private String sexo;
    private double altura;


    public Persona(String nombre,int edad,String sexo,double altura){
        this.nombre = nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.altura=altura;
    }
    public void altura(){
        System.out.println("la altura de "+ nombre +" es de : "+altura);
    }
    public void genero(){
        System.out.println(" el genero de : "+nombre +" es : "+sexo);
    }
    public void vejez() {
        System.out.println("la persona : "+nombre+" tiene "+ edad + " años");
    }
    public void mostrarEstado(){
        System.out.println("----------- EStado de "+ nombre + " -----------------------");
        System.out.println("edad : "+ edad);
        System.out.println("sexo : "+ sexo);
        System.out.println("altura : "+altura);
        System.out.println("-----------------------------------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona1 = new Persona("alex",21,"hombre",1.82);
        persona1.mostrarEstado();
        persona1.genero();
        persona1.altura();


        scanner.close();
    }
}
