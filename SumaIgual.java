public class SumaIgual {
    public static void main(String[] args) {
        int[] ar1 = {3, 4, 5, 6, 9, 8};
        int resultado = 9;
        String pares = mostrarParesSumaIgual(ar1, resultado);
        System.out.println(pares);
    }public static String mostrarParesSumaIgual(int[] ar1, int resultado) {
        String resultadoPares = "";
        for (int i = 0; i < ar1.length - 1; i++) {
            for (int j = 0; j < ar1.length; j++) {
                if (ar1[i] + ar1[j] == resultado) {
                    resultadoPares += ar1[i] + " + " + ar1[j] + " = " + resultado + "\n";
                }
            }
        }return resultadoPares;
    }
}