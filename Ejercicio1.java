public class Ejercicio1 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4};
        System.out.println(orden(numeros));
    }public static String orden(int[] numeros){
        boolean ascendente = false;
        boolean descendente = false;
    for(int i = 0; i < numeros.length -1; i++){
        if(numeros[i] > numeros[i+1]){
            descendente = true;
        }else if(numeros[i] < numeros[i+1]){
            ascendente = true;
        }
    }if(ascendente == true && descendente == true){
        return "Desordenado";
        }else if(ascendente == true && descendente == false){
        return "Ascendente";
        }else if(ascendente == false && descendente == true){
        return "Descendente";
        }else return "Iguales";
    }
}