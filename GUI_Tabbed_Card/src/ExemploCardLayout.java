import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class ExemploCardLayout extends JFrame {
    public ExemploCardLayout() {
        super("Exemplo CardLayout");

        // criando um painel
        JPanel painelPrincipal = new JPanel();

        // criando um comboBox
        String comboBoxItens[] = { "1° Card", "2° Card", "3° Card" };
        JComboBox cb = new JComboBox(comboBoxItens);
        painelPrincipal.add(cb);

        // criando os cards
        JPanel card1 = new JPanel();
        card1.add(new JButton("Botão 1"));
        card1.add(new JButton("Botão 2"));
        card1.add(new JButton("Botão 3"));

        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));

        // painel que vai conter os meus cards
        JPanel cardPrincipal = new JPanel(new CardLayout());
        cardPrincipal.add(card1, "1° Card");
        cardPrincipal.add(card2, "2° Card");
        this.add(painelPrincipal);
        painelPrincipal.add(cardPrincipal);

        // set do frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        cb.addItemListener(e-> {
            CardLayout cl = (CardLayout) (cardPrincipal.getLayout());
            cl.show(cardPrincipal, (String) e.getItem());
        });
    }
}
