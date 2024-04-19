package e1;

public class Primitivos {
    public static void main(String[] args) {
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.5F;
        double valorDouble = 1.5;

        System.out.println("valorByte " + valorByte);
        System.out.println("valorShort " + valorShort);
        System.out.println("valorInt " + valorInt);
        System.out.println("valorLong " + valorLong);
        System.out.println("valorFloat " + valorFloat);
        System.out.println("valorDouble " + valorDouble);

        boolean valorBoolean = true;
        char valorChar = 'B';

        System.out.println("valorBoolean " + valorBoolean);
        System.out.println("valorChar " + valorChar);

//        casteo
        int numInt1 = (int) valorFloat;
        System.out.println("numInt1 " + numInt1);

        int numInt1Parse = Integer.parseInt("50");
        System.out.println("numInt1Parse " + numInt1Parse);

        int numInt2 = valorChar;
        System.out.println("numInt2 " + numInt2);

//        int numInt3 = (int) valorBoolean;
//        System.out.println("binario bool " + numInt3);

        int numInt4 = valorInt + 1;
        System.out.println("numInt4 " + numInt4);
        numInt4++;
        System.out.println("sobrecarga de operadores " + numInt4);

        valorChar++;
        System.out.println("sobrecarga de operadores con char " + valorChar);
    }
}
