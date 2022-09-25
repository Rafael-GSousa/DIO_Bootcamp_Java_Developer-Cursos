package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore binária com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo da árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima da árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a última capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Navega em todos os itens da árvore com iterator
        Iterator<String> iterator = treeCapitais.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Navega em todos os itens da árvore com for each
        for (String capital : treeCapitais) {
            System.out.println(capital);
        }

    }
}
