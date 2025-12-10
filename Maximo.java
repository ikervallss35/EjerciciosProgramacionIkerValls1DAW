public class Maximo {
    public static void main(String[] args) {
        int [] numeros ={1,2,3,4,5,10,6,7,8,9};
        System.out.println("El maximo de los numeros es el " + maximoArray(numeros));
    }public static int maximoArray(int[] numeros){
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }return maximo;
    }
}