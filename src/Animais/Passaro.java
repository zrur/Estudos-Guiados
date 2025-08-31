package Animais;

public class Passaro implements Animal, Voador{
        String Nome;
        double alturaVoo;

        public Passaro(String nome,int alturaVoo){
            this.Nome = nome;
            this.alturaVoo = alturaVoo;
        }

        @Override
        public void mostrarInfo() {
            System.out.println("O nome desse passarinho é " + Nome + "e altura do voo dele é " + alturaVoo +" m" );
        }

        @Override
        public void emitirSom() {
            System.out.println("O barulho que ele faz é QUERO QUERO");
        }

    @Override
    public void Voar() {
        System.out.println("Voando a " + alturaVoo);
    }
}
