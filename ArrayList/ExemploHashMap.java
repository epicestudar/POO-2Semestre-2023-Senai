package ArrayList;
import java.util.HashMap;

public class ExemploHashMap {
    HashMap <String, String> capitalEstado = new HashMap<>(); 

    public void teste() {
        capitalEstado.put("SP", "São Paulo");
        capitalEstado.put("RJ", "Rio de Janeiro");
        capitalEstado.put("MG", "Minas Gerais");
        capitalEstado.put("ES", "Vitória");

        System.out.println(capitalEstado.get("ES"));

        for (String i: capitalEstado.keySet()) {
            System.out.println(i + ": " + capitalEstado.get(i));
        }
    }

    public void exercicio1() {
        HashMap <String, Integer> nomeIdade = new HashMap<>();
    }
}
