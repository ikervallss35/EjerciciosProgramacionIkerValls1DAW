import java.util.Arrays;
public class Ejercicio8 {
    public static void main(String[] args) {
      int [] numeros = {4,5,2,1};
        Arrays.sort(numeros);
        Arrays.toString(numeros);
        System.out.println(cualFalta(numeros));
    }public static int cualFalta(int [] numeros){
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i + 1] != numeros[i] +1){
                return numeros[i] + 1;
            }
        }return -1;
    }
}