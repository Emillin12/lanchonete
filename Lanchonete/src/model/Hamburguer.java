package model;


import java.util.ArrayList;

public class Hamburguer {
    private ArrayList<String> ingredientes;
    private double Preco;

    public Hamburguer(ArrayList<String> ingredientes, double preco) {
        this.ingredientes = ingredientes;
        Preco = preco;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }
    public String getTudao(){
        return Preco + " " + ingredientes;

    }

    public void tirarIngredientes (String ingredientes){
        this.ingredientes.remove(ingredientes);
    }
}
