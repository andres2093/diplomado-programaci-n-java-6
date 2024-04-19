package e3;

public class ForWhile {
    public static void main(String[] args) {
//        String[] meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
//                "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
//
//        for (String mese : meses) {
//            System.out.println(mese);
//        }
//
//        for (int i = 0; i < meses.length; i++) {
//            System.out.println(meses[i]);
//        }

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("--------------");
        short[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("--------------");
        for (int i = 0; i < valores.length; i+=2) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("--------------");
        for (short val : valores) {
            System.out.print(val + " ");
        }

        System.out.println("--------------");

        short i = 0;
        while(i++ <= 10){
            System.out.print(" " + i);
        }

        System.out.println("--------------");

        i = 0;
        do {
            System.out.print(" " + i);
        } while (i++ <= 10);
    }
}
