package Control;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Usuario;

public class OperacoesUsuario {
    // atributos
    private List<Usuario> usuarios;
    private DefaultTableModel tableModel;
    private JTable table;

    // construtor
    public OperacoesUsuario(List<Usuario> usuarios, DefaultTableModel tableModel, JTable table) {
        this.usuarios = usuarios;
        this.tableModel = tableModel;
        this.table = table;
    }

    // métodos do CRUD
    public void cadastrarUsuario(String nome, String idade) {
        int idadeInt = Integer.parseInt(idade);
        Usuario usuario = new Usuario(nome, idadeInt); // objeto da classe usuario do package model - servindo de modelo
        usuarios.add(usuario); // adicionando o objeto usuario ao List usuarios
        atualizarTabela();
    }

    public void atualizarUsuario(int linhaSelecionada, String nome, String idade) {
        if (linhaSelecionada != -1) {
            int idadeInt = Integer.parseInt(idade);
            Usuario usuario = new Usuario(nome, idadeInt);
            usuarios.set(linhaSelecionada, usuario);
            atualizarTabela();
        }
    }

    public void apagarUsuario(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            usuarios.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    public void apagarTodosUsuarios() {
        usuarios.clear();
        atualizarTabela();
    }

    public void salvarUsuarios() {
        Serializacao.serializar("dados.txt", usuarios);
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getIdade() });
        }
    }

}