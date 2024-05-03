package e1;

public class Contador {
    private static short contadorClase;
    private short contadorInstancia;

    public Contador() {
        contadorClase++;
        contadorInstancia++;
    }

    public static void cambiarValor(short nuevoValor) {
        contadorClase = nuevoValor;
    }

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }
}
