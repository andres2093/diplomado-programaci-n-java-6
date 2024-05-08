package e2;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {

    private LocalDate fechaTerminacion;

    public ProfesorInterino(String nombre, String apellidos, int idProfesor, LocalDate fechaTerminacion) {
        super(nombre, apellidos, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("FechaTerminacion: " + fechaTerminacion);
    }
}
