package Avulsos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        int numero = e.nextInt();
        System.out.println("Digite o segundo número ");
        int numero2 = e.nextInt();

        if (numero > numero2) {
            System.out.println("O maior número é " + numero + ".");
        } else if (numero2 > numero) {
            System.out.println("O maior número é " + numero2 + ".");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}