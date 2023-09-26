package Exercicios_Principais;
import javax.swing.*;
import java.awt.*;

public class Exercicio3 extends JFrame{
    public Exercicio3() {
        super("Exercício 3");

        //criando um painel principal
        JPanel painelPrincipal = new JPanel();
        JPanel painelLogin = new JPanel();
        JPanel painelCadastro = new JPanel();

        //card layout
        CardLayout cardLayout = new CardLayout();
        painelPrincipal.setLayout(cardLayout);
        painelLogin.setLayout(cardLayout);
        painelCadastro.setLayout(cardLayout);

        // criando os botões
        JButton buttonLogin = new JButton("Login");
        JButton buttonCadastro = new JButton("Cadastro");
        JButton buttonInicio = new JButton("Início");

        //agora vamos criar cards para adicionar ao painel principal
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Login"));
        card1.add(buttonLogin);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Cadastro"));
        card2.add(buttonCadastro);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Início"));
        card3.add(buttonInicio);

        // adicionar os cards criados ao painel principal
        painelLogin.add(card1);
        painelCadastro.add(card2);
        painelPrincipal.add(card3);

        //set do frame
        this.add(painelPrincipal);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        // adicionando ações para o botão
        buttonLogin.addActionListener(e->{
            cardLayout.next(painelLogin);
        });
        buttonCadastro.addActionListener(e->{
            cardLayout.next(painelCadastro);
        });
        buttonInicio.addActionListener(e->{
            cardLayout.next(painelPrincipal);
        });
    }
}
