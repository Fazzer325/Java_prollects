import java.util.ArrayList;
import static java.lang.Math.random;

public class Equipos {
    public static void main(String[] args){
        String[] equipos={"Equipo 1","Equipo 2","Equipo 3","Equipo 4","Equipo 5","Equipo 6","Equipo 7","Equipo 8",
                "Equipo 9","Equipo 10"};

        String[] Jugadores={"Jugador 1","Jugador 2","Jugador 3","Jugador 4","Jugador 5","Jugador 6","Jugador 7",
                "Jugador 8","Jugador 9","Jugador 10",};

        ArrayList<String> Premiados = new ArrayList<>();
        int aleatorio = 0;

        //Jugadores Premiados
        for (int i = 0;i<3;i++){
            aleatorio = (int) (random() * 10);
            Premiados.add((Jugadores[aleatorio]));
        }
        System.out.println("Jugadores Premiados: ");
        for (String premiados : Premiados) System.out.println(premiados);

        //Equipos premiados
        Premiados.clear();
        for (int i = 0;i<3;i++){
            aleatorio = (int) (random() * 10);
            Premiados.add((equipos[aleatorio]));
        }
        System.out.println("Equipos Premiados: ");
        for (String premiados : Premiados) System.out.println(premiados);
    }
}