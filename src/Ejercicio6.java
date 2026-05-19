public class Ejercicio6 {
    public static void main(String[] args) {

        System.out.println("Los primeros 50 múltiplos de 5 son:");

        // El ciclo 'for' se repite desde el 1 hasta el 50
        for (int i = 1; i <= 50; i++) {

            // Multiplicamos el número actual por 5
            int multiplo = i * 5;

            // Lo mostramos en la pantalla de abajo con un espacio
            System.out.print(multiplo + " ");
        }

        System.out.println(); // Un salto de línea al final
    }
}
