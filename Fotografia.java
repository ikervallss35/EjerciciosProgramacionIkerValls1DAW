package redsocial;
public class Fotografia extends Mensaje {
    private String titulo;
    private String fichero;
    public Fotografia(String id, Usuario usuario, String fecha, RedSocial redSocial, String titulo, String fichero) {
        super(id, usuario, fecha, redSocial);
        this.titulo = titulo;
        this.fichero = fichero;
    }public String getTitulo() {
        return titulo;
    }public void setTitulo(String titulo) {
        this.titulo = titulo;
    }public String getFichero() {
        return fichero;
    }public void setFichero(String fichero) {
        this.fichero = fichero;
    }@Override
        public String toString() {
            return "[FOTO] Autor: " + getUsuario().getNombre() + " | Fecha: " + getFecha() + " | Likes: " + getLikes() + " | Título: " + titulo + " | Fichero: " + fichero;
        }
    }