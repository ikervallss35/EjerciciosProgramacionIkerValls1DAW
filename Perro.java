package Animales;
final public class Perro extends Mamifero{
    public Perro(String nombre){
        super(nombre);
    }public void traerZapatillas(){
        System.out.println("Toma amo tus zapatillas");
    }@Override
    public void comunicarse() {
        System.out.println("Guau");
    }
}