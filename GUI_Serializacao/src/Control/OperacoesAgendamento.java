package Control;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Agenda;


public class OperacoesAgendamento {
    // atributos
    private List<Agenda> agendas;
    private DefaultTableModel tableModelAgenda;
    private JTable tableAgenda;

    // construtor
    public OperacoesAgendamento(List<Agenda> agendas, DefaultTableModel tableModelAgenda, JTable tableAgenda) {
        this.agendas = agendas;
        this.tableModelAgenda = tableModelAgenda;
        this.tableAgenda = tableAgenda;
    }

    // métodos do CRUD
    public void cadastrarAgenda(String nome, String data, String hora, String descricao) {
        Agenda agenda = new Agenda(nome, data, hora, descricao); // objeto da classe usuario do package model - servindo de modelo
        agendas.add(agenda); // adicionando o objeto usuario ao List agendas
        atualizarTabelaAgenda();
    }

    public void atualizarAgenda(int linhaSelecionada, String nome, String data, String hora, String descricao) {
        if (linhaSelecionada != -1) {
            Agenda agenda = new Agenda(nome, data, hora, descricao);
            agendas.set(linhaSelecionada, agenda);
            atualizarTabelaAgenda();
        }
    }

    public void apagarUsuarioAgenda(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            agendas.remove(linhaSelecionada);
            atualizarTabelaAgenda();
        }
    }

    public void salvarAgendas() {
        Serializacao.serializarAgenda("agenda.txt", agendas);
    }

    private void atualizarTabelaAgenda() {
        tableModelAgenda.setRowCount(0);
        for (Agenda agenda : agendas) {
            tableModelAgenda.addRow(new Object[] { agenda.getUsuario(), agenda.getData(), agenda.getHora(), agenda.getDescricao() });
        }
    }
}
