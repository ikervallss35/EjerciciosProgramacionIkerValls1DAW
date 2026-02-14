package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
class Autor {
    private String codAutor;
    private String nomAutor;
    private List<Libro> libroList = new ArrayList<>();

    public Autor(String codAutor, String nomAutor) {
        this.codAutor = codAutor;
        this.nomAutor = nomAutor;
    }public String getCodAutor() {
        return codAutor;
    }public String getNomAutor() {
        return nomAutor;
    }public List<Libro> getLibroList() {
        return libroList;
    }public void addLibro(Libro libro) {
        this.libroList.add(libro);
        libro.getAutorList().add(this);
    }@Override
    public String toString() {
        return "Autor{" + "codAutor='" + codAutor + '\'' + ", nomAutor='" + nomAutor + '\'' + '}';
    }
}