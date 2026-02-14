import java.util.ArrayList;
import java.util.List;
public class NiñosBuenos {
    static class Nino implements Comparable<Nino>{
        private int bondad;
        private int peso;

        public Nino(int bondad, int peso) {
            this.bondad = bondad;
            this.peso = peso;
        }@Override
        public String toString(){
            return bondad + " - " + peso;
        }@Override
        public int compareTo(Nino other){
            if(this.bondad == other.bondad){
                return this.peso - other.peso;
            }else {
                return other.bondad - this.bondad;
            }
        }
    }public static void main(String[] args) {
        List<Nino> ninoList = new ArrayList<>();
       ninoList.add(new Nino(80,30));
        ninoList.add(new Nino(80,40));
        ninoList.stream().sorted().forEach(System.out::println);
    }
}