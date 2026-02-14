package Ejercicio9;
import java.util.ArrayList;
import java.util.List;
class Lote {
    private int numeroLote;
    private String descripcion;
    private Subasta subasta;
    private List<Articulo> articuloList = new ArrayList<>();
    private List<Puja> pujaList = new ArrayList<>();

    public Lote(int numeroLote, String descripcion, Subasta subasta) {
        this.numeroLote = numeroLote;
        this.descripcion = descripcion;
        this.subasta = subasta;
        this.subasta.getLoteList().add(this);
    }public int getNumeroLote() {
        return numeroLote;
    }public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }public String getDescripcion() {
        return descripcion;
    }public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }public Subasta getSubasta() {
        return subasta;
    }public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }public List<Articulo> getArticuloList() {
        return articuloList;
    }public void setArticuloList(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }public List<Puja> getPujaList() {
        return pujaList;
    }public void setPujaList(List<Puja> pujaList) {
        this.pujaList = pujaList;
    }
}