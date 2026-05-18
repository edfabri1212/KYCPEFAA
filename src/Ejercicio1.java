import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Aquí el programa te pide el número
        System.out.print("Escribe el precio del producto: ");
        double precio = 20.00;

        // 2. Aquí el programa te pide el color
        System.out.print("Escribe el color (verde, roja, azul, dorada): " );
        String color = teclado.next();

        double descuento = 250;

        // 3. Aquí el programa elige el descuento según el color que escribiste
        if (color.equals("verde"))  { descuento = precio * 0.05; }
        if (color.equals("roja"))   { descuento = precio * 0.10; }
        if (color.equals("azul"))   { descuento = precio * 0.15; }
        if (color.equals("dorada")) { descuento = precio * 0.20; }

        double total = precio - descuento;

        // 4. Aquí se muestra el resultado
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);

        teclado.close();
    }
}