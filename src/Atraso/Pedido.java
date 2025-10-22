package Atraso;

public class Pedido {
    String titulo;
    int diasDeAtraso;

    public Pedido(String titulo, int diasDeAtraso){
        this.titulo = titulo;
        this.diasDeAtraso = diasDeAtraso;
    }
    double diasAtraso() {
        return diasDeAtraso * 2.50;
    }
    void exibirDetalhes(){
        double multa = diasAtraso();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n",
                titulo, diasDeAtraso, multa);

    }
}
