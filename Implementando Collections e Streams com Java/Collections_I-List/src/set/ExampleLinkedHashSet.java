package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adiciona números no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        System.out.println(sequenciaNumerica);

        /*
        Obs.: ao contrário do HashSet, o LinkedHashSet mantém
         os valores na ordem em que foram adicionados. Porém, sua performance é pior
         do que a do HashSet
         */

        //Remove o número do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os itens com iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Navega em todos os itens com for each
        for(Integer numero : sequenciaNumerica){
            System.out.println(numero);
        }

        //Limpa o set
        sequenciaNumerica.clear();

        //Retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
