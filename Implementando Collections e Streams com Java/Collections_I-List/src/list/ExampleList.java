package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println("ArrayList inicial criada: \n" + nomes);

        nomes.set(2, "Larissa");
        System.out.println("\nSubstituição do elemento no índice 2 de Juliana para Larissa: \n" + nomes);

        Collections.sort(nomes);//Ordenação da ArrayList
        nomes.set(2, "Wesley");
        System.out.println("\nSubstituição do elemento no índice 2 de Larissa para Wesley e ordenação da ArrayList: \n"
                + nomes);

        nomes.remove(4);//Remoção do elemento no índice 4, passado pelo número da posição
        System.out.println("\nApós remoção do elemento no índice 4 (Maria): \n" + nomes);

        nomes.remove("Wesley");//Remoção do elemento, diretamente passado como objeto
        System.out.println("\nApós remoção do objeto Wesley: \n" + nomes);

        String nome = nomes.get(3);//Busca o elemento direto na posição 3
        System.out.println("\nApós busca do elemento no índice 3: \n" + nome);

        int posicao = nomes.indexOf("Wesley");//Mostra em qual posição está o nome Wesley
        System.out.println("\nMostra a posição do nome Wesley: \n" + posicao);

        int tamanho = nomes.size();//Verifica o tamanho da ArrayList
        System.out.println("\nMostra o tamanho da ArrayList: \n" + tamanho);

        nomes.remove("Larissa");//Remove o objeto Larissa
        tamanho = nomes.size();//Verifica o tamanho da ArrayList novamente
        System.out.println("\nMostra o novo tamanho da ArrayList após a remoção do nome Larissa: \n" + tamanho);

        boolean temAnderson = nomes.contains("Anderson");//Verifica se na ArrayList contém o nome Anderson
        System.out.println("\nTem o nome Anderson na ArrayList?: \n" + temAnderson);

        boolean temFernando = nomes.contains("Fernando");//Verifica se na ArrayList contém o nome Fernando
        System.out.println("\nTem o nome Fernando na ArrayList?: \n" + temFernando);

        boolean listaVazia = nomes.isEmpty();//Verifica se a ArrayList está vazia
        System.out.println("\nA ArrayList está vazia?: \n" + listaVazia);

        System.out.println("\nIteração através do 'for each'");
        for (String nomeDoItem : nomes){
            System.out.println("---> " + nomeDoItem);
        }

        System.out.println("\nIteração através do 'while'");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("---> " + iterator.next());
        }

        nomes.clear();//Limpa toda a ArrayList
        listaVazia = nomes.isEmpty();//Verifica novamente se a ArrayList está vazia
        System.out.println("\nA ArrayList está vazia?: \n" + listaVazia);


    }
}
