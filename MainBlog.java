package blog;
public class MainBlog {
    public static void main(String[] args) {
        Blog blog = new Blog("MiBlog");

        Autor ana = new Autor("Ana", blog);
        Autor luis = new Autor("Luis", blog);

        Entrada e1 = new EntradaTexto("1", ana, "Hoy", blog, "Bienvenidos a mi blog!");

        Entrada e2 = new EntradaImagen("2", luis, "Ayer", blog, "Vacaciones", "playa.jpg", "Foto de mis vacaciones en la playa");

        e1.darLike();
        e2.darLike();
        e2.darLike();

        Comentario c1 = new Comentario(ana, "Qué bonito!", e2);
        Comentario c2 = new Comentario(luis, "Gracias!", e2);

        System.out.println(e1);
        System.out.println(e2);
    }
}