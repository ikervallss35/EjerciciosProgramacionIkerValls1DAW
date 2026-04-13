import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
class Pokemon2 {
    String name;
    int height;
    int weight;
    List<AbilityEntry> abilities;
    List<GameIndex> game_indices;

    static class AbilityEntry {
        Ability ability;
    }static class Ability {
        String name;
    }static class GameIndex {
        Version version;
    }static class Version {
        String name;
    }
}public class pokemonReto2 {
    public static void main (String[] args)  throws IOException {
        final Gson gson = new Gson();
        URL url = new URL("https://pokeapi.co/api/v2/pokemon/ditto");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        Pokemon2 p  = gson.fromJson(bufferedReader, Pokemon2.class);
        System.out.println("Nombre: " + p.name);
        System.out.println("Altura: " + p.height);
        System.out.println("Peso: " + p.weight);

        System.out.println("Habilidades:");
        for (Pokemon2.AbilityEntry a : p.abilities) {
            System.out.println("\t" + a.ability.name);
        }
        System.out.println("Versiones");
        for (Pokemon2.GameIndex g : p.game_indices) {
            System.out.println("\t" + g.version.name);
        }
        bufferedReader.close();
    }
}