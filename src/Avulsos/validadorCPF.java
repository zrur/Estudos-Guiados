package Avulsos;

import java.util.Scanner;

public class validadorCPF {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o CPF do paciente: ");
        String CPF = e.next();

        while (true){
            if (CPF.length() == 11){
                System.out.println("CPF válido cadastrado! ");
                break;
            }else {
                System.out.println("CPF cadastrado INVALIDO");
                System.out.println("Digite novamente");
                CPF = e.next();
            }

        }
    }
}
