package unidad_2.Trabajo_segundo_parcial;

import java.util.*;

public class Slugheroes2 {
    static final String GREEN = "\u001B[32m";
    static final String RED = "\u001B[31m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Player jesus = new Player("Jesús Shein", GREEN, true);
        Player nack = new Player("Nack", RED, false);

        clear();
        printSlow("\n\u001B[36mBIENVENIDO AL COMBATE SLUGTERRA\u001B[0m", 30);

        while (jesus.isAlive() && nack.isAlive()) {
            clear();
            System.out.println("\nEstado actual:");
            showStatus(jesus);
            showStatus(nack);
            Thread.sleep(1000);

            Slug slugJesus = chooseSlug(scanner, jesus);
            Slug slugNack = getRandomSlug(nack);

            printSlow("\nAmbos combatientes disparan sus babosas...", 30);
            Thread.sleep(1000);

            System.out.println(GREEN + jesus.name + " dispara " + slugJesus.name + " (Daño: " + slugJesus.damage + ")" + RESET);
            System.out.println(RED + nack.name + " dispara " + slugNack.name + " (Daño: " + slugNack.damage + ")" + RESET);
            Thread.sleep(2000);

            if (slugJesus.damage > slugNack.damage) {
                int dmg = slugJesus.damage / 2;
                nack.takeDamage(dmg);
                printSlow(GREEN + jesus.name + " gana el enfrentamiento y daña a Nack con " + dmg + " de daño!" + RESET, 25);
            } else if (slugNack.damage > slugJesus.damage) {
                int dmg = slugNack.damage / 2;
                jesus.takeDamage(dmg);
                printSlow(RED + "Nack gana el enfrentamiento y daña a Jesús Shein con " + dmg + " de daño!" + RESET, 25);
            } else {
                printSlow("\nAmbas babosas tienen el mismo poder. ambas se derriban a la vez ", 30);
            }

            Thread.sleep(2500);
        }

        clear();
        if (jesus.isAlive()) System.out.println(GREEN + "\nJesús Shein ha ganado!" + RESET);
        else System.out.println(RED + "\nNack ha ganado!" + RESET);
    }

    static void printSlow(String message, int delay) throws InterruptedException {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            Thread.sleep(delay);
        }
        System.out.println();
    }

    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void showStatus(Player player) {
        System.out.println(player.color + player.name + " - Vida: " + player.health + RESET);
    }

    static Slug chooseSlug(Scanner scanner, Player player) {
        List<String> keys = new ArrayList<>(player.slugs.keySet());
        while (true) {
            System.out.println("\nElige una babosa para disparar:");
            for (int i = 0; i < keys.size(); i++) {
                Slug s = player.slugs.get(keys.get(i));
                System.out.println((i + 1) + ". " + s.name + " (Cantidad: " + s.amount + ", Daño: " + s.damage + ")");
            }
            int slugChoice = scanner.nextInt() - 1;
            scanner.nextLine();
            if (slugChoice >= 0 && slugChoice < keys.size()) {
                Slug chosen = player.slugs.get(keys.get(slugChoice));
                if (chosen.amount > 0) {
                    chosen.amount--;
                    return chosen;
                } else {
                    System.out.println("No te quedan babosas de ese tipo!");
                }
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    static Slug getRandomSlug(Player player) {
        List<Slug> available = new ArrayList<>();
        for (Slug s : player.slugs.values()) {
            if (s.amount > 0) {
                available.add(s);
            }
        }
        if (available.isEmpty()) return new Slug("Puño", 1, 0);
        Slug chosen = available.get(new Random().nextInt(available.size()));
        chosen.amount--;
        return chosen;
    }
}

class Slug {
    String name;
    int damage;
    int amount;

    Slug(String name, int damage, int amount) {
        this.name = name;
        this.damage = damage;
        this.amount = amount;
    }
}

class Player {
    static final String RESET = "\u001B[0m";
    String name;
    String color;
    int health = 50;
    Map<String, Slug> slugs = new HashMap<>();

    Player(String name, String color, boolean isHero) {
        this.name = name;
        this.color = color;
        if (isHero) {
            slugs.put("Infierno", new Slug("Infierno", 20, 3));
            slugs.put("Sombra", new Slug("Sombra", 15, 3));
            slugs.put("Viento", new Slug("Viento", 18, 2));
        } else {
            slugs.put("Tóxica", new Slug("Tóxica", 19, 3));
            slugs.put("Oscura", new Slug("Oscura", 15, 3));
            slugs.put("Pesadilla", new Slug("Pesadilla", 16, 2));
        }
    }

    boolean isAlive() {
        return health > 0;
    }

    void takeDamage(int dmg) {
        health -= dmg;
        health = Math.max(0, health);
    }
}

