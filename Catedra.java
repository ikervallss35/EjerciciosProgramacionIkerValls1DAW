package Ejercicio6;
import java.util.ArrayList;
import java.util.List;
class Catedra {
    private String id_catedra;
    private String nombre_catedra;
    private Facultad facultad;
    private Departamento departamento;
    private List<Adscrito> adscritoList = new ArrayList();

    public Catedra(String id_catedra, String nombre_catedra, Facultad facultad, Departamento departamento) {
        this.id_catedra = id_catedra;
        this.nombre_catedra = nombre_catedra;
        this.facultad = facultad;
        this.facultad.getCatedras().add(this);
        this.departamento = departamento;
        this.departamento.getCatedraList().add(this);
    }public String getId_catedra() {
        return id_catedra;
    }public String getNombre_catedra() {
        return nombre_catedra;
    }public Facultad getFacultad() {
        return facultad;
    }public List<Adscrito> getAdscritoList() {
        return adscritoList;
    }public Departamento getDepartamento() {
        return departamento;
    }
    @Override
    public String toString() {
        return "Catedra: " + nombre_catedra + ", id_cat: " + id_catedra
                + ", departament: " + departamento.getCod_dep() +
                ", facultad: " + facultad.getNombre_fac() + "\n";
    }

}