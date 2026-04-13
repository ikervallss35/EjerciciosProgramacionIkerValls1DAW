import java.io.File;
import java.util.Scanner;
public class Ejercicio1Ficheros {
    public static void main(String[] args) {
        File f = File.listRoots()[0];
        int cont = 0;
        int indice = 0;
        Scanner sc = new Scanner(System.in);
        while (indice != -1) {
            cont = 1;
            System.out.println("Directorios y ficheros de " + f + " Pulse -1 para salir");
            System.out.println("0.- Directorio padre");
            for (File fichero : f.listFiles()) {
                if (fichero.isDirectory()) {
                    System.out.println(cont++ + ".- " + fichero.getName() + " <Directorio>");
                }else
                    System.out.println(cont++ + ".- " + fichero.getName() + " <Fichero>");
            }
            indice = sc.nextInt();
            if (indice == -1) {
                break;
            }if (indice == 0) {
                f = f.getParentFile();
            }else
                f = f.listFiles()[indice - 1];
        }
    }
}