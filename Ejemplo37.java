public class Ejemplo37 {
    public static void main(String[] args) {
       String binario = "10111";

       System.out.println("El número binario " + binario + " en decimal es: " + BinarioDecimal(binario));
   }public static int BinarioDecimal(String binario) {
        int decimal = 0;
        int potencia = 0;
        char bit;
        for (int i = binario.length() - 1; i >= 0; i--) {
            bit = binario.charAt(i);
            potencia = binario.length() - 1 - i;
            if (bit == '1') {
                decimal += Math.pow(2, potencia);
            }
        }
        return decimal;
    }
    }
// 37 no va