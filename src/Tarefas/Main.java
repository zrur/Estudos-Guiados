package Tarefas;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa("Estudar java",true);
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Tarefa t2 = new Tarefa("Estudar QA",false);


        tarefas.add(t1);
        tarefas.add(t2);

        for( Tarefa t: tarefas){
            t.exibirDados();
        }
    }
}
