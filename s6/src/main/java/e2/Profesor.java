package e2;

public class Profesor extends Persona {

    private int idProfesor;

    public Profesor(String nombre, String apellidos, int idProfesor) {
        super(nombre, apellidos);
        this.idProfesor = idProfesor;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("IdProfesor: " + idProfesor);
    }
}
