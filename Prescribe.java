package Ejercicio8;
class Prescribe {
    private String fecha;
    private String dosis;
    private Intervencion intervencion;
    private Medicamento medicamento;

    public Prescribe(String fecha, String dosis, Intervencion intervencion, Medicamento medicamento) {
        this.fecha = fecha;
        this.dosis = dosis;
        this.intervencion = intervencion;
        this.intervencion.getPrescribeList().add(this);
        this.medicamento = medicamento;
        this.medicamento.getPrescribeList().add(this);
    }public String getFecha() {
        return fecha;
    }public void setFecha(String fecha) {
        this.fecha = fecha;
    }public String getDosis() {
        return dosis;
    }public void setDosis(String dosis) {
        this.dosis = dosis;
    }public Intervencion getIntervencion() {
        return intervencion;
    }public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }public Medicamento getMedicamento() {
        return medicamento;
    }public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }@Override
    public String toString() {
        return "Prescribe{" + "fecha='" + fecha + '\'' + ", dosis='" + dosis + '\'' + ", intervencion=" + intervencion.getIdIntervencion() + ", medicamento=" + medicamento.getIdMedicamento() + '}';
    }
}