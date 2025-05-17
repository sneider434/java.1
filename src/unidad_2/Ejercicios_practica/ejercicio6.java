package unidad_2.Ejercicios_practica;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] meses = new String[12][2];
        // llenar la mtriz 
        meses[0][0]="1";   meses[0][1]="enero";
        meses[1][0]="2";   meses[1][1]="febrero";
        meses[2][0]="3";   meses[2][1]="marzo";
        meses[3][0]="4";   meses[3][1]="abril";
        meses[4][0]="5";   meses[4][1]="mayo";
        meses[5][0]="6";   meses[5][1]="junio";
        meses[6][0]="7";   meses[6][1]="julio";
        meses[7][0]="8";   meses[7][1]="agosto";
        meses[8][0]="9";   meses[8][1]="septiembre";
        meses[9][0]="10";  meses[9][1]="octubre";
        meses[10][0]="11"; meses[10][1]="noviembre";
        meses[11][0]="12";  meses[11][1]="diciembre";
        
        // pedir al usuario que mes desea saber
        int imput=0;
        do {
        System.out.println("¿ingrese un numero de un mes?");
        imput = scanner.nextInt();
        } while (imput<0 && imput>12);
        
        for (int i = 0; i < meses.length; i++) {
            if (imput==i) {
                if(imput==1 || imput==3 || imput==5 || imput==7 || imput==8 || imput ==10 || imput==12){// este es para los meses que tienen 31 dias
                    System.out.println("Mes " + meses[i-1][0] + " : " + meses[i-1][1]+"  tiene 31 dias ");
                }else if(imput==2){// este para febrero
                    System.out.println("Mes " + meses[i-1][0] + " : " + meses[i-1][1]+"  tiene 28 dias ");
                }else{// y este para los meses que tienen 30 dias
                    System.out.println("Mes " + meses[i-1][0] + " : " + meses[i-1][1]+"  tiene 30 dias ");
                }
            }
            
        }
       
       
        scanner.close();
    }
}