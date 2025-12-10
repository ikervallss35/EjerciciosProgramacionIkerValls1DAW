package Metodos;
import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the side: ");
        int x = sc.nextInt();

        System.out.println(area(x));
    }
    public static int area(int x){
        return x*x;
    }
}