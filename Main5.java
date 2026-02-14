package Ejercicio5;
public class Main5 {
    public static void main(String[] args) {
        Banco b1 = new Banco("B001");
        Sucursal s1 = new Sucursal("S001", b1);
        Sucursal s2 = new Sucursal("S002", b1);

        CuentaCorriente cc1 = new CuentaCorriente("CC01", s1);
        CuentaCorriente cc2 = new CuentaCorriente("CC02", s1);

        Cliente c1 = new Cliente("12345678A");
        Prestamo p1 = new Prestamo("P001", c1, s1);
        Prestamo p2 = new Prestamo("P002", c1, s1);

        Domiciliacion d1 = new Domiciliacion("D01", cc1);
        Domiciliacion d2 = new Domiciliacion("D02", cc1);


        RelacionCC r1 = new RelacionCC("R001", c1, cc1, "SI");
        RelacionCC r2 = new RelacionCC("R002", c1, cc2, "NO");

        System.out.println(b1 + "\n" + s1 + "\n" + cc1 + "\n" + c1 + "\n" + p1 + "\n" + d1 + "\n" + r1);
    }
}