public class Ejercicio6 {
    public static void main(String[] args) {
        int num = 2408;
        if (esHyperpar(num)){
            System.out.println("El numero " + num +  " es hyperpar");
        }else{
            System.out.println("El numero " + num +  " no es hyperpar");
        }
    }public static boolean esHyperpar(int num){
        int digito;
        do {
            digito = num % 10;
            if(digito % 2 != 0){
                return false;}
            num = num / 10;
        }while (num > 0);
        return true;
    }
}