package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Agenda.AgendaConsulta;
import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;

public class App {
    public static void main(String[] args) {
        Cachorro cachorros[] = new Cachorro[10];
        Gato gatos[] = new Gato[10];
        OutrosAnimais outros[] = new OutrosAnimais[10];
        AgendaConsulta agenda[] = new AgendaConsulta[10];
        boolean ligado = true;
        int contCachorros = 0;
        int contGatos = 0;
        int contOutros = 0;
        int contAgenda = 0;
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao consultório!");
        while (ligado) {
            int escolha = Integer.parseInt(JOptionPane
                    .showInputDialog("1 - Cadastro \n 2 - Agendamento \n 3- Sair"));

            switch (escolha) {
                case 1: {
                    int acao1 = Integer.parseInt(JOptionPane
                            .showInputDialog("1 - Gato \n 2 - Cachorro \n 3- Outros \n 4 - Sair"));

                    switch (acao1) {
                        case 1: {
                            gatos[contGatos] = new Gato();
                            // preencher os atributos
                            gatos[contGatos].setNome(JOptionPane.showInputDialog("Informe o nome do gato: "));
                            gatos[contGatos].setPeso(
                                    Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do gato:")));
                            contGatos++;
                            break;
                        }

                        case 2: {
                            cachorros[contCachorros] = new Cachorro();
                            // preencher os atributos
                            cachorros[contCachorros]
                                    .setNome(JOptionPane.showInputDialog("Informe o nome do cachorro: "));
                            cachorros[contCachorros].setPeso(
                                    Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do cachorro:")));
                            contCachorros++;
                            break;
                        }

                        case 3: {
                            outros[contOutros] = new OutrosAnimais();
                            outros[contOutros].setNome(JOptionPane.showInputDialog("Informe o nome do cachorro: "));
                            outros[contOutros].setPeso(
                                    Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do cachorro:")));
                            contOutros++;
                            break;
                        }
                        default:
                            break;

                    }
                }

                case 2: {
                    String nomeAgenda = JOptionPane.showInputDialog("Informe o nome do pet: ");
                    boolean nomeOk = false;

                    for (int i = 0; i < contGatos; i++) {
                        if (nomeAgenda.equals(gatos[i].getNome())) {
                            JOptionPane.showMessageDialog(null, "Nome encontrado!");
                            nomeOk = true;
                            break;
                        }
                    }
                    for (int i = 0; i < contCachorros; i++) {
                        if (nomeAgenda.equals(cachorros[i].getNome())) {
                            JOptionPane.showMessageDialog(null, "Nome encontrado!");
                            nomeOk = true;
                            break;
                        }
                    }
                    for (int i = 0; i < contOutros; i++) {
                        if (nomeAgenda.equals(outros[i].getNome())) {
                            JOptionPane.showMessageDialog(null, "Nome encontrado!");
                            nomeOk = true;
                            break;
                        }
                    }

                    if (nomeOk) {
                        boolean registrarAgendamento = true;
                        while (registrarAgendamento) {
                            String dataAgenda = JOptionPane.showInputDialog("Informe a data do agendamento: ");
                            String horaAgenda = JOptionPane.showInputDialog("Informe a hora do agendamento: ");

                            if (contAgenda != 0) {
                                for (int i = 0; i < contAgenda; i++) {
                                    if (agenda[i].getAgendamento().equals(dataAgenda)) {
                                        // já existe um horário agendado
                                        JOptionPane.showMessageDialog(null, "Horário já agendado!");
                                        break;
                                    } else {
                                        // realizar o agendamento
                                        agenda[contAgenda] = new AgendaConsulta(horaAgenda, dataAgenda);
                                        contAgenda++;
                                        registrarAgendamento = false;
                                    }
                                }
                            } else {
                                agenda[contAgenda] = new AgendaConsulta(horaAgenda, dataAgenda);
                                contAgenda++;
                                registrarAgendamento = false;  
                            }
                        }
                    }
                }

            }
        }
    }
};
