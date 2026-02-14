public class Comunes{
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4};
        int [] ar2 = {1,5,3,6};
        System.out.println(comunesRepetidos(ar1,ar2));
    }public static String comunesRepetidos(int[] ar1, int[] ar2 ){
        String resultado = "";
        for(int i=0;i<ar1.length;i++){
            for(int j= 0;j<ar2.length;j++){
                if(ar1[i]==ar2[j]){
                    resultado += ar1[i] + " ";
                }
            }
        }return resultado;
    }
}