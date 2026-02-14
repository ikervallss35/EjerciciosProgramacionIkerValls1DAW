package Ejercicio8;
import java.util.ArrayList;
import java.util.List;
class Intervencion {
    private String idIntervencion;
    private String fechaIntervencion;
    private String tipoIntervencion;
    private Medico medico;
    private Paciente paciente;
    private List<Prescribe> prescribeList = new ArrayList<>();

    public Intervencion(String idIntervencion, String fechaIntervencion, String tipoIntervencion, Medico medico, Paciente paciente) {
        this.idIntervencion = idIntervencion;
        this.fechaIntervencion = fechaIntervencion;
        this.tipoIntervencion = tipoIntervencion;
        this.medico = medico;
        this.medico.getIntervencionList().add(this);
        this.paciente = paciente;
        this.paciente.getIntervencionList().add(this);
    }public String getIdIntervencion() {
        return idIntervencion;
    }public void setIdIntervencion(String idIntervencion) {
        this.idIntervencion = idIntervencion;
    }public String getFechaIntervencion() {
        return fechaIntervencion;
    }public void setFechaIntervencion(String fechaIntervencion) {
        this.fechaIntervencion = fechaIntervencion;
    }public String getTipoIntervencion() {
        return tipoIntervencion;
    }public void setTipoIntervencion(String tipoIntervencion) {
        this.tipoIntervencion = tipoIntervencion;
    }public Medico getMedico() {
        return medico;
    }public void setMedico(Medico medico) {
        this.medico = medico;
    }public Paciente getPaciente() {
        return paciente;
    }public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }public List<Prescribe> getPrescribeList() {
        return prescribeList;
    }public void setPrescribeList(List<Prescribe> prescribeList) {
        this.prescribeList = prescribeList;
    }@Override
    public String toString() {
        return "Intervencion{" + "paciente=" + paciente.getDniPaciente() + ", medico=" + medico.getNumeroColegiado() + ", tipoIntervencion='" + tipoIntervencion + '\'' + ", fechaIntervencion='" + fechaIntervencion + '\'' + '}';
    }
}