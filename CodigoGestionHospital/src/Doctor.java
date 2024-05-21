import java.util.List;

public class Doctor extends Persona implements GestionCitas{

    private List<Paciente> pacientes;
    private List<EspecialidadesMedicas> especialidadesMedicas;
    private List<CitaMedica> citasMedicas;

    private String identificacionDoctor;
    private String especialidad;

    public Doctor(String nombre, String identificacion, String direccion, String identificacionDoctor, String especialidad) {
        super(nombre, identificacion, direccion);
        this.identificacionDoctor = identificacionDoctor;
        this.especialidad = especialidad;
    }

    public String getIdentificacionDoctor() {
        return identificacionDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void programar() {

    }

    @Override
    public void cancelar() {

    }

    @Override
    public void realizarCitasMedicas() {

    }
}