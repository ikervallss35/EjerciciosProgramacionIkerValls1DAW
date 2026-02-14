package Religiones;
public class Islam extends Religion {

    public Islam() {
        super("Islam", "El Corán");
    }

    @Override
    public void rezar() {
        System.out.println("Allah Akbar...");
    }
}
