package main.taskmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Thread.sleep(1000);
            System.out.println("===== GERENCIADOR DE TAREFAS =====");
            System.out.println(" 1 - ADICIONAR TAREFA");
            System.out.println(" 2 - LISTAR TAREFAS");
            System.out.println(" 3 - REMOVER TAREFA");
            System.out.println(" 4 - MARCAR TAREFA COMO CONCLUIDA");
            System.out.println(" 0 - SAIR");
            System.out.println(" MARCAR UMA OPCAO:");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Descricao da tarefa: ");
                    String descricao = scanner.nextLine();
                    manager.adicionarTarefa(descricao, false);
                    System.out.println("Tarefa adicionada.");
                    break;

                case "2":
                    manager.listarTarefas();
                    Thread.sleep(2000);
                    break;

                case "3":
                    System.out.println("ID da tarefa para remover: ");
                    int idRemove = Integer.parseInt(scanner.nextLine());
                    manager.removerTarefa(idRemove);
                    break;

                case "4":
                    System.out.println("Qual tarefa deseja concluir? : ");
                    int idConcluir = Integer.parseInt(scanner.nextLine());
                    manager.marcarConcluida(idConcluir);
                    System.out.println("Tarefa concluida");
                    break;

                case "0":
                    return;
            }
        }
    }
}