import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Ingrese primer número: ");
        a = sc.nextInt();

        System.out.print("Ingrese segundo número: ");
        b = sc.nextInt();
        int i = a;

        while (i <= b) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}