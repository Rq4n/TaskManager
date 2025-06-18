package main.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tarefas = new ArrayList<>();
    private int contadorId = 1;

    //Adicionar tarefas
    public void adicionarTarefa(String descricao, boolean concluida){
        Task novaTarefa = new Task(contadorId, descricao, concluida);
            tarefas.add(novaTarefa);
            contadorId++;
    }
    //Listar tarefas
    public void listarTarefas(String descricao, boolean concluida){
        if(tarefas.isEmpty()){
            System.out.println("Nao tem nenhuma tarefa");
        } else{
            System.out.println(tarefas);
        }
    }
}
