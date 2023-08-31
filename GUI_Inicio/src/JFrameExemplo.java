import javax.swing.JFrame;

public class JFrameExemplo extends JFrame{
    public JFrameExemplo() {
        super("minha primeira janela jframe GUIswing");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // ao fechar a janela ele encerra o meu programa
        this.setVisible(true);
    }
}
