package Exercicios_Principais;

import javax.swing.*;
import java.awt.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
         //criar um painel principal -> cardLayout
         JPanel cardPanel = new JPanel();
         CardLayout cardLayout = new CardLayout();
         cardPanel.setLayout(cardLayout);
         this.add(cardPanel);

         // criar os cards
         JPanel card1 = new JPanel(); 
         card1.add(new JLabel("Home"));
         JButton homeButtonLogin = new JButton("Login");
         JButton homeButtonCadastro = new JButton("Cadastro");
         card1.add(homeButtonLogin);
         card1.add(homeButtonCadastro);
         cardPanel.add(card1, "Home");

          JPanel card2 = new JPanel(); 
         card2.add(new JLabel("Login"));
         JButton loginButtonCadastro = new JButton("Cadastro");
         JButton loginButtonHome = new JButton("Home");
         JLabel textoEMail = new JLabel("Digite seu email: ");
         JTextField campoEmail = new JTextField(10);
         JLabel textoSenha = new JLabel("Digite sua senha: ");
         JTextField campoSenha = new JTextField(10);
         JButton botaoFazerLogin = new JButton("Enviar");
         card2.add(loginButtonCadastro);
         card2.add(loginButtonHome );
         card2.add(textoEMail);
         card2.add(campoEmail);
         card2.add(textoSenha);
         card2.add(campoSenha);
         card2.add(botaoFazerLogin);
         cardPanel.add(card2, "Login");

           JPanel card3 = new JPanel(); 
         card3.add(new JLabel("Cadastro"));
         JButton cadastroButtonHome = new JButton("Home");
         JButton cadastroButtonLogin = new JButton("Login");
         card3.add(cadastroButtonHome);
         card3.add(cadastroButtonLogin);
         cardPanel.add(card3, "Cadastro");

         // set do frame
         this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        // tratamento de eventos para os botões
        homeButtonLogin.addActionListener(e-> {
            cardLayout.show(cardPanel, homeButtonLogin.getText());
        });
        homeButtonCadastro.addActionListener(e-> {
            cardLayout.show(cardPanel, homeButtonCadastro.getText());
        });
       loginButtonCadastro.addActionListener(e-> {
            cardLayout.show(cardPanel,loginButtonCadastro.getText());
        });
        loginButtonHome.addActionListener(e-> {
            cardLayout.show(cardPanel, loginButtonHome.getText());
        });
        cadastroButtonHome.addActionListener(e-> {
            cardLayout.show(cardPanel, cadastroButtonHome.getText());
        });
        cadastroButtonLogin.addActionListener(e-> {
            cardLayout.show(cardPanel, cadastroButtonLogin.getText());
        });
    }
}
