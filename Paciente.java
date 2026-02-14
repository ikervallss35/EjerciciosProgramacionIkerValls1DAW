package Ejercicio8;
import java.util.ArrayList;
import java.util.List;
class Paciente {
    private String dniPaciente;
    private String nombrePaciente;
    private Habitacion habitacion;
    private List<Intervencion> intervencionList = new ArrayList<>();

    public Paciente(String dniPaciente, String nombrePaciente, Habitacion habitacion) {
        this.dniPaciente = dniPaciente;
        this.nombrePaciente = nombrePaciente;
        this.habitacion = habitacion;
        this.habitacion.getPacienteList().add(this);
    }public String getDniPaciente() {
        return dniPaciente;
    }public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }public String getNombrePaciente() {
        return nombrePaciente;
    }public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }public Habitacion getHabitacion() {
        return habitacion;
    }public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }public List<Intervencion> getIntervencionList() {
        return intervencionList;
    }public void setIntervencionList(List<Intervencion> intervencionList) {
        this.intervencionList = intervencionList;
    }@Override
    public String toString() {
        return "Paciente{" + "dniPaciente='" + dniPaciente + '\'' + ", nombrePaciente='" + nombrePaciente + '\'' + ", habitacion=" + habitacion.getNumeroHabitacion() + '}';
    }
}