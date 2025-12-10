public class Duplicados {
    public static void main(String[] args) {
        int[] ar1 = {3, 4, 5, 6, 9, 8, 5, 9};
        String resultado = buscaDuplicados(ar1);
        System.out.println(resultado);
    }public static String buscaDuplicados(int[] ar1) {
        String resultado = "";

        for (int i = 0; i < ar1.length; i++) {
            for (int j = i + 1; j < ar1.length; j++) {
                if (ar1[i] == ar1[j]) {
                    resultado += ar1[i] + " ";
                }
            }
        }return resultado;
    }
}