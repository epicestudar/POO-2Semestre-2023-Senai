package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class FrameBase extends JFrame{
     // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public FrameBase() {
        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs
        // tab1 carros
        TaskPainel tab1 = new TaskPainel();
        jTPane.add("Carros", tab1);
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // métodos para tornar a janela visível
    public void run() {
        this.setVisible(true);
    }
}
