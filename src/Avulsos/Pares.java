package Avulsos;

public class Pares {
    public static void main(String[] args) {
        int numeros = 0;
        for (int i = 1; i <= 100 ; i++) {
            if ( i % 2 == 0){
                numeros += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + numeros);
    }
}
