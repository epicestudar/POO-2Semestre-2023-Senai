import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickJButton extends JFrame{
    int cont=0;
    public ClickJButton() {
        super("Click");
        JPanel painel1 = new JPanel();

        // criar os componentes do painel
        JButton botao1 = new JButton("Clique aqui!");
        painel1.add(botao1);
        JLabel texto1 = new JLabel("n° de cliques: ");
        painel1.add(texto1);
        botao1.addActionListener(e->{
            cont++;
            texto1.setText("N° de cliques: " + cont);
            painel1.add(new JButton("" + cont));
            this.pack();
        });
        this.getContentPane().add(painel1);

        botao1.addActionListener(e-> {
            
        });

        // set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}
