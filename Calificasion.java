import java.util.ArrayList;

public class Calificasion {
    public static void main(String[] args) {
        String[] Alumnos = {"Raul", "Gael", "Juan", "Maria", "Carlos"};
        int[] Tareas = {4, 6, 8, 10, 4};
        int[] Trabajos = {6, 8, 9, 7, 6};
        int[] examen = {9, 7, 6, 8, 8};

        ArrayList<Integer> Calificacion = new ArrayList<>();

        for (int i = 0; i < Alumnos.length; i++) {
            int cal = (Tareas[i] + Trabajos[i] + examen[i])/3;
            Calificacion.add(cal);
        }

        for (int i =0; i < Calificacion.size(); i++) {
            System.out.println(Alumnos[i]+" Tiene un: "+Calificacion.get(i)+" De calificacion");
        }
    }
}
