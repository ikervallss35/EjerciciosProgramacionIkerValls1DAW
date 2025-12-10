import java.util.Stack;
public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println(calcular("5 3 -"));
    }public static int calcular (String expresionAritmetica) {
        String [] valores = expresionAritmetica.split(" ");
        Stack<Integer> pila = new Stack<>();
        int n1;
        int n2;
        for (int i = 0; i < valores.length; i++) {
            String valActual = valores[i];
            switch (valActual) {
                case "+":
                    n2 = pila.pop();
                    n1 = pila.pop();
                    pila.push(n1 + n2);
                    break;
                case  "-":
                    n2 = pila.pop();
                    n1 = pila.pop();
                    pila.push(n1 - n2);
                    break;
                case "*":
                    n2 = pila.pop();
                    n1 = pila.pop();
                    pila.push(n1 * n2);
                    break;
                case "/":
                    n2 = pila.pop();
                    n1 = pila.pop();
                    pila.push(n1 / n2);
                    break;
                default:
                    pila.push(Integer.parseInt(valActual));
            }
        }return pila.pop();
    }
}