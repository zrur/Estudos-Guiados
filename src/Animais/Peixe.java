package Animais;

public class Peixe implements Animal,Nadador {
    String nome;
    double tamanhoPeixe;

public Peixe(String nome, double tamanhoPeixe){
    this.nome = nome;
    this.tamanhoPeixe = tamanhoPeixe;
}
    @Override
    public void mostrarInfo() {
        System.out.println("O nome do peixe é " + nome );
    }

    @Override
    public void emitirSom() {
        System.out.println("O som que o peixe faz é  o o o ");
    }

    @Override
    public void nadar() {
        System.out.println("O peixe esta nadando ");
    }
}
