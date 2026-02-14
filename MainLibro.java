package Ejercicio4;
public class MainLibro {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Luis Perez", "1987");
        Autor autor2 = new Autor("Manolo Garcia", "1968");

        Tema tema1 = new Tema("Fantasía");
        Tema tema2 = new Tema("Ciencia Ficción");

        Libro libro1 = new Libro("Odisea en el agujero de gusano", autor1, 471);
        libro1.addTema(tema1);

        Libro libro2 = new Libro("Among Us", autor2, 472);
        libro2.addTema(tema2);

        System.out.println(libro1);
        System.out.println();
        System.out.println(libro2);
    }
}