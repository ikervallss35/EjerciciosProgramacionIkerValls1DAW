package Ejercicio9;
public class Main9 {
    private static void cerrar(Subasta subasta) {
        double maximo = Integer.MIN_VALUE;
        Puja pujaActual = null;
        for (Lote lote : subasta.getLoteList()) {
            System.out.println(lote.getDescripcion());
            for (Puja puja : lote.getPujaList()) {
                if (puja.getCantidad() > maximo) {
                    maximo = puja.getCantidad();
                    pujaActual = puja;
                }
            }if (pujaActual != null) {
                System.out.println(pujaActual.getCantidad());
                System.out.printf("Adjudicado a %s por %f\n", pujaActual.getPujador().getNombrePujador(), pujaActual.getCantidad());
            }else{
                System.out.println("No adjudicado");
            }
            maximo = Integer.MIN_VALUE;
            pujaActual = null;
        }
    }public static void main(String[] args) {
        CasaSubasta sothebys = new CasaSubasta("Sothebys", "Londres");
        Subasta subastaPicasos = new Subasta("Picasos",sothebys,"hoy");
        Lote loteAzul = new Lote(1,"Época azul",subastaPicasos);
        Lote loteRosa = new Lote(2,"Época rosa",subastaPicasos);
        Articulo cuadro1 = new Articulo("Cuadro 1",120, loteAzul);
        Articulo cuadro2 = new Articulo("Cuadro 2",300, loteAzul);
        Articulo cuadro3 = new Articulo("Cuadro 3",200, loteRosa);
        Pujador pepe = new Pujador("Pepe");
        Puja p1 = new Puja(pepe, loteAzul, 200);
        Pujador maria = new Pujador("Maria");
        Puja m1 = new Puja(maria, loteAzul, 300);
        cerrar(subastaPicasos);
    }
}