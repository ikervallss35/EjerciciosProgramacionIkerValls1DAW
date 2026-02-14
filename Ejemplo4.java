import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the side: ");
        int x = sc.nextInt();
        int squareArea = x*x;
        System.out.println(squareArea);

    }
}