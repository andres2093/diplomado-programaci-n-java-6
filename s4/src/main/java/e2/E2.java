package e2;

public class E2 {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Ford", "Shelby", 1965, 25000);
        Automovil automovil2 = new Automovil("Ferrari", "Veyron", 2009, 10000);
        Automovil automovil3 = new Automovil("Nissan", "Tsuru", 2010, 12000);

        System.out.println("Auto 1, hash: " + automovil.hashCode());
        System.out.println("Auto 2, hash: " + automovil2.hashCode());
        System.out.println("Auto 3, hash: " + automovil3.hashCode());

        System.out.println("Auto 1: " + automovil);
        System.out.println("Auto 2: " + automovil2);
        System.out.println("Auto 3: " + automovil3);
    }
}
