package blog;
public class EntradaTexto extends Entrada {
    private String contenido;
    public EntradaTexto(String id, Autor autor, String fecha, Blog blog, String contenido) {
        super(id, autor, fecha, blog);
        this.contenido = contenido;
    }public String getContenido() {
        return contenido;
    }@Override
    public String toString() {
        return "[TEXTO] Autor: " + getAutor().getNombre() + " | Fecha: " + getFecha() + " | Likes: " + getLikes() + " | Contenido: " + contenido;
    }
}