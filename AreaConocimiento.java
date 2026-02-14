package Ejercicio6;
import java.util.ArrayList;
import java.util.List;
class AreaConocimiento {
    private String cod_con;
    private String nombreAC;
    private List<Departamento> departamentoList = new ArrayList<>();

    public AreaConocimiento(String cod_con, String nombreAC) {
        this.cod_con = cod_con;
        this.nombreAC = nombreAC;
    }public String getCod_con() {
        return cod_con;
    }public void setCod_con(String cod_con) {
        this.cod_con = cod_con;
    }public String getNombreAC() {
        return nombreAC;
    }public void setNombreAC(String nombreAC) {
        this.nombreAC = nombreAC;
    }public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }@Override
    public String toString() {
        return "AreaConeixement {" + " id_ac = " + cod_con +
                ", nombre = " + nombreAC + " }\n";
    }
}