package Ejercicio8;
import java.util.List;
import java.util.ArrayList;
class Departamento {
    private String codigoDepartamento;
    private String nombreDepartamento;
    private Hospital hospital;
    private List<Medico> medicoList = new ArrayList<>();

    public Departamento(String codigoDepartamento, String nombreDepartamento, Hospital hospital) {
        this.codigoDepartamento = codigoDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.hospital = hospital;
        this.hospital.getDepartamentoList().add(this);
    }public String getCodigoDepartamento() {
        return codigoDepartamento;
    }public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }public String getNombreDepartamento() {
        return nombreDepartamento;
    }public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }public Hospital getHospital() {
        return hospital;
    }public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }public List<Medico> getMedicoList() {
        return medicoList;
    }public void setMedicoList(List<Medico> medicoList) {
        this.medicoList = medicoList;
    }public void addMedico(Medico medico){
        medicoList.add(medico);
        medico.getDepartamentoList().add(this);
    }@Override
    public String toString() {
        return "Departamento{" + "codigoDepartamento='" + codigoDepartamento + '\'' + ", nombreDepartamento='" + nombreDepartamento + '\'' + ", hospital=" + hospital + '}';
    }
}