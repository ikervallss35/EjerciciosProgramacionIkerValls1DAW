package Ejercicio5;
import java.util.ArrayList;
import java.util.List;
public class Sucursal {
    private String n_suc;
    private Banco banco;
    private List<CuentaCorriente> ccList = new ArrayList<>();
    private List<Prestamo> prestamoList = new ArrayList<>();

    public Sucursal(String n_suc, Banco banco) {
        this.n_suc = n_suc;
        this.banco = banco;
        this.banco.getSucursalList().add(this);
    }public String getN_suc() {
        return n_suc;
    }public Banco getBanco() {
        return banco;
    }public List<CuentaCorriente> getCcList() {
        return ccList;
    }public List<Prestamo> getPrestamoList() {
        return prestamoList;
    }@Override
    public String toString() {
        return "Sucursal: " + n_suc + ", banco: " + banco.getN_ent();
    }
}