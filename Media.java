public class Media {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("La media de los numeros es " + media(numeros));
    }public static float media(int[]numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }return (float) suma/numeros.length;
    }
}