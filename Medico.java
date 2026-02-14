package Ejercicio8;
import java.util.ArrayList;
import java.util.List;
class Medico {
    private String numeroColegiado;
    private String nombreMedico;
    private List<Intervencion> intervencionList = new ArrayList<>();
    private List<Departamento> departamentoList = new ArrayList<>();

    public Medico(String numeroColegiado, String nombreMedico) {
        this.numeroColegiado = numeroColegiado;
        this.nombreMedico = nombreMedico;
    }public String getNumeroColegiado() {
        return numeroColegiado;
    }public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }public String getNombreMedico() {
        return nombreMedico;
    }public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }public List<Intervencion> getIntervencionList() {
        return intervencionList;
    }public void setIntervencionList(List<Intervencion> intervencionList) {
        this.intervencionList = intervencionList;
    }public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }public void setDepartamentoList(List<Departamento> departamentoList) {
        this.departamentoList = departamentoList;
    }public void addDepartamento(Departamento departamento){
        this.departamentoList.add(departamento);
        departamento.getMedicoList().add(this);
    }@Override
    public String toString() {
        return "Medico{" + "numeroColegiado='" + numeroColegiado + '\'' + ", nombreMedico='" + nombreMedico + '\'' + '}';
    }
}