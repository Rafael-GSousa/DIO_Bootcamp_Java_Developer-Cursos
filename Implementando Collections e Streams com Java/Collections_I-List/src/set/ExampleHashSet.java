package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println(notasAlunos);

       /*
         Obs.: ao contrário do LinkedHashSet, o HashSet não mantém
         os valores na ordem em que foram adicionados. Porém, sua performance é melhor
         do que a do LinkedHashSet e TreeHashSet
       */

        //Remove nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        //Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        //Navega em todos os itens com iterator
        Iterator<Double> iterator = notasAlunos.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Navega em todos os itens com for each
        for(Double nota : notasAlunos){
            System.out.println(nota);
        }

        //Limpa o set
        notasAlunos.clear();

        //Retorna se o set está vazzio ou não
        System.out.println(notasAlunos.isEmpty());

    }
}
