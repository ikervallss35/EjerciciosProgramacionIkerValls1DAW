package Religiones;
public class MainReligiones {
    public static void main(String[] args) {
        Religion cristianismo = new Cristianismo();
        Religion islam = new Islam();
        Religion budismo = new Budismo();

        Creyente c1 = new Creyente("Iker", cristianismo);
        Creyente c2 = new Creyente("Ana", islam);
        Creyente c3 = new Creyente("Luis", cristianismo);
        Creyente c4 = new Creyente("Marta", budismo);

        System.out.println("Cristianismo: " + cristianismo.getCreyentes());
        System.out.println("Islam: " + islam.getCreyentes());
        System.out.println("Budismo: " + budismo.getCreyentes());

    }
}