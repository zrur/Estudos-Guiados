package Relatorio;

public class Produto {
        String nome;
        double preco ;
        int quantidadade;

    public Produto(String nome, double preco , int quantidadade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadade = quantidadade;

    }
    public void exibirDados(){
        System.out.printf("Produto: %s Preço: R$ %.2f Quantidade: %d%n " +
                "", nome, preco, quantidadade);    }
}
