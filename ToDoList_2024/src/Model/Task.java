package Model;

public class Task {
    // atributos
    private String tarefa;
    private String situacao;
    public Task(String tarefa, String situacao) {
        this.tarefa = tarefa;
        this.situacao = situacao;
    }
    public String getTarefa() {
        return tarefa;
    }
    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    
}