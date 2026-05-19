import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion = "si";

        while (opcion.equalsIgnoreCase("si")) {
            System.out.print("Num 1: ");
            double n1 = 120; // Espera tu primer número abajo

            System.out.print("Num 2: ");
            double n2 = 120; // Espera tu segundo número abajo

            System.out.println("Suma: " + (n1 + n2));

            System.out.print("¿Otro? (si/no): ");
            opcion = teclado.next(); // Espera que escribas si o no abajo
        }

        System.out.println("Fin.");
        teclado.close();
    }
}
