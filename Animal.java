package Animales;
public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public abstract void comunicarse();
    public abstract void respirar();
    public abstract void moverse();
    @Override
    public String toString() {
        return "Animal: " + nombre;
    }
}