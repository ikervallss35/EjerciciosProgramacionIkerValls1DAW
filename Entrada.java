package blog;
import java.util.ArrayList;
import java.util.List;
public abstract class Entrada {
    private String id;
    private Autor autor;
    private String fecha;
    private Blog blog;
    private int likes;
    private List<Comentario> comentarioList = new ArrayList<>();

    public Entrada(String id, Autor autor, String fecha, Blog blog) {
        this.id = id;
        this.autor = autor;
        this.fecha = fecha;
        this.blog = blog;
        this.likes = 0;
        this.autor.getEntradaList().add(this);
        this.blog.getEntradaList().add(this);
    }public String getId() {
        return id;
    }public Autor getAutor() {
        return autor;
    }public String getFecha() {
        return fecha;
    }public Blog getBlog() {
        return blog;
    }public int getLikes() {
        return likes;
    }public List<Comentario> getComentarioList() {
        return comentarioList;
    }public void darLike() {
        this.likes++;
    }
}