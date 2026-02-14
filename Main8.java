package Ejercicio8;
public class Main8 {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("H001", "Hospital General");

        Departamento d1 = new Departamento("D001", "Cardiología", h1);

        Medico m1 = new Medico("M001", "Dr. García");
        d1.addMedico(m1);

        Habitacion hab1 = new Habitacion(101, 2);

        Paciente p1 = new Paciente("P001", "Juan Pérez", hab1);

        Intervencion i1 = new Intervencion("I001", "2026-01-20", "Cirugía", m1, p1);

        Medicamento med1 = new Medicamento("MED001", "Paracetamol");

        Prescribe pr1 = new Prescribe("2026-01-20", "500mg", i1, med1);

        System.out.println(h1 + "\n" + d1 + "\n" + m1 + "\n" + hab1 + "\n" + p1 + "\n" + i1 + "\n" + med1 + "\n" + pr1);
    }
}