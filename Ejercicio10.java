public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println(litros(5,300,10));
    }public static int litros(int compartimentos, int maxLitros, int diferencia){
        int litros = 0;
        int litrosActual = maxLitros;
        for (int i = 1; i <= compartimentos; i++) {
            litros += litrosActual;
            litrosActual -= diferencia;
        }
        return litros;
    }
}