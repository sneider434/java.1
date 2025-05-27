package unidad_2.Trabajo_segundo_parcial;
import java.util.Scanner;

public class Slugheroes2 {
    static final String VERDE = "\u001B[32m";
    static final String ROJO = "\u001B[31m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String jugador = "Jesús Shein";
        String enemigo = "Nack";

        int vidaJugador = 50;
        int vidaEnemigo = 50;

        String[] nombresBabosasJugador = {"Infierno", "Sombra", "Viento"};
        int[] daniosJugador = {20, 15, 18};
        int[] cantidadesJugador = {3, 3, 2};

        String[] nombresBabosasNack = {"Tóxica", "Oscura", "Pesadilla"};
        int[] daniosNack = {19, 15, 16};
        int[] cantidadesNack = {3, 3, 2};

        limpiar();
        textoLento("\n\u001B[36mBIENVENIDO AL COMBATE SLUGTERRA\u001B[0m", 30);
        Thread.sleep(1000);

        while (vidaJugador > 0 && vidaEnemigo > 0) {
            limpiar();
            mostrarEstado(jugador, vidaJugador, VERDE);
            mostrarEstado(enemigo, vidaEnemigo, ROJO);
            Thread.sleep(1000);

            // Elegir babosa del jugador
            int eleccionJugador = elegirBabosa(scanner, nombresBabosasJugador, daniosJugador, cantidadesJugador);
            String babosaJugador = nombresBabosasJugador[eleccionJugador];
            int danioJugador = daniosJugador[eleccionJugador];
            cantidadesJugador[eleccionJugador]--;

            // Elegir babosa aleatoria de Nack
            int eleccionNack = elegirBabosaAleatoria(nombresBabosasNack, cantidadesNack);
            String babosaNack = nombresBabosasNack[eleccionNack];
            int danioNack = daniosNack[eleccionNack];
            cantidadesNack[eleccionNack]--;

            textoLento("\nAmbos combatientes disparan sus babosas...", 30);
            Thread.sleep(1000);
            System.out.println(VERDE + jugador + " dispara " + babosaJugador + " (Daño: " + danioJugador + ")" + RESET);
            System.out.println(ROJO + enemigo + " dispara " + babosaNack + " (Daño: " + danioNack + ")" + RESET);
            Thread.sleep(2000);

            if (danioJugador > danioNack) {
                int danoFinal = danioJugador / 2;
                vidaEnemigo -= danoFinal;
                textoLento(VERDE + jugador + " gana el turno y daña a Nack con " + danoFinal + " de daño!" + RESET, 25);
            } else if (danioNack > danioJugador) {
                int danoFinal = danioNack / 2;
                vidaJugador -= danoFinal;
                textoLento(ROJO + "Nack gana el turno y daña a " + jugador + " con " + danoFinal + " de daño!" + RESET, 25);
            } else {
                textoLento("\n¡Empate! Las babosas se anulan entre sí.", 30);
            }

            vidaJugador = Math.max(0, vidaJugador);
            vidaEnemigo = Math.max(0, vidaEnemigo);

            Thread.sleep(2500);
        }

        limpiar();
        if (vidaJugador > 0) {
            System.out.println(VERDE + "\n¡" + jugador + " ha ganado!" + RESET);
        } else {
            System.out.println(ROJO + "\n¡Nack ha ganado!" + RESET);
        }

        scanner.close();
    }

    static void textoLento(String mensaje, int retardo) throws InterruptedException {
        for (char c : mensaje.toCharArray()) {
            System.out.print(c);
            Thread.sleep(retardo);
        }
        System.out.println();
    }

    static void limpiar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void mostrarEstado(String nombre, int vida, String color) {
        System.out.println(color + nombre + " - Vida: " + vida + RESET);
    }

    static int elegirBabosa(Scanner scanner, String[] nombres, int[] danios, int[] cantidades) {
        while (true) {
            System.out.println("\nElige una babosa para disparar:");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println((i + 1) + ". " + nombres[i] + " (Cantidad: " + cantidades[i] + ", Daño: " + danios[i] + ")");
            }

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion >= 1 && opcion <= nombres.length) {
                if (cantidades[opcion - 1] > 0) {
                    return opcion - 1;
                } else {
                    System.out.println("No te quedan babosas de ese tipo.");
                }
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    static int elegirBabosaAleatoria(String[] nombres, int[] cantidades) {
        while (true) {
            int indice = (int) (Math.random() * nombres.length);
            if (cantidades[indice] > 0) {
                return indice;
            }
        }
    }
}

