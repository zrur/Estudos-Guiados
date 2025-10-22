package Notas;

public class Main {
    public static void main(String[] args) {
        Calculadora alunoUm = new Calculadora("João",6.7,7.5);
        alunoUm.exibirDados();

        System.out.println();
        Calculadora alunoDois = new Calculadora("Maria Santos", 5.0, 6.0);
        alunoDois.exibirDados();
    }
}
