import Connection.ConnectionDAO;

public class App {
    public static void main(String[] args) throws Exception {
        new ConnectionDAO().criaTabela();
        new ConnectionDAO().inserir("leandro", "leandro@gmail.com");
    }
}
