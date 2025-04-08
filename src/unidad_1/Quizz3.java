package unidad_1;
import java.util.Scanner;

public class Quizz3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false; 
        boolean tieneNumero = false;
        boolean tieneEspecial = false;
          for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if ("@#$%&*".indexOf(c) != -1) {
                tieneEspecial = true;
            }
        }
        if (password.length() < 8) {
            System.out.println("❌ La contraseña debe tener al menos 8 caracteres.");
        }
        if (!tieneMayuscula) {
            System.out.println("❌ Debe contener al menos una letra mayúscula.");
        }
        if (!tieneMinuscula) {
            System.out.println("❌ Debe contener al menos una letra minúscula.");
        }
        if (!tieneNumero) {
            System.out.println("❌ Debe contener al menos un número.");
        }
        if (!tieneEspecial) {
            System.out.println("❌ Debe contener al menos un carácter especial (@, #, $, %, &, *).");
        }
        
        if (password.length() >= 8 && tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial) {
            System.out.println("✅ La contraseña es válida.");
        } else if (password.length() < 8 || !tieneMayuscula || !tieneMinuscula || !tieneNumero || !tieneEspecial) {
            System.out.println("❌ La contraseña no es válida.");
        }
        

        scanner.close();
    }
}

