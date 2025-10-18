package Avulsos;

import java.util.Scanner;

public class numeroCinco {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int limite = e.nextInt();
        for (int i = 1; i <= limite ; i++) {
            if (i % 10 == 5){
                continue;
            }
            System.out.println(i);
        }
        e.close();
    }
}
