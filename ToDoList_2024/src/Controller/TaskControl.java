package Controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Task;

public class TaskControl {
    // Atributos
    private List<Task> tarefas;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public TaskControl(List<Task> tarefas, DefaultTableModel tableModel, JTable table) {
        this.tarefas = tarefas;
        this.tableModel = tableModel;
        this.table = table;
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        tarefas = new TaskDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Task task : tarefas) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { task.getTarefa(), task.getSituacao()});
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String tarefa, String situacao) {
        new TaskDAO().cadastrar(tarefa, situacao);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String tarefa, String situacao) {
        new TaskDAO().atualizar(tarefa, situacao);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String tarefa) {
        new TaskDAO().apagar(tarefa);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}
