import java.util.ArrayList;
import java.util.List;
public class Loterias {
    static class Loteria implements Comparable<Loteria> {
        private int invertido;
        private int ganado;

        public Loteria(int invertido, int ganado) {
            this.invertido = invertido;
            this.ganado = ganado;
        }@Override
        public String toString() {
            return invertido + " - " + ganado;
        }@Override
        public int compareTo(Loteria other) {
            if (this.invertido == other.invertido) {
                return this.ganado - other.ganado;
            } else {
                return this.invertido - other.invertido;
            }
        }
    }public static void main(String[] args) {
        List<Loteria> loterias = new ArrayList<>();
        loterias.add(new Loteria(100, 50));
        loterias.add(new Loteria(200, 300));
        loterias.stream().sorted().forEach(System.out::println);
        boolean justa = true;
        for (int i = 1; i < loterias.size(); i++) {
            if (loterias.get(i).ganado < loterias.get(i-1).ganado) {
                justa = false;
                break;
            }
        }System.out.println(justa ? "SI" : "NO");
    }
}