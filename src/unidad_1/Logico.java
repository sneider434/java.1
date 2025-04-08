package unidad_1;
public class Logico {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Operador AND (&&)
        boolean resultado1 = (num1 < num2) && (num2 < num3);
        System.out.println("(num1 < num2) && (num2 < num3): " + resultado1);

        // Operador OR (||)
        boolean resultado2 = (num1 > num2) || (num2 < num3);
        System.out.println("(num1 > num2) || (num2 < num3): " + resultado2);

        // Operador NOT (!)
        boolean resultado3 = !(num1 < num2);
        System.out.println("!(num1 < num2): " + resultado3);
    }
}
