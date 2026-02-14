package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
class Editorial{
    private String codEd;
    private String nombreEditorial;
    private List<Libro> libroList = new ArrayList<>();

    public Editorial(String codEd, String nombreEditorial) {
        this.codEd = codEd;
        this.nombreEditorial = nombreEditorial;
    }public String getCodEd() {
        return codEd;
    }public String getNombreEditorial() {
        return nombreEditorial;
    }public List<Libro> getLibroList() {
        return libroList;
    }@Override
    public String toString() {
        return "Editorial{" + "codEd='" + codEd + '\'' + ", nombreEditorial='" + nombreEditorial + '\'' + '}';
    }
}