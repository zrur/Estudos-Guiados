package Avulsos;

import java.util.Scanner;

public class DIa {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Sistema de dia útil ou não");

        System.out.println("Digite o dia: ");
        String dia = e.next();

        if (dia.equals("segunda")){
            System.out.println("Segunda é um dia útil. \n");
        } else if (dia.equals("terça")) {
            System.out.println("terça é um dia útil. \n");
        } else if (dia.equals("quarta")) {
            System.out.println("quarta é um dia útil. \n");
        } else if (dia.equals("quinta")) {
            System.out.println("quinta é um dia útil. \n");
        } else if (dia.equals("sexta")) {
            System.out.println("sexta é um dia útil. \n");
        }else {
            System.out.println("Não é dia util");
        }
    }
}
