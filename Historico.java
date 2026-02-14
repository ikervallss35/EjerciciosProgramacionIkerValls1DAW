package Ejercicio7;
class Historico{
    private String data_p;
    private String data_t;
    private Lector lector;
    private Ejemplar ejemplar;

    public Historico(String data_p, String data_t, Lector lector, Ejemplar ejemplar) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.lector = lector;
        this.lector.getHistoricoList().add(this);
        this.ejemplar = ejemplar;
        this.ejemplar.getHistoricoList().add(this);
    }public String getData_p() {
        return data_p;
    }public String getData_t() {
        return data_t;
    }public Lector getLector() {
        return lector;
    }public Ejemplar getEjemplar() {
        return ejemplar;
    }@Override
    public String toString() {
        return "Historico{" + "data_p='" + data_p + '\'' + ", data_t='" + data_t + '\'' + ", lector=" + lector.getDNI() + ", exemplar=" + ejemplar.getN_reg() + '}';
    }
}