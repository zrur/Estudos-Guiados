package Temperatura;

public class Sensor {
    String local;
    double temperaturaAtual;

    public Sensor(String local,double temperaturaAtual){
        this.local = local;
        this.temperaturaAtual = temperaturaAtual;
    }
    public void exibirStatus(){
        System.out.printf("Sensor no local: %s%n", local);
        System.out.printf("Temperatura: %.1f°C%n", temperaturaAtual);
        if (temperaturaAtual > 37.5 ){
            System.out.printf("Alerta: Temperatura acima do limite!");
        }
    }
}
