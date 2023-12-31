package LojaCarrosList;
import java.util. *;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        List<Carros> listaCarros = new ArrayList<>();
        String listar = "";
        boolean verdadeiro = true;
         int contTeste = 0;
        while(verdadeiro) {
            int acao = Integer
                    .parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n 1 - Cadastro\n  2- Listar\n 3 - Consultar\n 4 - Apagar\n 5 - Sair"));

        switch(acao) {
            case 1:
            Carros c = new Carros();
            c.setAno(JOptionPane.showInputDialog("Informe o ano de seu carro"));
            c.setMarca(JOptionPane.showInputDialog("Informe a marca de seu carro: "));
            c.setModelo(JOptionPane.showInputDialog("Informe o modelo de seu carro: "));
            c.setCor("Informe a cor de seu carro");
            listaCarros.add(c);

            case 2: 
            for (Carros carros : listaCarros) {
                listar += carros.getMarca() + "," + carros.getModelo() + "\n"; // += significa concatenar
            }
            JOptionPane.showMessageDialog(null, listar);
            listar = "";

            case 3:
            int indexCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe o índice do carro que deseja consultar"));
            JOptionPane.showMessageDialog(null, listaCarros.get(indexCarros).getAno() + "\n" + listaCarros.get(indexCarros).getMarca() + "\n" + listaCarros.get(indexCarros).getModelo() + "\n" + listaCarros.get(indexCarros).getCor() + "\n");

            case 4:
            int indexCarros2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o índice do carro que deseja apagar"));
            listaCarros.remove(indexCarros2);

            case 5:
            verdadeiro = false;
        }
        }
    }
}