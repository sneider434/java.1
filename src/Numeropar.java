

public class Numeropar { 
    public static void main(String[] args) {
       
        int par = 0;
        for (int i = 1; i <= 100; i++)   {
           if (i % 2 == 0) {
             par=par+1;
           }
        }
       System.out.println("numeros pares = "+ par );
       
    }
}

