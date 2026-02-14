package Ejercicio9;
import java.util.List;
import java.util.ArrayList;
class CasaSubasta {
    private String nombre;
    private String direccion;
    private List<Subasta> subastaList = new ArrayList<>();

    public CasaSubasta(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
}public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public String getDireccion() {
        return direccion;
    }public void setDireccion(String direccion) {
        this.direccion = direccion;
    }public List<Subasta> getSubastaList() {
        return subastaList;
    }public void setSubastaList(List<Subasta> subastaList) {
        this.subastaList = subastaList;
    }
}