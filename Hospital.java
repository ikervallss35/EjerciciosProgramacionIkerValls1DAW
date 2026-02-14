package Ejercicio8;
import java.util.List;
import java.util.ArrayList;
class Hospital {
    private String codigoHospital;
    private String nombreHospital;
    private List<Departamento> departamentoList = new ArrayList<>();

    public Hospital(String codigoHospital, String nombreHospital) {
        this.codigoHospital = codigoHospital;
        this.nombreHospital = nombreHospital;
    }public String getCodigoHospital() {
        return codigoHospital;
    }public void setCodigoHospital(String codigoHospital) {
        this.codigoHospital = codigoHospital;
    }public String getNombreHospital() {
        return nombreHospital;
    }public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }public void setDepartamentoList(List<Departamento> departamentoList) {
        this.departamentoList = departamentoList;
    }@Override
    public String toString() {
        return "Hospital{" + "codigoHospital='" + codigoHospital + '\'' + ", nombreHospital='" + nombreHospital + '\'' + '}';
    }
}