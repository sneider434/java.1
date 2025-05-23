package unidad_2.Trabajo_segundo_parcial;
import java.util.Random;
import java.util.Scanner;

public class SimulacionBatalla {

    static class Personaje {
        String nombre;
        int fuerza;
        int velocidad;
        int resistencia;
        int oro;
        boolean esHeroe;

        // Códigos de colores para consola
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_GOLD = "\u001B[33m"; // Añadido código para color dorado (amarillo)

        public Personaje(String nombre, int fuerza, int velocidad, int resistencia, int oro, boolean esHeroe) {
            this.nombre = nombre;
            this.fuerza = fuerza;
            this.velocidad = velocidad;
            this.resistencia = resistencia;
            this.oro = oro;
            this.esHeroe = esHeroe;
        }

        // Método para atacar a otro personaje
        public void atacar(Personaje oponente) {
            System.out.println(ANSI_GREEN + nombre + " ataca a " + oponente.nombre + " con fuerza " + fuerza + "." + ANSI_RESET);

            oponente.resistencia -= fuerza;
            if (oponente.resistencia < 0) oponente.resistencia = 0;

            Random random = new Random();
            int oroRobado = random.nextInt(11); // puede robar hasta 10 de oro

            if (oroRobado > oponente.oro) {
                oroRobado = oponente.oro; // no puede robar más de lo que tiene
            }

            oponente.oro -= oroRobado;
            oro += oroRobado;
            

            System.out.println(ANSI_RED + oponente.nombre + " perdió " + fuerza + " de resistencia y " 
                + oroRobado + " de oro." + ANSI_RESET);
            System.out.println(nombre + " ahora tiene " + ANSI_GOLD + oro + ANSI_RESET + " de oro.");
            System.out.println(oponente.nombre + " tiene " 
                + oponente.resistencia + " de resistencia y " 
                + ANSI_GOLD + oponente.oro + ANSI_RESET + " de oro.");
        }

        // Método para mostrar la tienda
        public void tienda(Scanner scanner) {
            Random random = new Random();
            int opcion;

            do {
                System.out.println("\n--- TIENDA DE " + (esHeroe ? "HÉROE" : "VILLANO") + " ---");
                System.out.println("Tienes " + oro + " de oro disponible.");
                System.out.println("1. " + (esHeroe ? "Poción" : "Inyección") + " de resistencia (+15) - " + ANSI_GOLD + " 5 de oro" + ANSI_RESET);
                System.out.println("2. " + (esHeroe ? "Poción" : "Inyección") + " de fuerza (+10) - " + ANSI_GOLD + "8 de oro"+ ANSI_RESET);
                System.out.println("3. " + (esHeroe ? "Poción" : "Inyección") + " de velocidad (+10) - " + ANSI_GOLD + "7 de oro"+ ANSI_RESET);
                System.out.println("4. " + (esHeroe ? "Poción" : "Inyección") + " del ludópata (Duplica o pierdes todo) - Gratis Mi Rey :p ");
                System.out.println("5. Salir de la tienda");
                System.out.print("Elige una opción: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor ingresa un número válido.");
                    scanner.next();
                }
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        if (oro >= 5) {
                            resistencia += 15;
                            oro -= 5;
                            System.out.println(ANSI_GREEN + "Has comprado una " + (esHeroe ? "poción" : "inyección") + " de resistencia. +15 resistencia." + ANSI_RESET);
                            System.out.println("Resistencia actual: " + resistencia);
                        } else {
                            System.out.println(ANSI_RED + "No tienes suficiente oro para comprar esto." + ANSI_RESET);
                        }
                        break;
                    case 2:
                        if (oro >= 8) {
                            fuerza += 10;
                            oro -= 8;
                            System.out.println(ANSI_GREEN + "Has comprado una " + (esHeroe ? "poción" : "inyección") + " de fuerza. +10 fuerza." + ANSI_RESET);
                            System.out.println("Fuerza actual: " + fuerza);
                        } else {
                            System.out.println(ANSI_RED + "No tienes suficiente oro para comprar esto." + ANSI_RESET);
                        }
                        break;
                    case 3:
                        if (oro >= 7) {
                            velocidad += 10;
                            oro -= 7;
                            System.out.println(ANSI_GREEN + "Has comprado una " + (esHeroe ? "poción" : "inyección") + " de velocidad. +10 velocidad." + ANSI_RESET);
                            System.out.println("Velocidad actual: " + velocidad);
                        } else {
                            System.out.println(ANSI_RED + "No tienes suficiente oro para comprar esto." + ANSI_RESET);
                        }
                        break;
                    case 4:
                        System.out.println("Lanzando moneda...");
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                        boolean suerte = random.nextBoolean();
                        if (suerte) {
                            oro *= 2;
                            System.out.println(ANSI_GREEN + "¡Suerte! Tu oro se ha duplicado a " + oro + "." + ANSI_RESET);
                        } else {
                            oro = 0;
                            System.out.println(ANSI_RED + "Mala suerte... Perdiste todo tu oro." + ANSI_RESET);
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo de la tienda...");
                        break;
                    default:
                        System.out.println(ANSI_RED + "Opción inválida, intenta otra vez." + ANSI_RESET);
                }

            } while (opcion != 5);
        }

        // Método para mostrar estado del personaje
        public void mostrarEstado() {
            System.out.println("\nEstado de " + nombre + ":");
            System.out.println("Fuerza: " + fuerza);
            System.out.println("Velocidad: " + velocidad);
            System.out.println("Resistencia: " + resistencia);
            System.out.println("Oro: " + oro);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Elegir héroe
        int escogerHeroe = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Elige tu héroe:");
            System.out.println("1. Super-Man");
            System.out.println("2. Spider-Man");
            System.out.println("3. Hulk");

            if (scanner.hasNextInt()) {
                escogerHeroe = scanner.nextInt();
                if (escogerHeroe >= 1 && escogerHeroe <= 3) {
                    entradaValida = true; // Salir del bucle si la entrada es válida
                } else {
                    System.out.println(Personaje.ANSI_RED + "Opción inválida, intenta de nuevo." + Personaje.ANSI_RESET);
                }
            } else {
                System.out.println(Personaje.ANSI_RED + "Por favor ingresa un número válido." + Personaje.ANSI_RESET);
                scanner.next(); // Limpiar el buffer
            }
        }

        Personaje heroe = null;

        switch (escogerHeroe) {
            case 1:
                System.out.println("Has elegido a Super-Man");
                heroe = new Personaje("Super-Man", 20, 15, 100, 20, true);
                break;
            case 2:
                System.out.println("Has elegido a Spider-Man");
                heroe = new Personaje("Spider-Man", 18, 20, 80, 15, true);
                break;
            case 3:
                System.out.println("Has elegido a Hulk");
                heroe = new Personaje("Hulk", 25, 10, 120, 25, true);
                break;
        }

        // Elegir villano
        int escogerVillano = 0;
        entradaValida = false;

        while (!entradaValida) {
            System.out.println("Elige tu villano:");
            System.out.println("1. Joker");
            System.out.println("2. Dr. Octopus");
            System.out.println("3. Thanos");

            if (scanner.hasNextInt()) {
                escogerVillano = scanner.nextInt();
                if (escogerVillano >= 1 && escogerVillano <= 3) {
                    entradaValida = true; // Salir del bucle si la entrada es válida
                } else {
                    System.out.println(Personaje.ANSI_RED + "Opción inválida, intenta de nuevo." + Personaje.ANSI_RESET);
                }
            } else {
                System.out.println(Personaje.ANSI_RED + "Por favor ingresa un número válido." + Personaje.ANSI_RESET);
                scanner.next(); // Limpiar el buffer
            }
        }

        Personaje villano = null;

        switch (escogerVillano) {
            case 1:
                System.out.println("Has elegido a Joker");
                villano = new Personaje("Joker", 15, 12, 90, 10, false);
                break;
            case 2:
                System.out.println("Has elegido a Dr. Octopus");
                villano = new Personaje("Dr. Octopus", 18, 15, 100, 15, false);
                break;
            case 3:
                System.out.println("Has elegido a Thanos");
                villano = new Personaje("Thanos", 25, 10, 120, 20, false);
                break;
        }

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Mostrar estado de personajes");
            System.out.println("2. Héroe ataca a Villano");
            System.out.println("3. Villano ataca a Héroe");
            System.out.println("4. Héroe entra a la tienda");
            System.out.println("5. Villano entra a la tienda");
            System.out.println("6. Dejar de jugar");
            System.out.print("Elige una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingresa un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    heroe.mostrarEstado();
                    villano.mostrarEstado();
                    break;
                case 2:
                    heroe.atacar(villano);
                    if (villano.resistencia <= 0) {
                        System.out.println(Personaje.ANSI_GREEN + villano.nombre + " ha sido derrotado. ¡Victoria para " + heroe.nombre + "!" + Personaje.ANSI_RESET);
                    }
                    break;
                case 3:
                    villano.atacar(heroe);
                    if (heroe.resistencia <= 0) {
                        System.out.println(Personaje.ANSI_GREEN + heroe.nombre + " ha sido derrotado. ¡Victoria para " + villano.nombre + "!" + Personaje.ANSI_RESET);
                    }
                    break;
                case 4:
                    heroe.tienda(scanner);
                    break;
                case 5:
                    villano.tienda(scanner);
                    break;
                case 6:
                    System.out.println("¡Gracias por jugar! Hasta la próxima.");
                    break;
                default:
                    System.out.println(Personaje.ANSI_RED + "Opción inválida, intenta otra vez." + Personaje.ANSI_RESET);
            }

        } while (opcion != 6);

        scanner.close();
    }
}


