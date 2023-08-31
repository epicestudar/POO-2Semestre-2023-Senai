import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContainerComponentes extends JFrame{
    public ContainerComponentes() {
        super("Janela principal");

        // adicionar outro container
        JPanel painel1 = new JPanel();
        this.getContentPane().add(painel1);

        // adicionar componentes ao painel
        painel1.add(new JLabel("Informe um número"));
        JTextField campo1 = new JTextField("Informe o valor", 25);
        painel1.add(campo1);
        JButton botao1 = new JButton("Enviar");
        painel1.add(botao1);
        
        // usar uma listener para o botão
        botao1.addActionListener(e-> {
            int quant = Integer.parseInt(campo1.getText());
            for (int i = 0; i < quant; i++) {
                painel1.add(new JButton("" + i));
            }
            this.pack();
        });

        // set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}
