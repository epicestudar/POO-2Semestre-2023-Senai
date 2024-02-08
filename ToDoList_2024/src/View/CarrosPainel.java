package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import Controller.TaskControl;
import Controller.TaskDAO;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import Controller.TaskDAO;
import Controller.TaskControl;
import Model.Task;

public class CarrosPainel extends JPanel {
    private JButton cadastrar, apagar, editar;
    private JTextField carMarcaField, carModeloField, carAnoField, carPlacaField,
            carValorField;
    private List<Task> tarefas;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // construtor(GUI - Jpanel)
    public CarrosPainel() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(7, 2));
        inputPanel.add(new JLabel("Tarefa")).setFont(new Font("Arial", Font.PLAIN, 16));
        carMarcaField = new JTextField(20);
        inputPanel.add(carMarcaField);
        inputPanel.add(new JLabel("Situação")).setFont(new Font("Arial", Font.PLAIN, 16));
        carModeloField = new JTextField(20);
        inputPanel.add(carModeloField);
        add(inputPanel);
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar")).setBackground((Color.CYAN));
        botoes.add(editar = new JButton("Editar")).setBackground((Color.GREEN));
        botoes.add(apagar = new JButton("Apagar")).setBackground((Color.RED));
        add(botoes);

        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Tarefa", "Situação" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // botões de eventos
        // tratamento de eventos(construtor)
        // tratamento de Eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    carMarcaField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    carModeloField.setText((String) table.getValueAt(linhaSelecionada, 1));
                }
            }
        });
        // Cria um objeto operacoes da classe CarrosControl para executar operações no
        // banco de dados

        new TaskDAO().criaTabela();

        atualizarTabela();

        TaskControl operacoes = new TaskControl(tarefas, tableModel, table);
        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco
        // de dados
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (carMarcaField.getText().isEmpty() || carModeloField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrar o carro");
                } else {
                    int confirmacao1 = JOptionPane.showConfirmDialog(null,
                            "Tem certeza de que deseja listar a tarefa?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (confirmacao1 == JOptionPane.YES_NO_OPTION) {
                        operacoes.cadastrar(carMarcaField.getText(), carModeloField.getText());
                        // Limpa os campos de entrada após a operação de cadastro
                        carMarcaField.setText("");
                        carModeloField.setText("");
                        // JOptionPane.showMessageDialog(null, "O carro do modelo " + carModeloField.getText()
                        //         + " da placa " + carPlacaField.getText() + " foi cadastrado com sucesso!");
                        JOptionPane.showMessageDialog(null, "A tarefa foi listada com sucesso!");
                    }
                    else if(confirmacao1 == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Listagem da tarefa cancelada!");
                        carMarcaField.setText("");
                        carModeloField.setText("");
                    }
                }

            }
        });

        // Configura a ação do botão "editar" para atualizar um registro no banco de
        // dados
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (carMarcaField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione algo para editar");
                } else {
                    operacoes.atualizar(carMarcaField.getText(), carModeloField.getText());
                    // Limpa os campos de entrada após a operação de atualização
                    carMarcaField.setText("");
                    carModeloField.setText("");
                    JOptionPane.showMessageDialog(null, "Tarefa editada com sucesso!");
                }
            }
        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (carMarcaField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione algo para apagar!");
                } else {
                    int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja apagar a tarefa?",
                            "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (confirmacao == JOptionPane.YES_NO_OPTION) {
                        operacoes.apagar(carMarcaField.getText());
                        // Limpa os campos de entrada após a operação de exclusão
                        carMarcaField.setText("");
                        carModeloField.setText("");
                        // JOptionPane.showMessageDialog(null, "O carro do modelo " + carModeloField.getText()
                        //         + " da placa " + carPlacaField.getText() + " foi apagado com sucesso!");
                        JOptionPane.showMessageDialog(null, "A tarefa foi apagada com sucesso!");
                    }
                    else if (confirmacao == JOptionPane.NO_OPTION) {
                        carMarcaField.setText("");
                        carModeloField.setText("");
                        // JOptionPane.showMessageDialog(null, "O carro do modelo " + carModeloField.getText()
                        //         + " da placa " + carPlacaField.getText() + " foi apagado com sucesso!");
                        JOptionPane.showMessageDialog(null, "Exclusão da tarefa cancelada!");
                    }
                }
            }
        });

    }

    private void atualizarTabela() {
        // atualizar tabela pelo banco de dados
        tableModel.setRowCount(0);
        tarefas = new TaskDAO().listarTodos();
        for (Task tarefa : tarefas) {
            tableModel.addRow(new Object[] { tarefa.getTarefa(), tarefa.getSituacao() });
        }
    }

    public void run() {
        this.setVisible(true);
    }
}