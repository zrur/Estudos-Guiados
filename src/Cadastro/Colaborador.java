package Cadastro;

public class Colaborador {
        String nome;
        String cargo;
        int nivelDeAcesso;

        public Colaborador(String nome,String cargo,int nivelDeAcesso){
            this.nome = nome;
            this.cargo = cargo;
            this.nivelDeAcesso = nivelDeAcesso;
        }
        public void atualizarCargo(String nome,String novoCargo,int novoNivel){
            this.nome = nome;
            this.cargo = novoCargo;
            this.nivelDeAcesso = novoNivel;
        }
        public void exibirDados(){
            System.out.println("Nome: " + nome );
            System.out.println("Cargo: " + cargo);
            System.out.println("Nivel de acesso: " + nivelDeAcesso);
        }
}
