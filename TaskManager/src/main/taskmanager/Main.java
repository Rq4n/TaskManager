package main.taskmanager;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        task.setId(1);
        task.setDescricao("Levar o lixo");
        task.setConcluida(true);
        System.out.println(task);
    }
}