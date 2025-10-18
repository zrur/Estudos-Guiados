package Avulsos;

import java.util.Scanner;

public class nomeValido {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = e.next();

        while (true){
            if (nome.length() >= 3) {
                System.out.println("Nome cadastrado com sucesso! ");
                break;
            }
            else{
                System.out.println("Nome inválido. Digite novamente.  \n");
                nome = e.next();
            }
        }
    }
}
