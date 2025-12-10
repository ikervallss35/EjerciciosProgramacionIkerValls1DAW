public class Comunes {
    public static void main(String[] args) {
        int[] ar1 = {3, 5, 7, 9};
        int[] ar2 = {5, 9, 11};
        String resultado = elementosComunes(ar1, ar2);
        System.out.println(resultado);
    }public static String elementosComunes(int[] ar1, int[] ar2) {
        String resultado = "";

        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {
                    resultado += ar1[i] + " ";
                }
            }
        }return resultado;
    }
}