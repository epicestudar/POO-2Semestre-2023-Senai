import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {
        int n1, n2;
        boolean calcular = true;
        while (calcular) {
            int escolha = Integer
                    .parseInt(JOptionPane.showInputDialog("1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir\n 5 - Sair"));

            switch (escolha) {
                case 1:
                    try {
                        // recebendo os dados
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n° inteiro: "));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um n° inteiro: "));

                        // mostrando o resultado
                        JOptionPane.showMessageDialog(null, "O resultado é: " + (n1 + n2));
                        break;
                    } catch (Exception erroSoma) {
                        JOptionPane.showMessageDialog(null, "Erro! Valor digitado não é inteiro.");
                    }

                case 2:
                    try {
                        // recebendo os dados
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n° inteiro: "));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um n° inteiro: "));

                        // mostrando o resultado
                        JOptionPane.showMessageDialog(null, "O resultado é: " + (n1 - n2));
                        break;
                    } catch (Exception erroSubtracao) {
                        JOptionPane.showMessageDialog(null, "Erro! Valor digitado não é inteiro.");
                    }

                case 3:
                    try {
                        // recebendo os dados
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n° inteiro: "));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um n° inteiro: "));

                        // mostrando o resultado
                        JOptionPane.showMessageDialog(null, "O resultado é: " + (n1 * n2));
                        break;
                    } catch (Exception erroMultiplicacao) {
                        JOptionPane.showMessageDialog(null, "Erro! Valor digitado não é inteiro.");
                    }

                case 4:
                    try {
                        // recebendo os dados
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n° inteiro: "));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um n° inteiro: "));

                        // mostrando o resultado
                        JOptionPane.showMessageDialog(null, "O resultado é: " + (n1 / n2));
                        break;
                    } catch (NumberFormatException erroDivisao1) {
                        JOptionPane.showMessageDialog(null, "Erro! Valor digitado não é inteiro.");
                    } catch (ArithmeticException erroDivisao2) {
                        JOptionPane.showMessageDialog(null, "Erro! Impossível dividir um número por 0.");
                    }

                default:
                calcular = false;
                break;
            }
        }
    }
}