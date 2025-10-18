package Avulsos;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Qual sera o tamanho da lista ? ");
        int numero = e.nextInt();
        int[] lista = new int[numero];

        for (int i = 0; i < numero ; i++) {
            System.out.println("Digite um numero");
            int variavelUm = e.nextInt();
            lista[i] = variavelUm;
        }

        int maior = lista[0];
        for (int i = 0; i < numero ; i++) {
            if (lista[i] > maior) {
                maior = lista [i];
            }
        }
        System.out.println("o maior numero da lista é " + maior);

    }
}
