public class Ejercicio3 {
    public static void main(String[] args) {
        String resultado = sumaDigitos("3433");
        System.out.println(resultado);
    }public static String sumaDigitos(String digitos) {
        int suma = 0;
        String calculo = "";
        int num;
        for (int i = 0; i < digitos.length(); i++) {
            num = Integer.parseInt("" + digitos.charAt(i));
            suma += num;
            if (i == digitos.length() - 1) {
                calculo += num + " = ";
            } else {
                calculo += num + " + ";
            }
        }calculo += suma;
        return calculo;
    }
}