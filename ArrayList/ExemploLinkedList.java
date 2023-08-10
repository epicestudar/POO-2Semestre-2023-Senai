package ArrayList;

import java.util.LinkedList;

public class ExemploLinkedList {
    LinkedList <String> pessoas = new LinkedList<>();

    public void teste() {
        pessoas.add("Pedro");
        pessoas.add("João");
        pessoas.add("Maria");
        pessoas.add("Cecília");

        //cecília vai para a primeira posição
        pessoas.addFirst("Cecília");

        //remove o último da lista
        pessoas.removeLast();
        System.out.println(pessoas);
    }
}
