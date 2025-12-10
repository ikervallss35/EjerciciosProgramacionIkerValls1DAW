public class Positivos_Negativos {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, -1, -2, -3, -4, 6};
        System.out.println("La suma de los numeros positivos es igual a " + sumaPositivos(numeros));
        System.out.println("La suma de los numeros negativos es igual a " + sumaNegativos(numeros));
    }public static int sumaPositivos(int[] numeros) {
        int sumarPositivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0) {
                sumarPositivos += numeros[i];
            }
        }return sumarPositivos;
    }public static int sumaNegativos(int[] numeros) {
        int sumarNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                sumarNegativos += numeros[i];
            }
        }return sumarNegativos;
    }
}