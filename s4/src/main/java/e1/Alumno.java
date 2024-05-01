package e1;

public class Alumno {
    private String curso, objetivo;
    private byte sesion;

    {
        curso = "Java SE";
        objetivo = "Dominar Java";
        sesion = 4;
    }

    {
        curso = "JAVA SE 2024";
    }

//    public Alumno() {
//        this.curso = "curso";
//        this.objetivo = "objetivo";
//        this.sesion = 1;
//    }
//
//    public Alumno(String curso, String objetivo, byte sesion) {
//        this.curso = curso;
//        this.objetivo = objetivo;
//        this.sesion = sesion;
//    }

    public String getCurso() {
        return curso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public byte getSesion() {
        return sesion;
    }
}
