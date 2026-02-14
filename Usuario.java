package redsocial;
import java.util.ArrayList;
import java.util.List;
public class Usuario {
    private String nombre;
    private RedSocial redSocial;
    private final List<Mensaje> mensajeList = new ArrayList<>();

    public Usuario(String nombre, RedSocial redSocial) {
        this.nombre = nombre;
        this.redSocial = redSocial;
        this.redSocial.getUsuarioList().add(this);
    }public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public RedSocial getRedSocial() {
        return redSocial;
    }public void setRedSocial(RedSocial redSocial) {
        this.redSocial = redSocial;
    }public List<Mensaje> getMensajeList() {
        return mensajeList;
    }
}