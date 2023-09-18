import java.util.ArrayList;

public class Yincana {
    public static void main(String[] args) {
        // Lista de equipos participantes
        ArrayList<String> equipos = new ArrayList<String>();
        equipos.add("Equipo verde");
        equipos.add("Equipo rosado");
        equipos.add("Equipo azul");
        //equipos.add("Equipo rojo");

        // Verificamos si el número de equipos es impar
        boolean esImpar = equipos.size() % 2 == 1;

        // Si es impar, agregamos un equipo ficticio para balancear
        if (esImpar) {
            equipos.add("Descansa");
        }

        // Creamos el arreglo de rondas de juego
        ArrayList<ArrayList<String>> rondas = new ArrayList<ArrayList<String>>();

        // Número de rondas necesarias para que cada equipo juegue con todos los demás
        int numRondas = equipos.size() - 1;

        // Generamos las rondas de juego
        for (int ronda = 0; ronda < numRondas; ronda++) {

            ArrayList<String> partidas = new ArrayList<String>();

            // Primer equipo de cada ronda
            String equipo1 = equipos.get(ronda % equipos.size());

            // Enfrentamientos de cada ronda
            for (int enfrentamiento = 0; enfrentamiento < equipos.size() / 2; enfrentamiento++) {

                // Segundo equipo de cada enfrentamiento
                int indexEquipo2 = (ronda + enfrentamiento) % (equipos.size() - 1);
                if (indexEquipo2 >= ronda) {
                    indexEquipo2++;
                }
                String equipo2 = equipos.get(indexEquipo2);

                // Agregamos la partida a la lista de partidas de la ronda
                partidas.add(equipo1 + " vs. " + equipo2);

            }

            // Agregamos la lista de partidas a la lista de rondas
            rondas.add(partidas);

        }

        // Imprimimos el arreglo de rondas de juego
        for (int ronda = 0; ronda < rondas.size(); ronda++) {
            System.out.println("Ronda " + (ronda + 1) + ": " + rondas.get(ronda));
        }

    }

}