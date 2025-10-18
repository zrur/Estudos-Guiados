package Avulsos;

import java.util.Scanner;

public class Degraus {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int Degraus = e.nextInt();

        for (int i =1; i <= Degraus ; Degraus++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou no topo! ");
        e.close();
    }
}
