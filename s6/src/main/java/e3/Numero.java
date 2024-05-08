package e3;

import java.util.Objects;

public class Numero {
    private String nombre;

    public Numero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Numero numero = (Numero) obj;

//        return nombre != null ? nombre.equals(numero.nombre) : numero.nombre == null;
        return Objects.equals(nombre, numero.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    public String getNombre() {
        return nombre;
    }
}
