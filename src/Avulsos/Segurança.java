package Avulsos;

import java.util.Scanner;

public class Segurança {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de conta bancaria. ");
        int senhaCorreta = 1234;

        System.out.println("Digite sua senha para entrar: ");
        int senha = e.nextInt();

        int tentativas = 0;

        while (tentativas < 3 ) {
        if (senha == senhaCorreta){
            System.out.println("Parabéns acesso liberado. ");
            break;
        }else {
            tentativas++;
            int restantes = 3 - tentativas;
            if (restantes > 0) {
                System.out.println("Senha incorreta. Você tem " + restantes + " tentativa(s) restante(s).");
                System.out.println("Digite novamente:");
                senha = e.nextInt();
                }
            }
        }
        if ( tentativas == 3){
            System.out.println("CONTA BLOQUEADA TENTE NOVAMENTE EM 10 SEGUNDOS");
        }
    }
}
