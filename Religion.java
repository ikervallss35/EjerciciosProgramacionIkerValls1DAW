package Religiones;
import java.util.ArrayList;
import java.util.List;
public abstract class Religion {
    private String nombre;
    private String libroSagrado;
    private List<Creyente> creyentes = new ArrayList<>();

    public Religion(String nombre, String libroSagrado) {
        this.nombre = nombre;
        this.libroSagrado = libroSagrado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLibroSagrado() {
        return libroSagrado;
    }

    public List<Creyente> getCreyentes() {
        return creyentes;
    }

    public void agregarCreyente(Creyente c) {
        creyentes.add(c);
    }

    public abstract void rezar();

    @Override
    public String toString() {
        return nombre + " | Libro sagrado: " + libroSagrado +
                " | Creyentes: " + creyentes.size();
    }
}
