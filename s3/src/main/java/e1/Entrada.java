package e1;

import java.io.Console;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");

        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);

//        Segunda parte

        Console console = System.console();

        if (console == null) {
            System.out.println("No hay consola!!!");
            System.exit(1);
        }

//        String nombreConsola = console.readLine();
//        System.out.println("Escribe tu nombre: ");

        String nombreConsola = console.readLine("%s", "Escribe tu nombre: ");

        System.out.println("Hola " + nombreConsola);
    }
}
