package Ejercicio5;
public class Domiciliacion {
    private String num_d;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(String num_d, CuentaCorriente cuentaCorriente) {
        this.num_d = num_d;
        this.cuentaCorriente = cuentaCorriente;
        this.cuentaCorriente.getDomiciliacionList().add(this);
    }public String getNum_d() {
        return num_d;
    }public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }@Override
    public String toString() {
        return "Domiciliacion: " + num_d + ", cuenta: " + cuentaCorriente.getN_cc();
    }
}