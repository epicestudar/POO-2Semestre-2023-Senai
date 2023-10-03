package Exercicios_Principais;
import javax.swing.*;
import java.awt.*;

public class Exercicio5 extends JFrame{
    public Exercicio5() {
        super("Exercício 5 - quiz");
        //Criar um Painel Principal -> cardLayout
        CardLayout cl = new CardLayout();
        JPanel mainCard = new JPanel(cl);// set do layout
        this.add(mainCard);
        //criar os Cards
        // card1 - Tela Inicial
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Jogo Quiz - Seja bem Vindo"));
        JButton but1 = new JButton("Start"); // botão card 1
        card1.add(but1);
        mainCard.add(card1, "Start");

        // card2 - minha primeira pergunta
        JPanel card2 = new JPanel(new BorderLayout());
        JPanel painelVazio = new JPanel();
        JPanel painelVazio2 = new JPanel();
        JPanel painelPergunta = new JPanel();
        JPanel painelBotao = new JPanel();
        JLabel pergunta1 = new JLabel("Quem foi o campeão da copa do brasil?");
        JTextField resposta1 = new JTextField(10);
        painelPergunta.add(pergunta1);
        painelPergunta.add(resposta1);
        JButton but2 = new JButton("Avançar");
        painelBotao.add(but2);
        card2.add(painelVazio, BorderLayout.NORTH);
        card2.add(painelVazio2, BorderLayout.NORTH);
        card2.add(painelPergunta, BorderLayout.CENTER);
        card2.add(painelBotao, BorderLayout.SOUTH);
        mainCard.add(card2, "Start");

        

        // set do frame
        this.setDefaultCloseOperation(2);
         this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

         but1.addActionListener(e-> {
            cl.show(mainCard, but1.getText());
        });
    }
}
