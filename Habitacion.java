package Ejercicio8;
import java.util.ArrayList;
import java.util.List;
class Habitacion {
    private int numeroHabitacion;
    private int capacidadHabitacion;
    private List<Paciente> pacienteList = new ArrayList<>();

    public Habitacion(int numeroHabitacion, int capacidadHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.capacidadHabitacion = capacidadHabitacion;
    }public int getNumeroHabitacion() {
        return numeroHabitacion;
    }public void setNombreHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }public int getCapacidadHabitacion() {
        return capacidadHabitacion;
    }public void setCapacidadHabitacion(int capacidadHabitacion) {
        this.capacidadHabitacion = capacidadHabitacion;
    }public List<Paciente> getPacienteList() {
        return pacienteList;
    }public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }public void addPaciente(Paciente paciente){
        this.pacienteList.add(paciente);
    }@Override
    public String toString() {
        return "Habitacion{" + "nombreHabitacion='" + numeroHabitacion + '\'' + ", capacidadHabitacion=" + capacidadHabitacion + '}';
    }
}