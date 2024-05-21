import java.util.List;

public class Paciente extends Persona{

    private ExpedienteMedico expedienteMedico;
    private List<CitaMedica> citasMedicas;

    public Paciente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
    }
}
