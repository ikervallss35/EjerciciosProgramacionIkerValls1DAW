public class Pasatiempos {
    public static void main(String[] args) {
    String cadena = "esto es un ejemplo de pasatiempos";
    String pasatiempo = crearPasatiempo(cadena);
        System.out.println(pasatiempo);
    }public static String crearPasatiempo(String cadena){
        String resultado = "";
        for(int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                resultado += '.';
            }else{
                resultado += c;
            }
        }return resultado;
    }
}