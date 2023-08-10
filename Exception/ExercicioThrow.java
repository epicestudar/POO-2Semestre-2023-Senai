import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ExercicioThrow {
    public static void main(String[] args) {
        // Exercício: Faça um programa aonde a senha OBRIGATORIAMENTE precisa conter, no
        // MÍNIMO, 1 letra maiúscula e 1 minúscula

        try {
            String senha = JOptionPane.showInputDialog("Informe sua senha");

            if (!senha.matches(".*[a-z].*") || !senha.matches(".*[A-Z].*")) {
                throw new Exception(
                        "Senha inválida! É obrigatório sua senha conter um caractere em maiúsculo e um em minúsculo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "senha", 0);
        }
    }
}
