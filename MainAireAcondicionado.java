import java.util.ArrayList;
import java.util.List;
class AireAcondicionado implements Comparable<AireAcondicionado> {
    private String nombre;
    private int maxima;
    private int minima;
    private int temperatura;

    public AireAcondicionado(String nombre, int maxima, int minima, int temperatura) {
        this.nombre = nombre;
        this.maxima = maxima;
        this.minima = minima;
        this.temperatura = temperatura;
    }public String getNombre() {
        return nombre;
    }public int getMaxima() {
        return maxima;
    }public int getMinima() {
        return minima;
    }public int getTemperatura() {
        return temperatura;
    }public void setMaxima(int maxima) {
        this.maxima = maxima;
    }public void subir() {
        if (temperatura < maxima) {
            temperatura++;
        }
    }public void bajar() {
        if (temperatura > minima) {
            temperatura--;
        }
    }@Override
    public String toString() {
        return "AireAcondicionado{" + "nombre='" + nombre + '\'' + ", maxima=" + maxima + ", minima=" + minima + ", temperatura=" + temperatura + '}';
    }@Override
    public int compareTo(AireAcondicionado other) {
        return this.nombre.compareTo(other.nombre);
    }
}public class MainAireAcondicionado {
    public static void main(String[] args) {
        AireAcondicionado aa1 = new AireAcondicionado("Yamaha", 30, 15, 16);
        AireAcondicionado aa2 = new AireAcondicionado("Mitsubishi", 50, 10, 32);
        List<AireAcondicionado> aireAcondicionados = new ArrayList<>();
        aireAcondicionados.add(aa1);
        aireAcondicionados.add(aa2);
        aa1.bajar();aa1.bajar();aa2.subir();
        aireAcondicionados.stream().sorted().forEach(System.out::println);
    }
}