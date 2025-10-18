    package Avulsos;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class listaConvidado {
        public static void main(String[] args) {
            ArrayList<String> convidados = new ArrayList<>();
            Scanner e = new Scanner(System.in);

            while (true){
                System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
                String entrada = e.next();
                if (entrada.equals("sair")){
                    break;
                } else if (entrada.equals("ver")) {
                    System.out.println("Lista de convidados:");
                    for (String nome : convidados) {
                        System.out.println("- " + nome);
                    }
                }else {
                    if (convidados.contains(entrada)){
                        System.out.println("NOME JA REGISTRADO");
                    }else {
                        convidados.add(entrada);
                            System.out.println("Convidado adicionado !");
                        }
                    }
                }
            }
    }
