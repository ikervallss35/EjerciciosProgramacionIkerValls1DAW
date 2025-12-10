public class Ejemplo36 {
    public static void main(String[] args) {
        int decimal=11;
        System.out.println("El 11 en decimal en binario es igual a: ");
         System.out.println(DecimalBinario(decimal));
    }public static String DecimalBinario(int decimal){
        String binario = "";
        int digito;
        while(decimal != 0){
            digito = decimal % 2;
            binario = digito + binario;
            decimal = decimal / 2;
        }
        return binario;
    }
}
// 36 no va