package unidad_2.Ejercicios_practica;
 public class Ejercicio15 {

    public static void main(String[] args) {
        // Inicialización de la tabla de equipos para 15 partidos (cada partido 2 equipos)
        String[][] equipos = new String[15][2];

        // Inicialización de la tabla de resultados para 15 partidos (goles de equipo 1 y equipo 2)
        int[][] resultados = new int[15][2];

        // -- Commit: Asignar equipos a cada partido --
        equipos[0][0] = "Barcelona";
        equipos[0][1] = "Real Madrid";
        equipos[1][0] = "Atletico Madrid";
        equipos[1][1] = "Sevilla";
        equipos[2][0] = "Valencia";
        equipos[2][1] = "Villarreal";
        equipos[3][0] = "Real Sociedad";
        equipos[3][1] = "Athletic Bilbao";
        equipos[4][0] = "Getafe";
        equipos[4][1] = "Granada";
        equipos[5][0] = "Celta Vigo";
        equipos[5][1] = "Espanyol";
        equipos[6][0] = "Mallorca";
        equipos[6][1] = "Elche";
        equipos[7][0] = "Osasuna";
        equipos[7][1] = "Cadiz";
        equipos[8][0] = "Alaves";
        equipos[8][1] = "Levante";
        equipos[9][0] = "Real Betis";
        equipos[9][1] = "Rayo Vallecano";
        equipos[10][0] = "Girona";
        equipos[10][1] = "Getafe";
        equipos[11][0] = "Las Palmas";
        equipos[11][1] = "Almeria";
        equipos[12][0] = "Cádiz";
        equipos[12][1] = "Valladolid";
        equipos[13][0] = "Elche";
        equipos[13][1] = "Levante";
        equipos[14][0] = "Granada";
        equipos[14][1] = "Real Sociedad";

        // -- Commit: Asignar resultados de goles a cada partido --
        resultados[0][0] = 2; resultados[0][1] = 1;
        resultados[1][0] = 0; resultados[1][1] = 0;
        resultados[2][0] = 1; resultados[2][1] = 3;
        resultados[3][0] = 2; resultados[3][1] = 2;
        resultados[4][0] = 1; resultados[4][1] = 0;
        resultados[5][0] = 3; resultados[5][1] = 1;
        resultados[6][0] = 0; resultados[6][1] = 1;
        resultados[7][0] = 2; resultados[7][1] = 0;
        resultados[8][0] = 0; resultados[8][1] = 2;
        resultados[9][0] = 1; resultados[9][1] = 1;
        resultados[10][0] = 2; resultados[10][1] = 0;
        resultados[11][0] = 0; resultados[11][1] = 3;
        resultados[12][0] = 1; resultados[12][1] = 2;
        resultados[13][0] = 2; resultados[13][1] = 2;
        resultados[14][0] = 0; resultados[14][1] = 1;

        // -- Commit: Mostrar resultados de la quiniela --
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + ": " + equipos[i][0] + " vs " + equipos[i][1]);
            System.out.println("Resultado: " + resultados[i][0] + " - " + resultados[i][1]);
            System.out.println();
        }
    }
}

    
