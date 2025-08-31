package Animais;

public class Morcego implements Animal,Voador {
    String nome;
    double alturaVoo;

    public Morcego(String nome, double alturaVoo){
        this.nome = nome;
        this.alturaVoo = alturaVoo;

    }

    @Override
    public void mostrarInfo() {
        System.out.println("O nome do morcego é " + nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O som que ele emite é igual do Batman");
    }

    @Override
    public void Voar() {
        System.out.println("Ele esta voando a  " + alturaVoo);
    }
}
