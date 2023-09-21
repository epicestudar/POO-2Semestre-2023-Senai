import javax.swing.JFrame;

public class jframe extends JFrame{
    public jframe() {
        super("SA3 GUI layout");
        this.add(new jtabbedPane());

        //set frame
        this.setBounds(500, 250, 500, 500);
        this.setDefaultCloseOperation(2);
        this.setVisible(true);

    }
}
