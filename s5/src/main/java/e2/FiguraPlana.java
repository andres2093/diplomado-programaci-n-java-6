package e2;

public class FiguraPlana {
    private final double base, altura;

    public FiguraPlana(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    void mostrarInformacion(){
        System.out.println("Base: " + base  + " ,Altura " + altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
