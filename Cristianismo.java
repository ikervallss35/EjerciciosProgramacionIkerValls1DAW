package Religiones;
public class Cristianismo extends Religion {

    public Cristianismo() {
        super("Cristianismo", "La Biblia");
    }

    @Override
    public void rezar() {
        System.out.println("Padre nuestro que estás en los cielos...");
    }
}