package Exercicios_Principais;

import javax.swing.*;
import java.awt.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
        JFrame frame = new JFrame("Navegação App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Criar um painel de conteúdo e definir o layout para CardLayout
        JPanel contentPane = new JPanel();
        CardLayout cardLayout = new CardLayout();
        contentPane.setLayout(cardLayout);

        // Tela Inicial
        JPanel telaInicial = new JPanel();
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Cadastro");
        JButton inicialButton = new JButton("Início");
        telaInicial.add(loginButton);
        telaInicial.add(registerButton);

        // Tela de Login
        JPanel telaLogin = new JPanel();
        JButton backToHomeButtonLogin = new JButton("Voltar");
        telaLogin.add(backToHomeButtonLogin);

        // Tela de Registro
        JPanel telaRegistro = new JPanel();
        JButton backToHomeButtonRegister = new JButton("Voltar");
        telaRegistro.add(backToHomeButtonRegister);

        // Tela Principal
        JPanel telaPrincipal = new JPanel();
        JLabel welcomeLabel = new JLabel("Bem-vindo à Tela Principal!");
        telaPrincipal.add(welcomeLabel);

        // Adicionar as telas ao painel de conteúdo
        contentPane.add(telaInicial, "Tela Inicial");
        contentPane.add(telaLogin, "Tela de Login");
        contentPane.add(telaRegistro, "Tela de Registro");
        contentPane.add(telaPrincipal, "Tela Principal");

        // Adicionar o painel de conteúdo ao frame
        frame.setContentPane(contentPane);

        // Adicionar ouvintes para os botões
        loginButton.addActionListener(e -> cardLayout.show(contentPane, "Tela de Login"));
        registerButton.addActionListener(e -> cardLayout.show(contentPane, "Tela de Registro"));
        backToHomeButtonLogin.addActionListener(e -> cardLayout.show(contentPane, "Tela Inicial"));
        backToHomeButtonRegister.addActionListener(e -> cardLayout.show(contentPane, "Tela Inicial"));

        // Exibir o frame
        frame.setVisible(true);
    }
}
