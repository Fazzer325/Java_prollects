import static Mods.Calculadora.*;
import java.util.ArrayList;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Calculadora\n");
        int opc = 0;
        while (opc != 4){
            System.out.println("Elije una opcion: \n1° Sumar\n2° Restar\n3° Multiplicar\n4°Salir ");
            System.out.println("Opcion: ");opc= scan.nextInt();

            switch (opc) {
                case 1:
                    numeros = pedirNumeros(scan);
                    int suma = Suma(numeros);
                    System.out.println("La suma es: " + suma);
                    break;

                case 2:
                    numeros = pedirNumeros(scan);
                    int resta = Resta(numeros);
                    System.out.println("La resta es: " + resta);
                    break;

                case 3:
                    numeros = pedirNumeros(scan);
                    int producto = Multiplicacion(numeros);
                    System.out.println("El producto es: " + producto);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion Inexistente\n");
                    break;
            }
        }
        scan.close();
    }

    public static ArrayList<Integer> pedirNumeros(Scanner scan) {
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scan.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros.add(scan.nextInt());
        }
        return numeros;
    }
}