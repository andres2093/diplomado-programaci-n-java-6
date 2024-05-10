package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class E2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", "Ramirez", 1.72F);
        Persona persona2 = new Persona("Andrés", "Cortés", 1.78F);
        Persona persona3 = new Persona("Abigail", "Lopez", 1.62F);
        Persona persona4 = new Persona("Monica", "Gonzalez", 1.55F);
        Persona persona5 = new Persona("Laura", "Gomez", 1.77F);

        List<Persona> personas = new LinkedList<>();
        Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);
        Collections.sort(personas);

        for (Persona p : personas) {
            System.out.println(p.getNombre() + " " + p.getApellido() + " " + p.getEstatura());
        }
    }
}
