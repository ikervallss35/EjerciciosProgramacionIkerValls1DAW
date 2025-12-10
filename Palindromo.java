public class Palindromo {
    public static void main(String[] args) {
        String palabra = "reconocer";
        System.out.println(palindromo(palabra));
    }public static String palindromo(String palindromo){
        boolean esPalindromo = true;
        for (int i = 0; i <palindromo.length() ; i++)  {
        char letra = palindromo.charAt(i);
        char letra2 = palindromo.charAt(palindromo.length()-1-i);

            if (letra != letra2) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo){
            return "Es palindromo";
        }else {
            return "No es palindromo";
        }
    }
}