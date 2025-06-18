package main.taskmanager;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== GERENCIADOR DE TAREFAS =====");
            System.out.println(" 1 - ADICIONAR TAREFA");
            System.out.println(" 2 - LISTAR TAREFAS");
            System.out.println(" 3 - REMOVER TAREFA");
            System.out.println(" 4 - MARCAR TAREFA COMO CONCLUIDA");
            System.out.println(" 0 - SAIR");
            System.out.println(" MARCAR UMA OPCAO:");
        }
        
    }
}