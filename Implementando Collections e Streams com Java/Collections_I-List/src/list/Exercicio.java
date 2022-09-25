package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        //Crie uma lista e execute as seguintes operações
        List<String> nomes = new ArrayList<>();
        System.out.println("Crie uma lista e execute as seguintes operações:\n");

        //Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println("Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João:\n" + nomes);

        //Navegue na lista exibindo cada nome no console
        System.out.print("\nNavegue na lista exibindo cada nome no console:\n");
        for(String nome : nomes){
            System.out.print(nome + " ");
        }

        //Substitua o nome Carlos por Roberto
        nomes.set(2, "Roberto");
        System.out.println("\n\nSubstitua o nome Carlos por Roberto:\n" + nomes);

        //Retorne o nome da posição 1
        System.out.println("\nRetorne o nome da posição 1:\n" + nomes.get(1));

        //Remova o nome da posição 4
        nomes.remove(4);
        System.out.println("\nRemova o nome da posição 4:\n" + nomes);

        //Remova o nome Pedro
        nomes.remove("Pedro");
        System.out.println("\nRemova o nome Pedro:\n" + nomes);

        //Retorne a quantidade de itens na lista
        int tamanho = nomes.size();
        System.out.println("\nRetorne a quantidade de itens na lista:\n" + tamanho);

        //Verifique se o nome Juliano existe na lista
        boolean temJuliano = nomes.contains("Juliano");
        System.out.println("\nVerifique se o nome Juliano existe na lista:\n" + temJuliano);

        //Crie uma nova lista
        List<String> nomes2 = new ArrayList<>();
        //com os nomes Ismael e Rodrigo
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        System.out.println("\nCrie uma nova lista com os nomes Ismael e Rodrigo:\n" + nomes2);

        //Mostrando as duas listas
        System.out.println("\nLista 1:\n" + nomes + "\nLista 2:\n" + nomes2);

        //Adicione todos os itens da nova lista na primeira lista criada
        nomes.addAll(nomes2);
        System.out.println("\nAdicione todos os itens da nova lista na primeira lista criada:\n" + nomes);

        //Ordene os itens da lista por ordem alfabética
        Collections.sort(nomes);
        System.out.println("\nOrdene os itens da lista por ordem alfabética:\n" + nomes);

        //Verifique se a lista está vazia
        boolean listaVazia = nomes.isEmpty();
        System.out.println("\nVerifique se a lista está vazia:\n" + listaVazia);

        System.out.println("\nLista final:\n" + nomes);

    }
}
