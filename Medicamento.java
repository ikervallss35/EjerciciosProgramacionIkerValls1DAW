package Ejercicio8;
import java.util.ArrayList;
import java.util.List;
class Medicamento {
    private String idMedicamento;
    private String nombreMedicamento;
    private List<Prescribe> prescribeList = new ArrayList<>();

    public Medicamento(String idMedicamento, String nombreMedicamento) {
        this.idMedicamento = idMedicamento;
        this.nombreMedicamento = nombreMedicamento;
    }public String getIdMedicamento() {
        return idMedicamento;
    }public void setIdMedicamento(String idMedicamento) {
        this.idMedicamento = idMedicamento;
    }public String getNombreMedicamento() {
        return nombreMedicamento;
    }public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }public List<Prescribe> getPrescribeList() {
        return prescribeList;
    }public void setPrescribeList(List<Prescribe> prescribeList) {
        this.prescribeList = prescribeList;
    }@Override
    public String toString() {
        return "Medicamento{" + "idMedicamento='" + idMedicamento + '\'' + ", nombreMedicamento='" + nombreMedicamento + '\'' + '}';
    }
}