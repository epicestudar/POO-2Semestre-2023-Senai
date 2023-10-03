package Exercicios_Principais;
import javax.swing.*;
import java.awt.*;

public class Exercicio5 extends JFrame{
    // atributo
    int pontuacao = 0;
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

        // card2 - minha segunda pergunta
        JPanel card3 = new JPanel(new BorderLayout());
        JPanel painelVazioCard = new JPanel();
        JPanel painelVazioC3 = new JPanel();
        JPanel painelPerguntaC4 = new JPanel();
        JPanel painelBotaoC3 = new JPanel();
        JLabel pergunta2 = new JLabel("Quem foi o campeão da copa de 74?");
        JTextField resposta2 = new JTextField(10);
        painelPerguntaC4.add(pergunta2);
        painelPerguntaC4.add(resposta2);
        JButton but3 = new JButton("Avançar");
        painelBotaoC3.add(but3);
        card3.add(painelVazioCard, BorderLayout.NORTH);
        card3.add(painelVazioC3, BorderLayout.NORTH);
        card3.add(painelPerguntaC4, BorderLayout.CENTER);
        card3.add(painelBotaoC3, BorderLayout.SOUTH);
        mainCard.add(card3, "Start");

        // card 4 - pontuação
        JPanel card4 = new JPanel();
        JLabel pontuacaoFinal = new JLabel();
        card4.add(pontuacaoFinal);
        JButton botao4 = new JButton("Reiniciar");
        card4.add(botao4);
        mainCard.add(card4, "Final");
        

        // set do frame
        this.setDefaultCloseOperation(2);
         this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        // tratamento de eventos
         but1.addActionListener(e-> {
            cl.next(mainCard);
        });
        but2.addActionListener(e-> {
            if(resposta1.getText().toLowerCase().equals("sao paulo")) {
                pontuacao++;
            }
            cl.next(mainCard);
            resposta1.setText("");
        });
        but3.addActionListener(e-> {
            if(resposta2.getText().toLowerCase().equals("alemanha")) {
                pontuacao++;
            }
            cl.next(mainCard);
            resposta1.setText("");
            pontuacaoFinal.setText("Sua pontuação foi de: " + pontuacao);
        });
        botao4.addActionListener(e-> {
            cl.first(mainCard);
        });
    }
}
