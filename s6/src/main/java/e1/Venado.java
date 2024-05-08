package e1;

public class Venado extends Animal implements Hervivoro {

    public Venado(double velocidad) {
        super(velocidad);
    }

    @Override
    public void camina() {
        super.camina();
        System.out.println("Mandé llamar al método de caminar!!!");
    }

    @Override
    public void comerPlantas() {
        System.out.println("Comiendo plantas!!!");
    }
}
