package Ejercicio6;
import java.util.ArrayList;
import java.util.List;
class Profesor {
    private String dni_prof;
    private String nom_prof;
    private Departamento departamento;
    private List<Adscrito> adscritoList = new ArrayList<>();

    public Profesor(String dni_prof, String nom_prof, Departamento departamento) {
        this.dni_prof = dni_prof;
        this.nom_prof = nom_prof;
        this.departamento = departamento;
        this.departamento.getProfesorList().add(this);
    }public String getDni_prof() {
        return dni_prof;
    }public String getNom_prof() {
        return nom_prof;
    }public void setNom_prof(String nom_prof) {
        this.nom_prof = nom_prof;
    }public Departamento getDepartamento() {
        return departamento;
    }public List<Adscrito> getAdscritoList() {
        return adscritoList;
    }@Override
    public String toString() {
        return "Professor: " + nom_prof + ", DNI: " + dni_prof
                + ", departament: " + departamento.getCod_dep() + "\n";
    }
}