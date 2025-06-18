package main.taskmanager;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.adicionarTarefa("Levar o lixo", true);
        manager.adicionarTarefa("Arrumar a cama", true);

        manager.listarTarefas();
        manager.removerTarefas(2);
        manager.listarTarefas();
    }
}