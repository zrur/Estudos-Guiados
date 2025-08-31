package Animais;


public class Main  {
    public static void main(String[] args) {
        Animal Ikora = new Cao("IKora");
        Animal Florzinha = new Gato("Florzinha");
        Passaro queroQuero = new Passaro("QUERO QUERO ", 12);
        Morcego Batzuca = new Morcego("Batman", 1);
        Peixe Peixonauta = new Peixe("Peixounauta",4);


        Animal[] animais = {Ikora, Florzinha, queroQuero, Batzuca,Peixonauta};
        for (Animal a : animais) {
            acionar(a);
        }
    }
    static void acionar(Animal a){
        a.mostrarInfo();
        a.emitirSom();
        if (a instanceof Voador) {
        Voador v = (Voador) a;
           v.Voar();
            if (a instanceof Nadador){
                ((Nadador)a).nadar();
            }
        }

        System.out.println();
    }
}
//a.mostrarInfo();
//a.emitirSom();
// if (a instanceof Voador) {
//     Voador v = (Voador) a;
//    v.Voar();
// }
// System.out.println();