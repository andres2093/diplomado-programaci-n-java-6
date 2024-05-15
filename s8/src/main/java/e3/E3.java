package e3;

import java.time.LocalDate;
import java.time.Month;

public class E3 {
    public static void main(String[] args) {
        String nombre = "Beto";
        int edad = 23;
        float promedio = 8.4F;
        LocalDate fecha_nacimiento = LocalDate.of(2024, Month.MAY, 14);

        System.out.println("Nombre " + nombre + " edad " + edad + " promedio " + promedio + " fecha " + fecha_nacimiento);

        System.out.printf("Nombre %s, edad %d, promedio %f, fecha %4$te %4$tb, %4$ty\n", nombre, edad, promedio, fecha_nacimiento);

        System.out.printf("Nombre |%-8s|, edad %d, promedio %.2f, fecha %4$te %4$tb, %4$ty\n", nombre, edad, promedio, fecha_nacimiento);

        System.out.printf("Mi nombre es |%-8s|%n tengo %d años %n mi promedio es de %.2f%n y nací el día %4$td %4$tb, %4$tY",
                nombre, edad, promedio, fecha_nacimiento
        );
    }
}
