package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exercicio {
    public static void main(String[] args) {

        //Com HashSet
        hashSet();
        //Com LinkedHashSet
        linkedHashSet();
        //Com TreeSet
        treeSet();
    }

    public static void hashSet(){
        System.out.println("=== Com HashSet ===");
        HashSet<Integer> numbers = new HashSet<>();
        System.out.print("Crie um Set e execute as seguintes operações:\n\n");

        numbers.add(3);
        numbers.add(88);
        numbers.add(20);
        numbers.add(44);
        numbers.add(3);
        System.out.println("Adicione 5 números inteiros: 3, 88, 20, 44, 3:\n" + numbers + "\n");

        System.out.print("Navegue no Set exibindo cada número no console:\n" +
                "Com for each ---> ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.print("\nCom iterator ===> ");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        numbers.remove(3);
        System.out.println("\n\nRemova o primeiro item do Set:\n" + numbers + "\n");

        numbers.add(23);
        System.out.println("Adicione um novo número no Set: 23\n" + numbers + "\n");

        System.out.println("Verifique o tamanho do Set:\n" + numbers.size() + "\n");
        System.out.println("Verifique se o Set está vazio:\n" + numbers.isEmpty() + "\n");

    }
    public static void linkedHashSet(){
        System.out.println("\n=== Com LinkedHashSet ===");
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        System.out.println("Crie um Set e execute as seguintes operações");

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);
        System.out.println("\nAdicione 5 números: 3, 88, 20, 44, 3:\n" + numeros);

        System.out.println("\nNavegue no Set exibindo cada número no console");
        System.out.print("Com foreach: ");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.print("\nCom iterator: ");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        numeros.remove(3);
        System.out.println("\n\nRemova o primeiro item do Set:\n" + numeros);

        numeros.add(23);
        System.out.println("\nAdicione um  novo número no Set: 23\n" + numeros);

        System.out.println("\nVerifique o tamanho do Set:\n" + numeros.size());

        System.out.println("\nVerifique se o Set está vazio:\n" + numeros.isEmpty());
    }

    public static void treeSet(){
        System.out.println("\n=== Com TreeSet ===");
        TreeSet<Integer> num = new TreeSet<>();
        System.out.println("Crie um Set e execute as seguintes operações");

        num.add(3);
        num.add(88);
        num.add(20);
        num.add(44);
        num.add(3);
        System.out.println("\nAdicione 5 números: 3, 88, 20, 44, 3:\n" + num);

        System.out.println("\nNavegue no Set exibindo cada número no console");
        System.out.print("Com foreach: ");
        for (Integer numero : num) {
            System.out.print(numero + " ");
        }
        System.out.print("\nCom iterator: ");
        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        num.remove(3);
        System.out.println("\n\nRemova o primeiro item do Set:\n" + num);

        num.add(23);
        System.out.println("\nAdicione um  novo número no Set: 23\n" + num);

        System.out.println("\nVerifique o tamanho do Set:\n" + num.size());

        System.out.println("\nVerifique se o Set está vazio:\n" + num.isEmpty());
    }
}
