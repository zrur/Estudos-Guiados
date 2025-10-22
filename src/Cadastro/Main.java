package Cadastro;

public class Main {
    public static void main(String[] args) {
        System.out.println("ANTES DA ATUALIZAÇÃO");
        Colaborador colaborador = new Colaborador("Joana" ,"Desenvolvedor",12);
        colaborador.exibirDados();

        System.out.println();
        System.out.println("APOS A ATUALIZAÇÃO");
        colaborador.atualizarCargo("Joana","QA",20);
        colaborador.exibirDados();
    }
}
