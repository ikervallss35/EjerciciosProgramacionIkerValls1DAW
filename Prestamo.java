package Ejercicio5;
public class Prestamo {
    private String num_p;
    private Cliente cliente;
    private Sucursal sucursal;

    public Prestamo(String num_p, Cliente cliente, Sucursal sucursal) {
        this.num_p = num_p;
        this.cliente = cliente;
        this.sucursal = sucursal;
        this.cliente.getPrestamoList().add(this);
        this.sucursal.getPrestamoList().add(this);
    }public String getNum_p() {
        return num_p;
    }public Cliente getCliente() {
        return cliente;
    }public Sucursal getSucursal() {
        return sucursal;
    }@Override
    public String toString() {
        return "Prestamo: " + num_p + ", cliente: " + cliente.getDni() + ", sucursal: " + sucursal.getN_suc();
    }
}