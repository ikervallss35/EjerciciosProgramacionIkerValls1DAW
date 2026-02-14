package Animales;
public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }public void mamar() {
        System.out.println("Cuando soy pequeño mamo");
    }@Override
    public void respirar(){
        System.out.println("Respiro aire por los pulmones");
    }@Override
    public void moverse(){
        System.out.println("Me muevo a 4 patas");
    }@Override
    public void comunicarse(){
        System.out.println("Soy un mamifero");
    }@Override
    public String toString() {
        return "Mamifero: " + getNombre();
    }
}