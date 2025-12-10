import java.util.Stack;
public class Parentesis {
    public static void main(String[] args) {
        String cadena = "[{[(hola)]}]";
        if (esBalanceado(cadena)) {
            System.out.println("La cadena está bien parentizada");
        } else {
            System.out.println("La cadena está mal parentizada");
        }
    }public static boolean esBalanceado(String cadena) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()){
                    return false;
                }Character pop = stack.pop();
                if ((c == ')' && pop != '(') || (c==']' && pop != '[') || (c=='}' && pop != '{')) {
                    return false;
                }
            }
        }return stack.isEmpty();
    }
}