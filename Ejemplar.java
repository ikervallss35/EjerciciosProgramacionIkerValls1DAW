package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
class Ejemplar {
    private String n_reg;
    private Libro libro;
    private Lector lector;
    private String data_p;
    private List<Historico> historicoList = new ArrayList<>();

    public Ejemplar(String n_reg, Libro libro, Lector lector, String data_p) {
        this.n_reg = n_reg;
        this.libro = libro;
        this.lector = lector;
        this.data_p = data_p;
    }public String getN_reg() {
        return n_reg;
    }public Libro getLibro() {
        return libro;
    }public Lector getLector() {
        return lector;
    }public String getData_p() {
        return data_p;
    }public List<Historico> getHistoricoList() {
        return historicoList;
    }@Override
    public String toString() {
        return "Ejemplar{" + "n_reg='" + n_reg + '\'' + ", lector=" + lector.getDNI() + ", data_p='" + data_p + '\'' + '}';
    }
}