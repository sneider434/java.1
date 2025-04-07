import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numeros = new Scanner(System.in);
        Scanner nombres = new Scanner(System.in);
        int inicioAlumnos = 0;
        int inicioCodigo = 0;
        int inicioPromedio = 0;
        int inicioAprobado = 0;
        double sumNotas = 0;
        double promedioNotas = 0;
        System.out.println("Ingresa el numero de estudiantes");
        int numEstudiantes = numeros.nextInt();
            int[] codigosAlumnos = new int[numEstudiantes];
            String[] nombresAlumnos = new String[numEstudiantes];
            double[] promedio = new double[numEstudiantes];
            String[] aprobado = new String[numEstudiantes];

            for (int i = 1; i <= numEstudiantes; i++) {
                System.out.println("Ingresa el nombre del estudiante Nº " + i);
                String nombre = nombres.nextLine();
                nombresAlumnos[inicioAlumnos] = nombre;
                inicioAlumnos++;
                System.out.println("Ingresa el codigo del estudiante Nº " + i);
                int codigo = numeros.nextInt();
                codigosAlumnos[inicioCodigo] = codigo;
                inicioCodigo++;
                for (int numNotas = 1; numNotas <= 3; numNotas++) {
                    System.out.println("Ingresa la nota Nº" + numNotas);
                    double notas = numeros.nextDouble();
                    sumNotas+=notas;
                }
                promedioNotas=sumNotas/3;
                promedio[inicioPromedio] = promedioNotas;
                inicioPromedio++;
                if (promedioNotas>=3.0) {
                    aprobado[inicioAprobado] = "Aprobó";
                } else {
                    aprobado[inicioAprobado] = "No Aprobó";
                }
                inicioAprobado++;
                sumNotas=0;
            }
            for (int Resultado = 0; Resultado < numEstudiantes; Resultado++) {
                System.out.println("El estudiante : " + nombresAlumnos[Resultado] + " Con el codigo : " + codigosAlumnos[Resultado] + " Con un promedio de : " + promedio[Resultado] + " Entonces el estudiante : " + aprobado[Resultado]);
            }
            

        

        


        numeros.close();
        nombres.close();


    }
}            
