package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

import Model.Usuario;

public class CadastroUsuarios extends JFrame {
    // atributos
    private JTextField inputNome;
    private JTextField inputIdade;
    private DefaultTableModel tableModel; // construção da lógica
    private JTable table; // construção visual
    private List<Usuario> usuarios = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, atualizarButton, apagarButton, apagarTodosButton, salvarButton;
    // private JButton cadastrarButton = new JButton("Cadastrar");
    // private JButton atualizarButton = new JButton("Atualizar");
    // private JButton apagarButton = new JButton("Apagar");
    // private JButton apagarTodosButton = new JButton("Apagar Todos");
    // private JButton salvarButton = new JButton("Salvar");

    // construtor
    public CadastroUsuarios() {
        // construir minha tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nome");
        tableModel.addColumn("Idade");
        table = new JTable(tableModel); // criando a tabela
        JScrollPane scrollPane = new JScrollPane(table); // adicionando a tabela ao JScrollPane para se ultrapassar o
                                                         // número de linhas ele scrolla

        // criar os componentes
        inputNome = new JTextField(20);
        inputIdade = new JTextField(5);
        cadastrarButton = new JButton("Cadastrar");
        atualizarButton = new JButton("Atualizar");
        apagarButton = new JButton("Apagar");
        apagarTodosButton = new JButton("Apagar Todos");
        salvarButton = new JButton("Salvar");

        // adicionar os componentes
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputNome);
        inputPanel.add(new JLabel("Idade:"));
        inputPanel.add(inputIdade);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);

        // set do layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        //tratamento de eventos
        
    }

    public void run(){
        pack();
        setVisible(true);

        // set do frame
        setTitle("Cadastro de Usuários");
        setSize(1000, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
