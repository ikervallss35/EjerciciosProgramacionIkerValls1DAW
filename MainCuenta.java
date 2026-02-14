import java.util.List;
import java.util.ArrayList;
class Cuenta implements Comparable<Cuenta> {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }public String getTitular() {
        return titular;
    }public double getCantidad() {
        return cantidad;
    }public void setCantidad(double cantidad) {
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }public void retirar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad -= cantidad;
            if (this.cantidad < 0) {
                this.cantidad = 0;
            }
        }
    }@Override
    public String toString() {
        return "Cuenta{" + "titular='" + titular + '\'' + ", cantidad=" + cantidad + '}';
    }@Override
    public int compareTo(Cuenta other) {
        return this.titular.compareTo(other.titular);
    }
}public class MainCuenta {
        public static void main(String[] args) {
            List<Cuenta> cuentas = new ArrayList<>();
            Cuenta c1 = new Cuenta("Iker", 100);
            Cuenta c2 = new Cuenta("Ana");
            c2.setCantidad(200);
            cuentas.add(c1);
            cuentas.add(c2);
            c1.ingresar(50);c2.retirar(10);
            cuentas.stream().sorted().forEach(System.out::println);
        }
    }