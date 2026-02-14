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
}class Main{
    public static void main(String[] args) {
        List<Personas> personas = new ArrayList<>();
        Personas alberto = new Personas("Alberto", 1980);
        personas.add(alberto);
        Personas maria = new Personas("María", 1950);
        personas.add(maria);
        Personas juan = new Personas("Juan", 1950);
        personas.add(juan);
        long cantidad = personas.stream()
                .filter(p -> p.getBirthYear() < 1970)
                .count();
        System.out.println(cantidad);

        long cuantas = personas.stream()
                .filter(p -> p.getName().startsWith("A"))
                .count();
        System.out.println(cuantas);

        personas.stream()
                .map(p -> p.getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}