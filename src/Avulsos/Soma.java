package Avulsos;

public class Soma {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < valores.length ; i++/*int valor : valores*/) {
            soma+=valores[i];
            System.out.println(soma);
        }

    }
}
