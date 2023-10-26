package Control;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import Model.Agenda;
import Model.Usuario;

public class Serializacao {
    // Método para serializar uma lista de usuários em um arquivo binário
    public static void serializar(String arquivo, List<Usuario> usuarios) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {

            // Escreve a lista de usuários no arquivo especificado
            outputStream.writeObject(usuarios);
            System.out.println("Dados serializados com sucesso.");
        } catch (IOException e) {
            // Em caso de erro na serialização, imprime a mensagem de erro
            System.err.println("Erro ao serializar os dados: " + e.getMessage());
        }
    }

    // Método para deserializar uma lista de usuários a partir de um arquivo binário
    public static List<Usuario> deserializar(String arquivo) {
        try {
            // Abre o arquivo para leitura
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo));

            // Lê a lista de usuários do arquivo e a converte de volta para a lista
            return (List<Usuario>) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            // Em caso de erro na deserialização, imprime a mensagem de erro
            System.err.println("Erro ao deserializar os dados: " + e.getMessage());
            return null; // Retorna nulo para indicar que ocorreu um erro
        }
    }
    public static void serializarAgenda(String arquivoAgenda, List<Agenda> agendas) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivoAgenda))) {

            // Escreve a lista de usuários no arquivo especificado
            outputStream.writeObject(agendas);
            System.out.println("Dados serializados com sucesso.");
        } catch (IOException e) {
            // Em caso de erro na serialização, imprime a mensagem de erro
            System.err.println("Erro ao serializar os dados: " + e.getMessage());
        }
    }

     // Método para deserializar uma lista de usuários a partir de um arquivo binário
    public static List<Agenda> deserializarAgenda(String arquivoAgenda) {
        try {
            // Abre o arquivo para leitura
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivoAgenda));

            // Lê a lista de usuários do arquivo e a converte de volta para a lista
            return (List<Agenda>) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            // Em caso de erro na deserialização, imprime a mensagem de erro
            System.err.println("Erro ao deserializar os dados: " + e.getMessage());
            return null; // Retorna nulo para indicar que ocorreu um erro
        }
    }
}