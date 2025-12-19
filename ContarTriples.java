public class ContarTriples {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 2};
        System.out.println(cuantos(arr1));
    }public static int cuantos(int[] arr1) {
        int contador = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    if (k != i && k != j && arr1[i] + arr1[j] == arr1[k]) {
                        contador++;
                    }
                }
            }
        }return contador;
    }
}