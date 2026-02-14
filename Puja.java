package Ejercicio9;
class Puja {
    private Pujador pujador;
    private Lote lote;
    private double cantidad;

    public Puja(Pujador pujador, Lote lote, double cantidad) {
        this.pujador = pujador;
        this.pujador.addPuja(this);
        this.lote = lote;
        this.lote.getPujaList().add(this);
        this.cantidad = cantidad;
    }public Pujador getPujador() {
        return pujador;
    }public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }public Lote getLote() {
        return lote;
    }public void setLote(Lote lote) {
        this.lote = lote;
    }public double getCantidad() {
        return cantidad;
    }public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}