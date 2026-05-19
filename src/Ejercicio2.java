import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, i = 0;

        System.out.print("Ingrese un número: ");
        num = sc.nextInt();

        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}