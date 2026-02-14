import java.util.ArrayList;
import java.util.List;
class Ordenador implements Comparable<Ordenador> {
    private String marca;
    private String CPU;
    private int RAM;
    private String almacenamiento;
    private int precio;

    public Ordenador(String marca, String CPU, int RAM, String almacenamiento, int precio) {
        this.marca = marca;
        this.CPU = CPU;
        this.RAM = RAM;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }public String getMarca() {
        return marca;
    }public String getCPU() {
        return CPU;
    }public void setCPU(String CPU) {
        this.CPU = CPU;
    }public String getAlmacenamiento() {
        return almacenamiento;
    }public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }public int getPrecio() {
        return precio;
    }public void setPrecio(int precio) {
        this.precio = precio;
    }public int getRAM() {
        return RAM;
    }public void setRAM(int RAM) {
        this.RAM = RAM;
    }@Override
    public String toString() {
        return "Ordenador{" + "marca='" + marca + '\'' + ", CPU='" + CPU + '\'' + ", RAM=" + RAM + ", almacenamiento='" + almacenamiento + '\'' + ", precio=" + precio + '}';
    }@Override
    public int compareTo(Ordenador other) {
        return this.precio - other.precio;
    }
}public class MainOrdenador {
    public static void main(String[] args) {
        Ordenador pc1 = new Ordenador("Lenovo", "Intel", 16, "Samsung", 1500);
        Ordenador pc2 = new Ordenador("HP", "AMD", 32, "Kingston", 1200);
        Ordenador pc3 = new Ordenador("Acer", "AMD", 8, "Western Digital", 1100);
        List<Ordenador> listaOrdenadores = new ArrayList<>();
        listaOrdenadores.add(pc1);
        listaOrdenadores.add(pc2);
        listaOrdenadores.add(pc3);
        listaOrdenadores.stream().sorted().forEach(System.out::println);
    }
}/*public void setRAM(int RAM) {
        if (RAM < 0) {
            throw new IllegalArgumentException("La RAM debe ser positiva");
        }
    this.RAM = RAM;Sirve para controlar que la RAM no fuera negativa*/

        /*try {
            pc1.setRAM(-1);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}Sirve para mostrar el mensaje sin detener el programa*/