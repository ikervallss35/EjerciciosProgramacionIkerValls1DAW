public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println(canales(99, 7));
        System.out.println(canales(2, 99));
        System.out.println(canales(2, 5));
        System.out.println(canales(5, 63));
    }
    public static int canales(int desde, int hasta) {
        int mayor = Math.max(desde, hasta); //No da la vuelta
        int menor = Math.min(desde, hasta); //Da la vuelta
        int dist1 = mayor - menor;
        int dist2 = (99 - mayor) + menor;
        return Math.min(dist1, dist2); //Me quedo con la más pequeña
    }
}