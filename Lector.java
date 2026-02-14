package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
class Lector {
    private String DNI;
    private String nombre;
    private List<Ejemplar> ejemplarList = new ArrayList<>();
    private List<Historico> historicoList = new ArrayList<>();

    public Lector(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }public String getDNI() {
        return DNI;
    }public String getNombre() {
        return nombre;
    }public List<Ejemplar> getEjemplarList() {
        return ejemplarList;
    }public List<Historico> getHistoricoList() {
        return historicoList;
    }@Override
    public String toString() {
        return "Lector{" + "DNI='" + DNI + '\'' + ", nombreLector='" + nombre + '\'' + '}';
    }
}