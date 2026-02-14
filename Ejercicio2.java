public class Ejercicio2 {
    public static int diasHastaNochevieja(int dia, int mes){
        final int meses [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int dias = meses[mes - 1] - dia ;
        for(int i = mes; i < 12; i++){
            dias += meses[i];
        }
        return dias;
        }
    public static void main(String[] args) {
        int mes = 10;
        int dia = 24;
        System.out.println(diasHastaNochevieja(dia, mes));
    }
    }