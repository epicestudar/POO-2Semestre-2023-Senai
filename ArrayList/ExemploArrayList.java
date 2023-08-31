package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    Random rd = new Random();
    ArrayList<String> carros = new ArrayList<>();

    public void teste() {
        // adicionando elementos
        carros.add("Fusca");
        carros.add("Brasília");
        carros.add("Monza");
        carros.add("Civic");
        carros.add("UNIK");
        carros.add("BMW");
        System.out.println(carros);

        // retirando elementos
        carros.clear();
        System.out.println(carros);

        // percorrer a lista com for
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }

        // percorrer a lista com for-each
        for (String s : carros) {
            System.out.println(s);
        }

        // ordenando a lista (.sort(Collections))
        Collections.sort(carros);
        System.out.println(carros);
        Collections.reverse(carros); // inverte a lista
        System.out.println(carros);
    }

    public void exercicio1() {
        // criar um arraylist de n° inteiros
        // escrever 5n°s aleatórios - ordenar e imprimir
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n°:")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n°:")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n°:")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n°:")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um n°:")));
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
