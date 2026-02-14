package Animales;
public class Entrenador extends Mamifero {
    public Entrenador(String nombre) {
        super(nombre);
    }@Override
    public void comunicarse() {
        System.out.println("Soy el entrenador");
    }public void entrenar(Jugar animalQueSabeJugar) {
        animalQueSabeJugar.saltarPorUnAro();
    }public void dejarEntrar(Animal animal) {
        if (animal instanceof Jugar) {
            System.out.println("Pasa y te entreno");
        } else {
            throw new IllegalArgumentException(animal.getClass().getName() + " no implementa la interfaz Jugar");
        }
    }
}