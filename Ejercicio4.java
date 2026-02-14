public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 5, 5, 3, 2, 1, 3, 3, 5, 5};
        System.out.println("La moda es " + moda(numeros));
    }public static int moda(int[] numeros) {
        int moda = numeros[0];
        int maxContador = 0;

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }if (contador > maxContador) {
                maxContador = contador;
                moda = numeros[i];
            }
        }return moda;
    }
}