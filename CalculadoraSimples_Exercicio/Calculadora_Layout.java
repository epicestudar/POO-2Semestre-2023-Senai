package CalculadoraSimples_Exercicio;

import javax.swing.*;
import java.awt.*;

public class Calculadora_Layout extends JFrame{
    String valores[] = {"7", "8", "9", "X", "6", "5", "4", "-", "3", "2", "1", "+", "/", "0", ".", "="};
    public Calculadora_Layout() {
        super("Calculadora");
        JPanel painel1 = new JPanel(new BorderLayout());
        this.add(painel1);
        painel1.add(new JTextField(15), BorderLayout.NORTH);
        JPanel painel2 = new JPanel(new GridLayout(4,4));
        painel1.add(painel2, BorderLayout.CENTER);
        for (int i = 0; i < valores.length; i++) {
            painel2.add(new JButton(valores[i]));
        }

        // set do frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
}
