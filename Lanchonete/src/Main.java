import model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;
//Metas de hoje:
//1 - Precificação do Hamburguer
// 2 - Remover ingredientes
//3 - Adicionar ingredientes
//4 - Calculo total do pedido

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredientelist = new ArrayList<>();
        ingredientelist.add("pao");
        ingredientelist.add("batata");
        ingredientelist.add("milho");

        ingredientelist.remove(" ");
        ingredientelist.add(" ");


        Hamburguer hamburguer = new Hamburguer(ingredientelist , 10);

        System.out.println(hamburguer.getTudao());

        System.out.println("Antes de tirar: " + hamburguer.getIngredientes());

        hamburguer.tirarIngredientes("milho");

        System.out.println("Depois de tirar: " + hamburguer.getIngredientes());

    }
}
