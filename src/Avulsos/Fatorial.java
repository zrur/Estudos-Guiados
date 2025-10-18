package Avulsos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int resultado = 1 ;

        System.out.println("Digite o número");
        int numero = e.nextInt();

        for (int i = 1; i <= numero ; i++) {
            resultado *= i;
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }
    }
}