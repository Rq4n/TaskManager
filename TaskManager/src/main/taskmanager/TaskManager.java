package main.taskmanager;

import com.sun.source.util.TaskListener;

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
    public void listarTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Nao tem nenhuma tarefa");
        } else {
            for (Task tarefa : tarefas)
                System.out.println(tarefa);
        }
    }
    //Remover tarefas
    public void removerTarefas(int id){
        boolean removido = tarefas.removeIf(tarefas-> tarefas.getId() == id );
        if (removido){
            System.out.println("Tarefa:"+id+" Removida");
        } else {
            System.out.println("Tarefa: "+id+" Nao encontrado");
        }
    }
}
