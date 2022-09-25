package queue;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
    public static void main(String[] args) {
        //Crie uma fila e execute as seguintes operações:
        Queue<String> nomes = new LinkedList<>();
        System.out.println("Crie uma fila e execute as seguintes operações:\n");
        //Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println("Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João:\n" + nomes);

        //Navegue na fila exibindo cada nome no console
        System.out.println("\nNavegue na fila exibindo cada nome no console:\n");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //Retorne o primeiro item da fila, sem removê-lo
        String primeiroNome = nomes.peek();
        System.out.println("\nRetorne o primeiro item da fila, sem removê-lo:\n" + primeiroNome);

        //Retorne o primeiro item da fila, removendo o mesmo
        String primeiroNomeRemovido = nomes.poll();
        System.out.println("\nRetorne o primeiro item da fila, removendo o mesmo:\n" + primeiroNomeRemovido);

        //Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila
        nomes.add("Daniel");
        System.out.println("\nAdicione um novo nome: Daniel." +
                "Verifique a posição que o mesmo assumiu na fila:\n" + nomes);

        //Retorne o tamanho da fila
        System.out.println("\nRetorne o tamanho da fila:\n" + nomes.size());

        //Verifique se a fila está vazia
        boolean filaVazia = nomes.isEmpty();
        String vazia;
        if(filaVazia){
            vazia = "Sim";
        }else{
            vazia = "Não";
        }
        System.out.println("\nVerifique se a fila está vazia:\n" + vazia);

        //Verifique se o nome Carlos está na fila
        System.out.println("\nVerifique se o nome Carlos está na fila:\n" + nomes.contains("Carlos"));

    }
}
