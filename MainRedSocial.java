package redsocial;
import java.util.List;
public class MainRedSocial {
    private List<Mensaje> mensajesUsuario(Usuario usuario){
        List<Mensaje> mensajes = usuario.getMensajeList();
        return mensajes;
    }public static void main(String[] args) {
        RedSocial redSocial = new RedSocial("X");
        Usuario pepe = new Usuario("pepe",redSocial);
        Usuario maria = new Usuario("maria",redSocial);
        Usuario juan = new Usuario("juan",redSocial);
        Mensaje t1 = new Texto("88",pepe,"HOY",redSocial,"Este es el primer mensaje");
        Mensaje f2 = new Fotografia("99",maria,"ayer",redSocial,"Título","foto.jpg");
        t1.darLike();
        Comentario c1 = new Comentario(pepe,"Hola",f2);
        Comentario c2 = new Comentario(juan,"Adiós",f2);
    }
}