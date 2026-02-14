public class Siglas {
    public static void main(String[] args) {
        String cadena ="Escuela Oficial de Idiomas";
        System.out.println(mostrarSiglas(cadena));
    }public static String mostrarSiglas(String cadena){
        String siglas = "";
        String [] palabras = cadena.split(" ");
        for(int i=0; i < palabras.length;i++){
            if(Character.isUpperCase(palabras[i].charAt(i))){
                siglas += palabras[i].charAt(i) + " ";
            }
        }return siglas;
    }
}