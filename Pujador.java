package Ejercicio9;
import java.util.ArrayList;
import java.util.List;
class Pujador {
    private String nombrePujador;
    private List<Puja> pujaList = new ArrayList<>();

    public Pujador(String nombrePujador) {
        this.nombrePujador = nombrePujador;
    }public String getNombrePujador() {
        return nombrePujador;
    }public void addPuja(Puja puja) {
        this.pujaList.add(puja);
    }public List<Puja> getPujaList() {
        return pujaList;
    }public void setPujaList(List<Puja> pujaList) {
        this.pujaList = pujaList;
    }
}