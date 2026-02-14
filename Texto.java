package redsocial;
public class Texto extends Mensaje {
    private String contenido;
    public Texto(String id, Usuario usuario, String fecha, RedSocial redSocial, String contenido) {
        super(id, usuario, fecha, redSocial);
        this.contenido = contenido;
    }public String getContenido() {
        return contenido;
    }public void setContenido(String contenido) {
        this.contenido = contenido;
    }@Override
        public String toString() {
            return "[TEXTO] Autor: " + getUsuario().getNombre() + " | Fecha: " + getFecha() + " | Likes: " + getLikes() + " | Contenido: " + contenido;
        }
    }