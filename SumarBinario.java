public class SumarBinario {
    public static void main(String[] args) {
        String bin1 = "1011";
        String bin2 = "1010";
        String binResultado = "";
        int acarreo = 0;

        for (int i = bin1.length() - 1; i >= 0; i--) {
            int bit1 = Integer.parseInt("" + bin1.charAt(i));
            int bit2 = Integer.parseInt("" + bin2.charAt(i));

            int suma =  acarreo + bit1 + bit2;
            if (suma == 0) {
                acarreo = 0;
                binResultado = "0" + binResultado;
            }
            else if (suma == 1) {
                acarreo = 0;
                binResultado = "1" + binResultado;

            }else if (suma == 2) {
                acarreo = 1;
                binResultado = "0" + binResultado;
            }else{
                acarreo = 1;
                binResultado = "1" + binResultado;
            }
        }
        if (acarreo == 1) {
            binResultado = "1" + binResultado;
        }
        System.out.println(binResultado);
    }
}