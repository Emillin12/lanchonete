import model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredientelist = new ArrayList<>();
        ingredientelist.add("pao");
        ingredientelist.add("batata");
        ingredientelist.add("milho");

        Cliente cliente = new Cliente("Emillin" , "Barbosa");
        Hamburguer hamburguer = new Hamburguer(ingredientelist);
        Pedido pedido1 = new Pedido(cliente , hamburguer);

        System.out.println(pedido1.setpedido2());
        



    }
}
