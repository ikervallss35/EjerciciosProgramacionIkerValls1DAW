package Ejercicio7;
public class Main7 {
    public static void main(String[] args) {
        Autor autor1 = new Autor("A201", "Iker");
        Tema tema1 = new Tema("T8", "Futbol");
        Editorial editorial = new Editorial("e07", "NombreEditorial");
        Libro libro1 = new Libro("9790650959","El Libro", tema1, editorial);
        autor1.addLibro(libro1);
        libro1.addAutor(autor1);
        Lector persona2 = new Lector("20745371Z","Aitor");
        Ejemplar ejemplar1 = new Ejemplar("e58",libro1,persona2,"21-01-2026");
        Historico historico1 = new Historico("21-01-2026","NULL",persona2,ejemplar1);

        System.out.printf("%s \n %s \n %s \n %s \n %s \n %s \n %s", autor1,tema1,editorial,libro1,persona2,ejemplar1,historico1);
    }
}