package Avulsos;

import java.util.Scanner;

public class sistemaVotacao {
    public static void main(String[] args) {
        System.out.println("BEM-VINDO AO SISTEMA DE VOTAÇÃO. ");
        Scanner e = new Scanner(System.in);

        System.out.println("Quantos alunos iram votar ? ");
        int candidato = e.nextInt();

        int[] votos = new int[3];

        for (int i = 0; i < candidato; i++) {
            System.out.println("TEMOS 3 candidatos:\n" +
                    "\n" +
                    "Candidato 1: João\n" +
                    "Candidato 2: Maria\n" +
                    "Candidato 3: Pedro");
            //VOTO
            int voto = e.nextInt();
            System.out.println("O número votado foi " + voto );

            while (voto < 1 || voto > 3) {
                System.out.println("Voto inválido! Digite 1,2 ou 3: ");
                voto = e.nextInt();
            }

            switch (voto) {
                case 1: votos[0]++;break;
                case 2: votos[1]++;break;
                case 3: votos[2]++;break;
            }

        }
        System.out.println("\nResultado:");
        System.out.println("João: " + votos[0] + " votos");
        System.out.println("Maria: " + votos[1] + " votos");
        System.out.println("Pedro: " + votos[2] + " votos");

        int maior = votos[0];
        for (int j = 0; j < 3 ; j++) {
            if (votos[j] > maior){
                maior = votos [j];
            }
        }
        System.out.println("\nVencedor(es):");
        if (votos[0] == maior){
            System.out.println("João ");
        }
        if (votos[1] == maior){
            System.out.print("Maria ");
        }if (votos[2] == maior){
            System.out.print("Pedro ");
        }
    }
}
