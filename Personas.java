import java.util.ArrayList;
import java.util.List;
public class Personas {
    private String name;
    private int birthYear;

    public Personas(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }public String getName() {
        return this.name;
    }public int getBirthYear() {
        return this.birthYear;
    }@Override
    public String toString() {
        return this.name + " (" + this.birthYear + ")";
    }
}class MainPersonas {
    public static void main(String[] args) {
        List<Personas> personas = new ArrayList<>();
        Personas alberto = new Personas("Alberto", 1980);
        personas.add(alberto);
        Personas maria = new Personas("María", 1950);
        personas.add(maria);
        Personas juan = new Personas("Juan", 1950);
        personas.add(juan);

        personas.stream()
                .filter(persona -> persona.getBirthYear() < 1970)
                .map(p -> "Nacido antes de 1970: " + p.getName())
                .forEach(System.out::println);

        personas.stream()
                .filter(persona -> persona.getName().startsWith("A"))
                .map(p -> "Nombre que empieza por A: " + p.getName())
                .forEach(System.out::println);

        personas.stream()
                .map(Personas::getName)
                .distinct()
                .sorted()
                .map(nombre -> "Nombre único: " + nombre)
                .forEach(System.out::println);
    }
}