public class Parentesis {
    public static void main(String[] args) {
        String cadena = "()()";
        if (esParentizada(cadena)){
            System.out.println("La cadena está bien parentizada");
        }else{
            System.out.println("La cadena no está bien parentizada");
        }
    }public static boolean esParentizada(String cadena){
        int par = 0;
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == '('){
                par++;
            }else if(cadena.charAt(i) == ')'){
                par --;
            }
            if(par < 0){
                break;
            }
        }return par == 0;
    }

}