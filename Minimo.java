public class Minimo {
    public static void main(String[] args) {
        int [] numeros ={2,10,3,4,5,1,6,7,8,9};
        System.out.println("El minimo de los numeros es el " + minimoArray(numeros));
    }public static int minimoArray(int[] numeros){
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }return minimo;
    }
}