package r2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", "Ramirez", 1.72F);
        Persona persona2 = new Persona("Andrés", "Cortés", 1.78F);
        Persona persona3 = new Persona("Abigail", "Lopez", 1.62F);
        Persona persona4 = new Persona("Monica", "Gonzalez", 1.55F);
        Persona persona5 = new Persona("Laura", "Gomez", 1.77F);
        Persona persona6 = new Persona("Alejandro", "López", 1.68F);

        List<Persona> personas = new ArrayList<>();
        Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5, persona6);

        personas.sort(new ComparadorPersonas());
//        Collections.sort(personas, new ComparadorInversoPersonas());

        for (Persona p : personas) {
            System.out.println(p.getNombre() + " " + p.getApellido());
        }
    }
}
