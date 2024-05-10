package e1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        Queue<String> cola = new PriorityQueue<>();
        cola.add("tres");
        cola.add("cuatro");
        cola.add("cinco");
        cola.add("uno");
        cola.add("dos");

        for (String s : cola) {
            System.out.println(s);
        }

        System.out.println();

        String valor;

        while ((valor = cola.poll()) != null) {
            System.out.println(valor);
        }

        System.out.println();

        Queue<Libro> libros = new PriorityQueue<>();
        libros.add(new Libro("uno", 9));
        libros.add(new Libro("dos", 10));
        libros.add(new Libro("tres", 8));
        libros.add(new Libro("cuatro", 7));
        libros.add(new Libro("cinco", 3));
        libros.add(new Libro("seis", 2));
        libros.add(new Libro("siete", 4));
        libros.add(new Libro("ocho", 6));
        libros.add(new Libro("nueve", 5));
        libros.add(new Libro("diez", 1));

        Libro libro;
        while ((libro = libros.poll()) != null) {
            System.out.println(libro.getTitulo() + ": " + libro.getPrioridad());
        }
    }
}
