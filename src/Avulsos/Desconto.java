package Avulsos;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Sistema de desconto de compras: ");
        System.out.println("Digite o valor da compra: ");

        double compra = e.nextDouble();
        double desconto = compra * 0.10; // 10% do preço
        double precoFinal = compra - desconto;


        if (compra <= 100 ){
            System.out.println("Nenhum desconto aplicado. \n" +
                    "Valor total: R$ " + compra);
            } else if ( compra >= 100) {
            System.out.println("Desconto de 10% aplicado. \n" +
                    "Novo valor: R$ " + precoFinal);
        }
    }
}

