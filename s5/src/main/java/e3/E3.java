package e3;

public class E3 {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("GDL", "Cuervos", 100);
        Equipo e2 = new Equipo("CDMX");

        System.out.println("Equipo 1: " + e1.getNombre() + " de " + e1.getCiudad() + " tiene " + e1.getPuntos());
        System.out.println("Equipo 2: " + e2.getNombre() + " de " + e2.getCiudad() + " tiene " + e2.getPuntos());

        e2.actualiza(100);
        e2.actualiza("Gladiadores");

        System.out.println("Equipo 2: " + e2.getNombre() + " de " + e2.getCiudad() + " tiene " + e2.getPuntos());
    }
}
