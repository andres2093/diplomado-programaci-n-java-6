package e1;

import java.util.Scanner;

public class Polimorfismo {
    public static void main(String[] args) {
        Venado venado = new Venado(24);
        venado.camina();
        venado.comerPlantas();

        System.out.println("Venado: " + (venado instanceof Venado));
        System.out.println("Animal: " + (venado instanceof Animal));
        System.out.println("Hervivoro: " + (venado instanceof Hervivoro));
        System.out.println("Object: " + (venado instanceof Object));
//        System.out.println("Object: " + (venado instanceof Scanner)); // False
    }
}
