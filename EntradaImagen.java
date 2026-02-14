package blog;
public class EntradaImagen extends Entrada {
    private String titulo;
    private String fichero;
    private String contenido;
    public EntradaImagen(String id, Autor autor, String fecha, Blog blog, String titulo, String fichero, String contenido) {
        super(id, autor, fecha, blog);
        this.titulo = titulo;
        this.fichero = fichero;
        this.contenido = contenido;
    }public String getTitulo() {
        return titulo;
    }public String getFichero() {
        return fichero;
    }public String getContenido() {
        return contenido;
    }@Override
    public String toString() {
        return "[IMAGEN] Autor: " + getAutor().getNombre() + " | Fecha: " + getFecha() + " | Likes: " + getLikes() + " | Título: " + titulo + " | Fichero: " + fichero + " | Contenido: " + contenido;
    }
}