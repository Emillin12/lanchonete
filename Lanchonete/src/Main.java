import model.Cliente;
import model.Hamburguer;

public class Main {
    public static void main(String[] args) {

        Hamburguer hamburguer = new Hamburguer("pao","hamburg","alho","cebola");

        System.out.println(hamburguer.getTudo());
    }
}
