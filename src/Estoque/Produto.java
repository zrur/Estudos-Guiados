package Estoque;

public class Produto {
    String nome;
    int quantidade;

    public Produto(String nome,int quantidade){
        this.nome = nome;
        this.quantidade  = quantidade;
    }
    public void vender(int quantidadeVendida) {
        if (quantidade >= quantidadeVendida) {
            quantidade -= quantidadeVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
