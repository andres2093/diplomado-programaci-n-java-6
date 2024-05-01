package e2;

public class Automovil {
    private String marca, modelo;
    private int anioFabricacion, kilometraje;

    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
//        hash += marca.hashCode();
//        hash += modelo.hashCode();
        hash += anioFabricacion;
        hash += kilometraje;
        return hash;
    }

    @Override
    public String toString() {
        return marca + " km: " + kilometraje;
    }
}
