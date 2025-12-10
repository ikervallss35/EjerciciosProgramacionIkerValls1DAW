import java.util.Scanner;

class MarcoConCadenas {
    public static void main(String[] args){
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner;
        miScanner = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++){
            cadenas[i] = miScanner.next();
        }


    }public static String Marco(String []cadenas) {
    int maximo = 0;
    for (int i = 0; i < cadenas.length; i++){
        if (cadenas[i].length() > maximo){
            maximo = cadenas[i].length();
    }

    }
    }
    }