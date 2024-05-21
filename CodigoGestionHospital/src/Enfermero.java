import java.util.List;

public class Enfermero extends Persona {

    private List<Paciente> pacientes;
    private List<Doctor> doctores;

    public Enfermero(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
    }
}
