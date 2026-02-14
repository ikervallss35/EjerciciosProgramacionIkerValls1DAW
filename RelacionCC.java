package Ejercicio5;
public class RelacionCC {
    private String id_rel;
    private Cliente cliente;
    private CuentaCorriente cuentaCorriente;
    private String priv;

    public RelacionCC(String id_rel, Cliente cliente, CuentaCorriente cuentaCorriente, String priv) {
        this.id_rel = id_rel;
        this.cliente = cliente;
        cliente.getRelacionCCList().add(this);
        this.cuentaCorriente = cuentaCorriente;
        cuentaCorriente.getRelacionCCList().add(this);
        this.priv = priv;
    }public String getId_rel() {
        return id_rel;
    }public Cliente getCliente() {
        return cliente;
    }public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }public String getPriv() {
        return priv;
    }@Override
    public String toString() {
        return "RelacionCC: " + id_rel + ", cliente: " + cliente.getDni() + ", cuenta: " + cuentaCorriente.getN_cc() + ", priv: " + priv;
    }
}