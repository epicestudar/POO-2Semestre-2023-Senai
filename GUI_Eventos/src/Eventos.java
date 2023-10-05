import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

/**
 * Exemplo1
 */
public class Eventos extends JFrame{

    // construtor
    public Eventos() {
        super("Exemplo 1 - Eventos");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);

        // painel principal - gridLayout(3 linhas e 2 colunas)
        JPanel mainPanel = new JPanel(new GridLayout(3, 2));
        this.add(mainPanel);

        // criar os componentes
        mainPanel.add(new JLabel("Nome: "));
        JTextField caixaNome = new JTextField();
        mainPanel.add(caixaNome);

        mainPanel.add(new JLabel("Sobrenome: "));
        JTextField caixaSobrenome = new JTextField();
        mainPanel.add(caixaSobrenome);

        JButton botao = new JButton("Concatenar: ");
        mainPanel.add(botao);
        JLabel texto = new JLabel();
        mainPanel.add(texto);

        // set frame
        this.setVisible(true);

        // tratamento de eventos (3 formas)
        // 1° forma: callback
        botao.addActionListener(e-> {
            texto.setText(caixaNome.getText() + " " + caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
        });
    }
}