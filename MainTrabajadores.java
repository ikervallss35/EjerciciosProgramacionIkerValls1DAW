package Trabajadores;
    public class MainTrabajadores {
        public static void main(String[] args) {
            Empleado e = new Empleado("Ana");
            Operario o = new Operario("Luis");
            Oficial f = new Oficial("Carlos");
            Tecnico t = new Tecnico("Marta");
            Directivo d = new Directivo("Sonia");

            System.out.println(e);
            System.out.println(o);
            System.out.println(f);
            System.out.println(t);
            System.out.println(d);
        }
    }