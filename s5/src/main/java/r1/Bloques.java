package r1;

public class Bloques {
    public static int VALOR = 99;

    static {
        VALOR = 2;
    }

    public static void muestaValor(){
        System.out.println("valor: " + VALOR);
    }
}
