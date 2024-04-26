package e2;

public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe la palabra: ");
        String palabra = lector.leeEntrada();

        ContadorCaracteres caracteres = new ContadorCaracteres();

        System.out.println("Hay " + caracteres.cuentaVocales(palabra) + " vocales");
        System.out.println("Hay " + caracteres.cuentaNumeros(palabra) + " numeros");
        System.out.println("Hay " + caracteres.cuentaConsonantes(palabra) + " consonantes");
        System.out.println("Hay " + caracteres.cuentaSimbolos(palabra) + " simbolos");
    }
}
