public class Siglas {
    public static void main(String[] args) {
        String nombre = "Escuela Oficial de Idiomas";
        System.out.println(sacarSiglas(nombre));
    }public static String sacarSiglas(String nombre) {
        String siglas = "";
        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isUpperCase(nombre.charAt(i))) {
                siglas = siglas + nombre.charAt(i);
            }
        }return siglas;
    }
}