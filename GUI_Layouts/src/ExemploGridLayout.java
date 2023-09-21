import javax.swing.*;
import java.awt.*;

public class ExemploGridLayout extends JFrame{
    public ExemploGridLayout() {
        super("Janela Principal");
        JPanel painel1 = new JPanel();
        this.add(painel1);
        // mudar o layout do JPanel Flow -> Grid
        GridLayout grid = new GridLayout(3, 3);
        painel1.setLayout(grid);
        // adicionar componentes no JPanel
        for (int i = 0; i < 9; i++) {
            painel1.add(new JButton(""+i));
        }

        //set do frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
}
