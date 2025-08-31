package Animais;

public class Gato implements Animal {
    private String nome;

    public Gato(String nome){
        this.nome = nome;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("O nome do gato é " + nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O som que o gato faz é MIAU MIAU ");
    }
}
