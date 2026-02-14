package Animales;
import java.util.ArrayList;
public class MainAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Mamifero p = new Perro("Boby");
        Mamifero g = new Gato("Fabian");
        Pez t = new Tiburon("Shark");
        Pez pp = new PezPayaso("Nemo");
        Entrenador e = new Entrenador("Carlos");

        System.out.println("--- Acciones Base ---");
        p.comunicarse();
        t.respirar();
        pp.comunicarse();
        pp.moverse();

        System.out.println("\n--- Interfaces ---");
        e.entrenar((Jugar) g);
        e.entrenar((Jugar) t);

        System.out.println("\n--- Validación ---");
        try {
            e.dejarEntrar(p);
        } catch (IllegalArgumentException ex) {
            System.out.println("No puede entrar: " + ex.getMessage());
        }
        e.dejarEntrar(g);
    }
}