package e2;

public class E2 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4.0, 4.0, "Estilo 1");
        triangulo.mostrarInformacion();
        triangulo.mostrarEstilo();
        System.out.println("El area es: " + triangulo.area());
    }
}
