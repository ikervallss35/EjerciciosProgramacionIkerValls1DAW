package Ejercicio9;
import java.util.ArrayList;
import java.util.List;
class Subasta {
    private String nombreSubasta;
    private CasaSubasta casaSubasta;
    private String fecha;
    private List<Lote> loteList = new ArrayList<>();

    public Subasta(String nombreSubasta, CasaSubasta casaSubasta, String fecha) {
        this.nombreSubasta = nombreSubasta;
        this.casaSubasta = casaSubasta;
        this.casaSubasta.getSubastaList().add(this);
        this.fecha = fecha;
    }public String getNombreSubasta() {
        return nombreSubasta;
    }public void setNombreSubasta(String nombreSubasta) {
        this.nombreSubasta = nombreSubasta;
    }public CasaSubasta getCasaSubasta() {
        return casaSubasta;
    }public void setCasaSubasta(CasaSubasta casaSubasta) {
        this.casaSubasta = casaSubasta;
    }public String getFecha() {
        return fecha;
    }public void setFecha(String fecha) {
        this.fecha = fecha;
    }public List<Lote> getLoteList() {
        return loteList;
    }public void setLoteList(List<Lote> loteList) {
        this.loteList = loteList;
    }
}