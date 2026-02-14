import java.util.Arrays;
public class Ejercicio5 {
    public static void main(String[] args) {
    int[] numeros = {5,7,4,3,1,6};
        System.out.println(mediana(numeros));
    }public static double mediana(int[] numeros){
    Arrays.sort(numeros);
    if(numeros.length % 2 !=0){
        return numeros[numeros.length /2];
    }else{
        double a = numeros[numeros.length / 2 - 1];
        double b = numeros[numeros.length / 2];
        return (a + b) / 2.0;
    }
    }
}