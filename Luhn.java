public class Luhn {
    public static void main(String[] args) {
        System.out.println(check("1234567890123411"));
    }public static boolean check(String numero) {
        int suma = 0;
        boolean doble = false;

        for (int i = numero.length() - 1; i >= 0; i--) {
            int digito = Integer.parseInt("" + numero.charAt(i));

            if (doble) {
                digito *= 2;
                if (digito > 9)
                    digito -= 9;
            }
            suma += digito;
            doble = !doble;
        }return suma % 10 == 0;
    }
}