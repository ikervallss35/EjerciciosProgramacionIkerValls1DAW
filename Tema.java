package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
class Tema{
    private String codTema;
    private String nombreTema;
    private List<Libro> libroList = new ArrayList<>();

    public Tema(String codTema, String nombreTema) {
        this.codTema = codTema;
        this.nombreTema = nombreTema;
    }public String getCodTema() {
        return codTema;
    }public String getNombreTema() {
        return nombreTema;
    }public List<Libro> getLibroList() {
        return libroList;
    }@Override
    public String toString() {
        return "Tema{" + "codTema='" + codTema + '\'' + ", nombreTema='" + nombreTema + '\'' + '}';
    }
}