package e2;

import java.time.LocalDate;
import java.time.Month;

public class E2 {
    public static void main(String[] args) {
        System.out.println("************* Profesor *************");
        Profesor profesor = new Profesor("Andrés", "Ramírez", 55);
        profesor.mostrarDatos();

        System.out.println("************* ProfesorInterino *************");
        ProfesorInterino profesorInterino =
                new ProfesorInterino("Beto", "Bedu", 66,
                        LocalDate.of(2024, Month.MAY, 29));
        profesorInterino.mostrarDatos();
    }
}
