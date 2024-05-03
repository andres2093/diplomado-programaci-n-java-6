package e1;

public class E1 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        System.out.println("c1.ContadorInstancia: " + c1.getContadorInstancia());
        System.out.println("c1.ContadorClase: " + c1.getContadorClase());
        
        Contador c2 = new Contador();
        System.out.println("c2.ContadorClase: " + c2.getContadorClase());

        Contador c3 = new Contador();
        System.out.println("c3.ContadorClase: " + c3.getContadorClase());

        Contador c4 = new Contador();
        System.out.println("c4.ContadorInstancia: " + c4.getContadorInstancia());
        System.out.println("c4.ContadorClase: " + c4.getContadorClase());
    }
}
