package e3;

public class Equipo {
    private String nombre, ciudad;
    private int puntos;

    public Equipo(String ciudad) {
        this("Anónimos", ciudad);
    }

    public Equipo(String nombre, String ciudad) {
        this(nombre, ciudad, 0);
    }

    public Equipo(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    public void actualiza(String nombre){
        this.nombre = nombre;
    }

    public void actualiza(int puntos){
        this.puntos = puntos;
    }

    public void actualiza(String nombre, int puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPuntos() {
        return puntos;
    }
}
