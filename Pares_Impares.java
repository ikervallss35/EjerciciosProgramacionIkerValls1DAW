public class Pares_Impares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Hay " + Pares(numeros) + " numeros pares");
        System.out.println("Hay " + Impares(numeros) + " numeros impares");
    }public static int Pares(int[] numeros) {
        int contadorPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }return contadorPares;
    }public static int Impares(int[] numeros) {
        int contadorImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                contadorImpares++;
            }
        }return contadorImpares;
    }
}