public class Orden {
    public static void main(String[] args) {
        int[] numeros ={1,2,3,4};
        System.out.println(estaOrdenado(numeros));
    }public static String estaOrdenado(int[] numeros){
        boolean ascendente = false;
        boolean descendente = false;
        for(int i=0;i<numeros.length - 1;i++){
            if(numeros[i]<numeros[i+1]){
                ascendente = true;
            }else if(numeros[i]>numeros[i+1]){
                descendente = true;
            }
        }if(ascendente == true && descendente == true) {
            return "Desordenado";
        }else if(ascendente == true && descendente == false) {
            return "Ascendente";
        }else if(ascendente == false && descendente == true) {
            return "Descendente";
        }else{
            return "Iguales";
        }
        }
    }