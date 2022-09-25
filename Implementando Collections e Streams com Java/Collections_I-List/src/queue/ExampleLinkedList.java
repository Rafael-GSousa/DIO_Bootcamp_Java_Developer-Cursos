package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {
    public static void main(String[] args) {
        //Criando uma fila
        Queue<String> filaBanco = new LinkedList<>();
        //Adicionando os elementos na fila
        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");
        //Exibindo a fila criada
        System.out.println(filaBanco);
        //Acessando e removendo o primeiro elemento da fila (método poll())
        String clienteASerAtendido = filaBanco.poll();
        //Exibindo o primeiro elemento da fila acessado e removido pelo método poll()
        System.out.println(clienteASerAtendido);
        //Exibindo a fila após o método poll()
        System.out.println(filaBanco);
        /*Acessando (mas não removendo, igual ao poll()) o primeiro elemento da
         fila com o método peek(), o qual retorna "null" em caso de fila vazia
         */
//        filaBanco.clear();
        String primeiroCliente = filaBanco.peek();
        /*Exibindo o primeiro elemento da fila acessado (mas não removido,
        igual ao poll()) pelo método peek()
         */
        System.out.println(primeiroCliente);
        //Exibindo a fila após o método peek()
        System.out.println(filaBanco);
        //Limpando a fila com o método clear(), da interface Collection
//        filaBanco.clear();
        /*Acessando (mas não removendo, igual ao poll()) o primeiro elemento da fila com
         o método element(), o qual retorna uma Exception caso a fila esteja vazia
        */
        String primeiroClienteOuErr0 = filaBanco.element();
        /*Exibindo o primeiro elemento da fila acessado
        (mas não removido, igual ao poll()) pelo método element()
         */
        System.out.println(primeiroClienteOuErr0);
        //Exibindo a fila após o método element()
        System.out.println(filaBanco);
        //Navegando por cada elemento da fila com for each
        for(String client : filaBanco){
            System.out.println(client);
        }
        //Navegando por cada elemento da fila com iterator
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("===>" + iteratorFilaBanco.next());
        }
        //Exibindo o tamanho da fila
        System.out.println(filaBanco.size());
        //Verificando se a fila está vazia
        System.out.println(filaBanco.isEmpty());

    }
}
