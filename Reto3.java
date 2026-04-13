import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
class MeowResponse {
    List<String> data;
}public class Reto3 {
    public static void main(String[] args) throws IOException {
        final Gson gson = new Gson();
        URL url = new URL("https://meowfacts.herokuapp.com/?lang=esp-es&count=5");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        MeowResponse response = gson.fromJson(bufferedReader, MeowResponse.class);
        System.out.println("Datos de gatos:");
        for (String fact : response.data) {
            System.out.println("\t- " + fact);
        }
        bufferedReader.close();
    }
}