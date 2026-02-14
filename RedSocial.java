package redsocial;
import java.util.ArrayList;
import java.util.List;
public class RedSocial {
    private String nombre;
    private List<Mensaje> mensajeList = new ArrayList<>();
    private List<Usuario> usuarioList = new ArrayList<>();

    public RedSocial(String nombre) {
        this.nombre = nombre;
    }public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public List<Mensaje> getMensajeList() {
        return mensajeList;
    }public void setMensajeList(List<Mensaje> mensajeList) {
        this.mensajeList = mensajeList;
    }public List<Usuario> getUsuarioList() {
        return usuarioList;
    }public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
}