package Saldo;

public class Saldo {
    double saldo;

    public Saldo(double saldo){
        this.saldo = saldo;
    }
    public void exibirSaldo(){
        System.out.printf("Saldo atual: R$ " + saldo);
    }
    public void zerarSaldo(){
        saldo = 0.0;
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
