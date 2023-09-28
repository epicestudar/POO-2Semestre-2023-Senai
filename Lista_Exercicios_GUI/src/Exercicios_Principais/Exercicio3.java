package Exercicios_Principais;

import javax.swing.*;
import java.awt.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
         //criar um painel principal -> cardLayout
        //  JPanel painelPrincipal = new JPanel(new BorderLayout());
        //  this.add(painelPrincipal);
         JPanel cardPanel = new JPanel();
         CardLayout cardLayout = new CardLayout();
         cardPanel.setLayout(cardLayout);
         this.add(cardPanel);

         // criar os cards
         JPanel card1 = new JPanel(); 
        //  JPanel painelInputs = new JPanel(new BorderLayout());
        //  card1.add(painelInputs);
         card1.add(new JLabel("Home"));
         JButton homeButtonLogin = new JButton("Login");
         JButton homeButtonCadastro = new JButton("Cadastro");
         card1.add(homeButtonLogin);
         card1.add(homeButtonCadastro);
         cardPanel.add(card1, "Home");
        // painelPrincipal.add(card1, "Home");

          JPanel card2 = new JPanel(new BorderLayout()); 
         card2.add(new JLabel("Login"));
         JPanel botoesPrincipais = new JPanel();
         JPanel painelInputs = new JPanel();
         JPanel painelBotao = new JPanel();
         JButton loginButtonCadastro = new JButton("Cadastro");
         JButton loginButtonHome = new JButton("Home");
         JLabel textoEMail = new JLabel("Digite seu email: ");
         JTextField campoEmail = new JTextField(10);
         JLabel textoSenha = new JLabel("Digite sua senha: ");
         JTextField campoSenha = new JTextField(10);
         JButton botaoFazerLogin = new JButton("Enviar");
         botoesPrincipais.add(loginButtonCadastro);
        botoesPrincipais.add(loginButtonHome );
         painelInputs.add(textoEMail);
         painelInputs.add(campoEmail);
         painelInputs.add(textoSenha);
         painelInputs.add(campoSenha);
         painelBotao.add(botaoFazerLogin);
         card2.add(botoesPrincipais, BorderLayout.NORTH);
         card2.add(painelInputs, BorderLayout.CENTER);
         card2.add(painelBotao, BorderLayout.SOUTH);
         cardPanel.add(card2, "Login");
        //  painelPrincipal.add(card2, "Login");

           JPanel card3 = new JPanel(); 
         card3.add(new JLabel("Cadastro"));
         JButton cadastroButtonHome = new JButton("Home");
         JButton cadastroButtonLogin = new JButton("Login");
         JLabel textoNome = new JLabel("Nome completo:");
         JTextField campoNome = new JTextField(10);
         JLabel textoCidade = new JLabel("Cidade:");
         JTextField campoCidade = new JTextField(10);
         JLabel cadastroEmail = new JLabel("Seu email:");
         JTextField campoCadastroEmail = new JTextField(10);
         JLabel cadastroSenha = new JLabel("Senha:");
         JTextField campoCadastroSenha = new JTextField(10);
         card3.add(cadastroButtonHome);
         card3.add(cadastroButtonLogin);
         card3.add(textoNome);
         card3.add(campoNome);
         card3.add(textoCidade);
         card3.add(campoCidade);
         card3.add(cadastroEmail);
         card3.add(campoCadastroEmail);
         card3.add(cadastroSenha);
         card3.add(campoCadastroSenha);
         cardPanel.add(card3, "Cadastro");
        //  painelPrincipal.add(card3, "Cadastro");

        //  painelPrincipal.add(cardPanel, BorderLayout.NORTH);
        //   painelPrincipal.add(card2, BorderLayout.SOUTH);

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
