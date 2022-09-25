package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamAPI {
    public static void main(String[] args) {
        //Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        //Adiciona 7 estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com o maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com o menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra R no nome: " + estudantes.stream().filter((estudante) ->
             estudante.toLowerCase().contains("r").collect(Collectors.toList())));
    }
}
