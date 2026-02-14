package Religiones;
public class Budismo extends Religion {

    public Budismo() {
        super("Budismo", "El Tripitaka");
    }

    @Override
    public void rezar() {
        System.out.println("Om mani padme hum...");
    }
}