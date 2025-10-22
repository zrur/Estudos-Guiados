package Tarefas;
import java.util.ArrayList;

public class Tarefa {
    String descrição;
    boolean concluída;

    public Tarefa(String descrição, boolean concluída){
        this.descrição = descrição;
        this.concluída = concluída;
    }

    public void exibirDados() {
        System.out.print("Tarefa: " + descrição + " - Status: ");

        if (concluída) {
            System.out.println("Concluída");
        } else {
            System.out.println("Pendente");
        }
    }
}
