package Ejercicio5;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String dni;
    private List<Prestamo> prestamoList = new ArrayList<>();
    private List<RelacionCC> relacionCCList = new ArrayList<>();

    public Cliente(String dni) {
        this.dni = dni;
    }public String getDni() {
        return dni;
    }public List<Prestamo> getPrestamoList() {
        return prestamoList;
    }public List<RelacionCC> getRelacionCCList() {
        return relacionCCList;
    }@Override
    public String toString() {
        return "Cliente: " + dni;
    }
}