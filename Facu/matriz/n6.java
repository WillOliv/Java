package matriz;

import java.util.ArrayList;
import java.util.Collections;

public class n6 {

    public static void main(String[] args) {

        /// Listas

        String item1, item2, item3, item4;

        item1 = "Teste n1";
        item2 = "Teste n2";
        item3 = "Teste n3";
        item4 = "Teste n4";

        ArrayList<String> lista = new ArrayList<>();

        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
        lista.add(item4);

        lista.remove(0);

        /// #1
        System.out.println("\n" + lista + "\n");

        /// #2
        String primeiroTeste = lista.get(0);
        System.out.println("\nO primeiro teste da lista : " + primeiroTeste);

        /// #3
        for (String contador : lista) {
            System.out.println("\n--> " + contador);
        }

        /// #4
        for (int a = 0; a < lista.size(); a++) {
            System.out.println("\n---> " + lista.get(a));
        }

        /// #5
        lista.forEach(contador -> {
            System.out.println("\n---> " + contador);
        });

        /// #6
        Collections.sort(lista);
        System.out.println(lista);

    }
}