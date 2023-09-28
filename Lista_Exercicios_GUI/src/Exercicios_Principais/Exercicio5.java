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
        mainCard.add(card1, "Start");

        // card2 - minha primeira pergunta
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Quem foi campeão da copa do brasil?"));
        JTextField resposta1 = new JTextField(10);
        card2.add(resposta1);
        JButton but2 = new JButton("Avançar");
        card2.add(but2);
    }
}
