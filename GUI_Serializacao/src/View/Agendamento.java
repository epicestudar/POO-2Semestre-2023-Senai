package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseEvent;

import Control.OperacoesAgendamento;
import Control.Serializacao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;

import Model.Agenda;


public class Agendamento extends JPanel {
    // atributos
    private JTextField inputNome;
    private JTextField inputData;
     private JTextField inputHora;
    private JTextField inputDescricao;
    private DefaultTableModel tableModelAgenda; // construção da lógica
    private JTable tableAgenda; // construção visual
    private List<Agenda> agendas = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, atualizarButton, apagarButton, salvarButton;
    // private JButton cadastrarButton = new JButton("Cadastrar");
    // private JButton atualizarButton = new JButton("Atualizar");
    // private JButton apagarButton = new JButton("Apagar");
    // private JButton apagarTodosButton = new JButton("Apagar Todos");
    // private JButton salvarButton = new JButton("Salvar");

    // construtor
    public Agendamento() {

        // construir minha tabela
        tableModelAgenda = new DefaultTableModel();
        tableModelAgenda.addColumn("Nome");
        tableModelAgenda.addColumn("Data");
        tableModelAgenda.addColumn("Hora");
        tableModelAgenda.addColumn("Descrição");
        tableAgenda = new JTable(tableModelAgenda); // criando a tabela
        JScrollPane scrollPane = new JScrollPane(tableAgenda); // adicionando a tabela ao JScrollPane para se ultrapassar o
                                                         // número de linhas ele scrolla

        // criar os componentes
        inputNome = new JTextField(10);
        inputData = new JTextField(8);
        inputHora = new JTextField(5);
        inputDescricao = new JTextField(20);
        cadastrarButton = new JButton("Cadastrar");
        atualizarButton = new JButton("Atualizar");
        apagarButton = new JButton("Apagar");
        salvarButton = new JButton("Salvar");

        // adicionar os componentes
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputNome);
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Descrição:"));
        inputPanel.add(inputDescricao);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(salvarButton);

        // set do layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // criação do arquivo binário
        File arquivoAgenda = new File("agenda.txt");
        if (arquivoAgenda.exists()) {
            agendas = Serializacao.deserializarAgenda("agenda.txt");
            atualizarTabela();
        }

        //tratamento de eventos
        tableAgenda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada =  tableAgenda.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputNome.setText((String)  tableAgenda.getValueAt(linhaSelecionada, 0));
                    inputData.setText((String)  tableAgenda.getValueAt(linhaSelecionada, 1));
                    inputHora.setText((String)  tableAgenda.getValueAt(linhaSelecionada, 2));
                    inputDescricao.setText((String)  tableAgenda.getValueAt(linhaSelecionada, 3));

                }
            }
        });
        OperacoesAgendamento operacoesAgendamento = new OperacoesAgendamento(agendas, tableModelAgenda, tableAgenda);

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoesAgendamento.cadastrarAgenda(inputNome.getText(), inputData.getText(), inputHora.getText(), inputDescricao.getText());
                inputNome.setText("");
                inputData.setText("");
                inputHora.setText("");
                inputDescricao.setText("");
            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoesAgendamento.atualizarAgenda(linhaSelecionada, inputNome.getText(), inputData.getText(), inputHora.getText(), inputDescricao.getText());

            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoesAgendamento.apagarUsuarioAgenda(linhaSelecionada);
            }
        });
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoesAgendamento.salvarAgendas();
            }
        });
        
    }

    // public void run(){
    //     pack();
    //     setVisible(true);

    //     // set do frame
    //     setTitle("Cadastro de Usuários");
    //     setSize(1000, 300);
    //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     setLocationRelativeTo(null);
    // }

    private void atualizarTabela() {
        tableModelAgenda.setRowCount(0);
        for (Agenda agenda : agendas) {
            tableModelAgenda.addRow(new Object[] { agenda.getUsuario(), agenda.getData(), agenda.getHora(), agenda.getDescricao() });
        }
    }
}
