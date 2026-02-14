package Ejercicio5;
import java.util.ArrayList;
import java.util.List;
public class CuentaCorriente {
    private String n_cc;
    private Sucursal sucursal;
    private List<RelacionCC> relacionCCList = new ArrayList<>();
    private List<Domiciliacion> domiciliacionList = new ArrayList<>();

    public CuentaCorriente(String n_cc, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.sucursal.getCcList().add(this);
    }public String getN_cc() {
        return n_cc;
    }public Sucursal getSucursal() {
        return sucursal;
    }public List<RelacionCC> getRelacionCCList() {
        return relacionCCList;
    }public List<Domiciliacion> getDomiciliacionList() {
        return domiciliacionList;
    }@Override
    public String toString() {
        return "CuentaCorriente: " + n_cc + ", sucursal: " + sucursal.getN_suc();
    }
}