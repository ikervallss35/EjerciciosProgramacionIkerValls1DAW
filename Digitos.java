public class Digitos {
    public static void main(String[] args) {
        String digitos = "1 20 hola 234 45 a";
        System.out.println(contarDigitos(digitos));
    }public static int contarDigitos(String digitos){
        int contador = 0;
        for (int i = 0; i < digitos.length(); i++) {
            if (Character.isDigit(digitos.charAt(i))) {
                contador++;
            }
        }return contador;
    }
}