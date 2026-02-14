import java.util.ArrayList;
import java.util.List;
public class Personas2 {
    private String name;
    private int birthYear;

    public Personas2(String name, int birthYear) {
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
}class MainPersonas2 {
    public static void main(String[] args) {
        List<Personas2> personas = new ArrayList<>();
        personas.add(new Personas2("Ana", 1985));
        personas.add(new Personas2("María", 1950));
        personas.add(new Personas2("Alberto", 1990));
        personas.add(new Personas2("Juan", 1980));

        long empiezanPorA = personas.stream()
                .filter(persona -> persona.getName().startsWith("A"))
                .count();

        System.out.println("Personas cuyo nombre empieza por A: " + empiezanPorA);
    }
}