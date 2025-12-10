import java.util.ArrayList;
import java.util.List;
public class Human {
    static class Humano implements Comparable<Humano> {
        private String nombre;
        private int salario;

        public Humano(String nombre, int salario) {
            this.nombre = nombre;
            this.salario = salario;
        }@Override
        public String toString() {
            return nombre + " - " + salario;
        }@Override
        public int compareTo(Humano other) {
            if(this.salario == other.salario)
                return this.salario - other.salario;
            else
                return other.salario - this.salario;
        }
        }public static void main(String[] args) {
        List<Humano> humanos = new ArrayList<>();
        humanos.add(new Humano("Ana", 1200));
        humanos.add(new Humano("Luis", 1500));
        humanos.add(new Humano("Carlos", 1000));
        humanos.add(new Humano("Marta", 1500));
        humanos.stream().sorted().forEach(System.out::println);
    }
}