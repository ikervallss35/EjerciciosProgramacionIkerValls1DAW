package Animales;
final public class PezPayaso extends Pez{
    public PezPayaso(String nombre){
        super(nombre);
    }@Override
    public void comunicarse() {
        System.out.println("Me comunico haciendo burbujas");
    }
}