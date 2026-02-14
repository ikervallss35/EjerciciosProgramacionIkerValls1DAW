package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
class Libro {
    private String ISBN;
    private String nomLibro;
    private Editorial editorial;
    private List<Autor> autorList = new ArrayList<>();
    private Tema tema;
    private List<Ejemplar> ejemplarList = new ArrayList<>();

    public Libro(String ISBN, String nomLibro, Tema tema,  Editorial editorial) {
            this.ISBN = ISBN;
            this.nomLibro = nomLibro;
            this.tema = tema;
            this.tema.getLibroList().add(this);
            this.editorial = editorial;
            this.editorial.getLibroList().add(this);
    }public String getISBN() {
        return ISBN;
    }public String getNomLibro() {
        return nomLibro;
    }public Tema getTema() {
        return tema;
    }public Editorial getEditorial() {
        return editorial;
    }public List<Autor> getAutorList() {
        return autorList;
    }public void addAutor(Autor autor) {
        this.autorList.add(autor);
        autor.getLibroList().add(this);
    }public List<Ejemplar> getEjemplarList() {
        return ejemplarList;
    }@Override
    public String toString() {
        return "Llibre{" + "ISBN='" + ISBN + '\'' + ", nomLibro='" + nomLibro + '\'' + ", tema=" + tema.getNombreTema() + ", editorial=" + editorial.getNombreEditorial() + '}';
    }
}