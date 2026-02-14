public class Parentesis {
    public static void main(String[] args) {
        String cadena = "()()";
        if (estaBienParentizado(cadena)) {
            System.out.println("OK");
        } else {
            System.out.println("MAL");
        }
    }public static boolean estaBienParentizado(String cadena) {
        int par = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                par++;
            } else if (cadena.charAt(i) == ')') {
                par--;
                if (par < 0) {
                    break;
                }
            }
        }return par == 0;
    }
}