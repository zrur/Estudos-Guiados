package Saldo;

public class Main {
    public static void main(String[] args) {
        Saldo saldo = new Saldo(1579.42);
        saldo.exibirSaldo();  // mostra 1579.42
        saldo.zerarSaldo();   // só zera (não mostra nada)
        saldo.exibirSaldo();  // mostra 0.00
    }
}
