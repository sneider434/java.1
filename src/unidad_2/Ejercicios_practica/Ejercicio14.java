package unidad_2.Ejercicios_practica;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precios = new double[5];// variabale para ingresar los precios de los prductos 
        int[][] cantidades = new int[4][5];// variable  donde se ingresa las cantidades en las 4 sucursales y sus 5 articulos
        for(int articulo = 0; articulo<precios.length;articulo++){
            System.out.println("Ingrese el precio de articulo # "+(articulo+1));
            precios[articulo]=scanner.nextDouble();
        }            
        for(int sucursal=0;sucursal<cantidades.length;sucursal++){
            for( int articulo =0;articulo<precios.length;articulo++){
                System.out.println("Ingrese las ventas del articulo #"+ (articulo+1)+" De la sucursal # "+(sucursal+1));
                cantidades[sucursal][articulo]=scanner.nextInt();
            }
        }
        // saber las ventas totales de cada articulo y las ventas totales de la sucursal 2
        int[] cantidad_articulos = new int[5];
        int cantidad_sucursal_2 =0;
        for( int sucursal =0;sucursal<cantidades.length;sucursal++){
            for(int articulo =0;articulo<precios.length;articulo++){
                cantidad_articulos[sucursal]+=cantidades[articulo][sucursal];// en un vector se almacena las ventas totales de cada articulo

                if(sucursal==1){// este if es para saber la cantida de articulos de la sucursal 2 
                    cantidad_sucursal_2+=cantidades[sucursal][articulo];
                }
            }
        }
        // mostrar por pantalla las ventas de cada articulo
       for( int sucursal =0;sucursal<cantidades.length;sucursal++){
           System.out.println("las ventas totales del articulo #"+(sucursal+1)+" fueron : "+ cantidad_articulos[sucursal]);
           
        }
        // las ventas de los 5 articulos de la sucursal 2 fueron
        System.out.println("la cantidad de ventas de articulos de la sucursal 2 es : "+cantidad_sucursal_2);
        // mostrar las ventas del articulo 3 en la sucursal 1
        System.out.println("las ventas totales del articulo 3 en la sucursal 1 fueron de : "+ cantidades[0][2]);

        // mostrar las ventas de cada sucursal
        int[] ventas_totales_sucursal =new int[5];
        for(int sucursal =0;sucursal<precios.length;sucursal++){
            for(int articulo =0; articulo<cantidades.length;articulo++){
                ventas_totales_sucursal[sucursal]+=cantidades[sucursal][articulo];
            }
        }
        // mostrar por pantalla las ventas totales de cada sucursal
        for(int sucursal=0;sucursal<ventas_totales_sucursal.length;sucursal++){
            System.out.println("las ventas totales de la sucursal #"+(sucursal+1)+"fueron de : "+ventas_totales_sucursal[sucursal]);
        }
        // obtener las ventas totales de la empresa
        for(int sucursal=0;sucursal<precios.length;sucursal++){
            for(int articulo=0;articulo<cantidades.length;articulo++){
                int total_ventas_empresa =0;
                total_ventas_empresa+=cantidades[sucursal][articulo];
                System.out.println("las ventas totales de la empresa fueron de : "+total_ventas_empresa);

            }
        }
        // mostrar el precio de cada articulo
        for(int articulo=0;articulo<precios.length;articulo++){
            System.out.println("el precio del articulo #"+(articulo+1)+" es de : "+ precios[articulo]);
        }
        // mostrar el precio de cada articulo y la cantidad vendida
        for(int sucursal=0;sucursal<precios.length;sucursal++){
            for(int articulo=0;articulo<cantidades.length;articulo++){
                System.out.println("el precio del articulo #"+(articulo+1)+" es de : "+ precios[articulo]+" y la cantidad vendida fue de : "+cantidades[sucursal][articulo]);
            }
        }
        // mostrar el precio de cada articulo y la cantidad vendida por sucursal
        for(int sucursal=0;sucursal<precios.length;sucursal++){
            for(int articulo=0;articulo<cantidades.length;articulo++){
                System.out.println("el precio del articulo #"+(articulo+1)+" es de : "+ precios[articulo]+" y la cantidad vendida fue de : "+cantidades[sucursal][articulo]);
            }
        }
        
        scanner.close();
    }
}
