package blog;
import java.util.ArrayList;
import java.util.List;
public class Blog {
    private String nombre;
    private List<Entrada> entradaList = new ArrayList<>();
    private List<Autor> autorList = new ArrayList<>();

    public Blog(String nombre) {
        this.nombre = nombre;
    }public String getNombre() {
        return nombre;
    }public List<Entrada> getEntradaList() {
        return entradaList;
    }public List<Autor> getAutorList() {
        return autorList;
    }
}