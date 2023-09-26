package Exercicios_Principais;

import javax.swing.*;
import java.awt.*;

public class Exercicio1 extends JFrame {
    public Exercicio1() {
        super("Exercício 1");

        // criar um painel principal
        JPanel painelPrincipal = new JPanel();

        // set layout - card layout
        CardLayout cardLayout = new CardLayout();
        painelPrincipal.setLayout(cardLayout);

        // criando os botões
        JButton button1 = new JButton("Next");
        JButton button2 = new JButton("Next");
        JButton button3 = new JButton("Next");

        //agora vamos criar cards para adicionar ao painel principal
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Card 1"));
        card1.add(button1);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Card 2"));
        card2.add(button2);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Card 3"));
        card3.add(button3);

        // adicionar os cards criados ao painel principal
        painelPrincipal.add(card1);
        painelPrincipal.add(card2);
        painelPrincipal.add(card3);

        //set do frame
        this.add(painelPrincipal);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        // adicionando ações para o botão
        button1.addActionListener(e->{
            cardLayout.next(painelPrincipal);
        });
        button2.addActionListener(e->{
            cardLayout.next(painelPrincipal);
        });
        button3.addActionListener(e->{
            cardLayout.next(painelPrincipal);
        });
    }
}
