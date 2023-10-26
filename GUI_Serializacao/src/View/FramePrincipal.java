package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class FramePrincipal extends JFrame{
    public FramePrincipal() {
        super("Aplicação");
        setDefaultCloseOperation(2);
        JTabbedPane abas = new JTabbedPane();
        abas.add("Cadastro de Usuários", new CadastroUsuarios());
        abas.add("Agendamentos", new Agendamento());
        add(abas);
    }

    public void run() {
        pack();
        setVisible(true);
    }
}
