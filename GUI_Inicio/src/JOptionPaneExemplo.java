import javax.swing.JOptionPane;

public class JOptionPaneExemplo extends JOptionPane{
    // atributo
    String informacao = "Minha Dialog JOP";
    // métodos
    public JOptionPaneExemplo() {
        super();
        this.showMessageDialog(getComponentPopupMenu(), informacao, informacao, 1);
    }
}
