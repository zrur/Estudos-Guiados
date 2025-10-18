package Avulsos;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        System.out.println("Digite o valor do empréstimo: ");
        Scanner e = new Scanner(System.in);
        int emprestimo = e.nextInt();

        if (emprestimo >= 1000 && emprestimo <= 5000) {
            System.out.println("O valor " + emprestimo + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + emprestimo + " não está dentro do intervalo permitido para empréstimo.");
        }
        e.close();
    }
}
