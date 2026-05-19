import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, suma = 0;
        char continuar;

        do {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();
            suma += num;

            System.out.print("¿Desea seguir? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's');

        System.out.println("La suma es: " + suma);
    }
}