package e1;

public class E1 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();

        System.out.println("sesión " + alumno.getSesion());
        System.out.println("curso " + alumno.getCurso());
        System.out.println("objetivo " + alumno.getObjetivo());

//        Alumno alumno2 = new Alumno("JAVA", "Aprender", (byte) 1);
//
//        System.out.println("sesión " + alumno2.getSesion());
//        System.out.println("curso " + alumno2.getCurso());
//        System.out.println("objetivo " + alumno2.getObjetivo());
    }
}
