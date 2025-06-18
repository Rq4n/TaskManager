package main.taskmanager;

public class Task {
    private int id;
    private String descricao;
    private boolean concluida;

    public void Task(int id, String descricao, boolean concluida){
        this.id = id;
        this.descricao = descricao;
        this.concluida = concluida;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida(){
        return isConcluida();
    }
    @Override
    public String toString(){
    return " | ID: "+id+" | Descricao: " +descricao+ " | Concluida: " + (concluida ? "Sim | " : "Pendente | ");
    }
}
