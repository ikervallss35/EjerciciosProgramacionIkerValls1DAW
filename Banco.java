package Ejercicio5;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    private String n_ent;
    private List<Sucursal> sucursalList = new ArrayList<>();

    public Banco(String n_ent) {
        this.n_ent = n_ent;
    }public String getN_ent() {
        return n_ent;
    }public void setN_ent(String n_ent) {
        this.n_ent = n_ent;
    }public List<Sucursal> getSucursalList() {
        return sucursalList;
    }public void setSucursalList(List<Sucursal> sucursalList) {
        this.sucursalList = sucursalList;
    }@Override
    public String toString() {
        return "Banco: " + n_ent;
    }
}