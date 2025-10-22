package Carrinho;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Produto> carinho = new ArrayList<>();

        Produto produto = new Produto("Mouse",30.0,1);
        Produto produtoDois = new Produto("Camisa",20.0,2);

        carinho.add(produto);
        carinho.add(produtoDois);

        double totalCompra = 0;

        for (Produto p : carinho){
            totalCompra += p.calcularTotal();
        }
        System.out.println("Total de compra = " + totalCompra);
    }
}
