package Animais;

public class Cao implements Animal {
    private String nome;
    public Cao(String nome){
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println("O som que o cachorro faz é AU AU ");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("O nome do cachorro é " + nome );
    }
}

