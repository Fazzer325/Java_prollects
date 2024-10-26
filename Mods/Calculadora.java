package Mods;
import java.util.ArrayList;

public class Calculadora {
    public static int Suma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static int Resta(ArrayList<Integer> numeros) {
        int resta = 0;
        for (int numero : numeros) {
            resta -= numero;
        }
        return resta;
    }

    public static int Multiplicacion(ArrayList<Integer> numeros) {
        int multi = 1;
        for (int numero : numeros) {
            multi *= numero;
        }
        return multi;
    }
}
