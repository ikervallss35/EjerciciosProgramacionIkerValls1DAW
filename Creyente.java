package Religiones;
public class Creyente {

    private String nombre;
    private Religion religion;

    public Creyente(String nombre, Religion religion) {
        this.nombre = nombre;
        this.religion = religion;
        religion.agregarCreyente(this); // relación bidireccional
    }

    public String getNombre() {
        return nombre;
    }

    public Religion getReligion() {
        return religion;
    }

    @Override
    public String toString() {
        return nombre + " (Religión: " + religion.getNombre() + ")";
    }
}