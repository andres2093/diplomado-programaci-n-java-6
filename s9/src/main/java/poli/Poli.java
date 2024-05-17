package poli;

public class Poli {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.hacerSonido();
        gato.hacerSonido("Dame comida!!!");
        Animal perro = new Perro();
        perro.hacerSonido();
    }
}

class Animal {
    public void hacerSonido(){
        System.out.println("Grr...");
    }
    public void hacerSonido(String custom) {
        System.out.println(custom);
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Meow");
    }
    @Override
    public void hacerSonido(String custom) {
        System.out.println(custom);
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Woof");
    }
}
