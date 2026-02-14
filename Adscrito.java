package Ejercicio6;
class Adscrito {
    private String id_adscrit;
    private Catedra catedra;
    private Profesor profesor;
    private String fecha;

    public Adscrito(String id_adscrit, Catedra catedra, Profesor profesor, String fecha) {
        this.id_adscrit = id_adscrit;
        this.catedra = catedra;
        this.catedra.getAdscritoList().add(this);
        this.profesor = profesor;
        this.profesor.getAdscritoList().add(this);
        this.fecha = fecha;
    }public String getId_adscrit() {
        return id_adscrit;
    }public Catedra getCatedra() {
        return catedra;
    }public Profesor getProfesor() {
        return profesor;
    }public String getFecha() {
        return fecha;
    }@Override
    public String toString() {
        return "Adscrito: " + id_adscrit + ", id_ads: " + id_adscrit
                + ", professor: " + profesor.getDni_prof() +
                ", catedra: " + catedra.getId_catedra();
    }
}