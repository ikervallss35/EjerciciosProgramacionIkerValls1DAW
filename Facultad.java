package Ejercicio6;
import java.util.ArrayList;
import java.util.List;
class Facultad {
    private String id_fac;
    private String nombre_fac;
    private List<Catedra> catedras = new ArrayList<>();

    public Facultad(String id_fac, String nombre_fac) {
        this.id_fac = id_fac;
        this.nombre_fac = nombre_fac;
    }public String getId_fac() {
        return id_fac;
    }public String getNombre_fac() {
        return nombre_fac;
    }public void setNombre_fac(String nombre_fac) {
        this.nombre_fac = nombre_fac;
    }public List<Catedra> getCatedras() {
        return catedras;
    }@Override
    public String toString() {
        return "Facultad: " + nombre_fac + ", id_fac: " + id_fac + "\n";
    }

}