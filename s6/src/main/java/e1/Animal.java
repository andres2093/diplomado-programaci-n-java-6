package e1;

public class Animal {

    private double velocidad;

    public Animal(double velocidad) {
        this.velocidad = velocidad;
    }

    public void camina(){
        System.out.println("Estoy caminando a " + velocidad + " km/hr");
    }
}
