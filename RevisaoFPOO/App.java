package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;
import RevisaoFPOO.Horario.AgendaConsulta;

public class App {
    public static void main(String[] args) {
        // criar o vetir de classes
        Gato gatos[] = new Gato[10];
        Cachorro cachorros[] = new Cachorro[10];
        OutrosAnimais outros[] = new OutrosAnimais[10];
        AgendaConsulta agenda[] = new AgendaConsulta[100];

        // Cadastro dos animais
        // criar os contadores
        int contCachorros = 0;
        int contGatos = 0;
        int contOutros = 0;
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao nosso petshop!");
        boolean lojaAberta = true;
        while (lojaAberta) {
            int escolha = Integer
                    .parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n 1 - Cadastro\n  2- Agendamento\n 3 - Sair"));
            switch (escolha) {
                case 1: {
                    int acao = Integer.parseInt(JOptionPane.showInputDialog(
                            "1 - Cadastro Gato\n 2 - Cadastro Cachorro \n 3 - Outro animal \n 4 - Sair"));
                    switch (acao) {
                        case 1: {
                           JOptionPane.showInputDialog("Informe o nome de seu gato:");
                            JOptionPane.showInputDialog("Informe o peso de seu gato: ");
                            JOptionPane.showInputDialog("Informe o nome do proprietário: ");
                            JOptionPane.showInputDialog("Informe o seu porte: ");
                            JOptionPane.showInputDialog("Informe a sua raça: ");
                            lojaAberta = false;
                            break;
                        }
                        case 2: {
                            JOptionPane.showInputDialog("Informe o nome de seu cachorro:");
                            JOptionPane.showInputDialog("Informe o peso de seu cachorro: ");
                            JOptionPane.showInputDialog("Informe o nome do proprietário: ");
                            JOptionPane.showInputDialog("Informe o seu porte: ");
                            JOptionPane.showInputDialog("Informe a sua raça: ");
                            lojaAberta = false;
                            break;
                        }
                        case 3: {
                            JOptionPane.showInputDialog("Informe o nome de seu animal:");
                            JOptionPane.showInputDialog("Informe o peso de seu animal: ");
                            JOptionPane.showInputDialog("Informe o nome do proprietário: ");
                            JOptionPane.showInputDialog("Informe o seu porte: ");
                            JOptionPane.showInputDialog("Informe a sua raça: ");
                            lojaAberta = false;
                            break;
                        }
                        case 4: {
                            JOptionPane.showMessageDialog(null, "Você saiu!");
                            lojaAberta = false;
                        }
                        default: 
                        JOptionPane.showMessageDialog(null, "Solicite um desses valores!");
                    }
                }

                case 2: {
                    int agendar = Integer.parseInt(JOptionPane.showInputDialog(
                            "Nossos horários são predefinidos durante as semanas passam e não mudamos. Escolha um destes horários. Eles são válidos apenas para esta semana e funcionam de segunda até sexta\n 1 - 7:00\n 2 - 9:00\n 3 - 11:00\n 4 - 14:00\n 5 - 16:00\n 6 - 18:00"));
                    switch (agendar) {
                        case 1: {
                            JOptionPane.showInputDialog("Agora que selecionou o horário informe o seu nome:");
                            JOptionPane.showInputDialog("O nome de seu animal:");
                            JOptionPane.showMessageDialog(null, "Agendamento marcado para às 7 da manhã!");
                            lojaAberta = false;
                            break;
                        }
                        case 2: {
                            JOptionPane.showInputDialog("Agora que selecionou o horário informe o seu nome:");
                            JOptionPane.showInputDialog("O nome de seu animal:");
                            JOptionPane.showMessageDialog(null, "Agendamento marcado para às 9 da manhã!");
                            lojaAberta = false;
                            break;
                        }
                        case 3: {
                            JOptionPane.showInputDialog("Agora que selecionou o horário informe o seu nome:");
                            JOptionPane.showInputDialog("O nome de seu animal:");
                            JOptionPane.showMessageDialog(null, "Agendamento marcado para às 11 da manhã!");
                            lojaAberta = false;
                            break;
                        }
                        case 4: {
                             JOptionPane.showInputDialog("Agora que selecionou o horário informe o seu nome:");
                            JOptionPane.showInputDialog("O nome de seu animal:");
                           JOptionPane.showMessageDialog(null, "Agendamento marcado para às 14 da tarde!");
                            lojaAberta = false;
                            break;
                        }
                        case 5: {
                             JOptionPane.showInputDialog("Agora que selecionou o horário informe o seu nome:");
                            JOptionPane.showInputDialog("O nome de seu animal:");
                            JOptionPane.showMessageDialog(null, "Agendamento marcado para às 16 da tarde!");
                            lojaAberta = false;
                            break;
                        }
                        case 6: {
                             JOptionPane.showInputDialog("Agora que selecionou o horário informe o seu nome:");
                            JOptionPane.showInputDialog("O nome de seu animal:");
                            JOptionPane.showMessageDialog(null, "Agendamento marcado para às 18 da tarde!");
                            lojaAberta = false;
                            break;
                        }
                        default: 
                        JOptionPane.showInputDialog("Solicite um desses valores!");
                    }
                }
                case 3: {
                    JOptionPane.showInternalMessageDialog(null, "Até mais!");
                    lojaAberta = false;
                    break;
                }
                default: 
                JOptionPane.showMessageDialog(null, "Selecione um desses valores!");
            }
        }
    }
}
