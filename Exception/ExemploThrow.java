import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        try{
            JOptionPane.showMessageDialog(null, "Bem-Vindo ao SENAI");
        String login = JOptionPane.showInputDialog("Informe seu login: ");
        String senha = JOptionPane.showInputDialog("Informe sua senha: ");
        String dataNascimento = JOptionPane.showInputDialog("Informe sua data de nascimento: ");
        dataNascimento.replace("/", "");
        System.out.println(dataNascimento );

        if(senha.length() != 6) {
            throw new Exception("Senha deve conter 6 digitos");
        } 
        else if(senha.equals(login)) {
            throw new Exception("Não é permitido a senha ser igual ao login");
        }
        else if(dataNascimento.equals(senha)) {
            throw new Exception("Não é permitido a data de nascimento ser igual à senha");
        }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "senha", 0);
        }
    }
}
