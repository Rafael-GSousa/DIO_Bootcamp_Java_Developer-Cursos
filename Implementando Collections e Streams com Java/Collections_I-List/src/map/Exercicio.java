package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercicio {
    public static void main(String[] args) {
        hashMap();
        treeMap();
        hashTable();
    }

    private static void hashMap() {
        HashMap<String, String> estados = new HashMap<>();

        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");
        System.out.println(estados);

        estados.remove("MG");
        System.out.println(estados);

        estados.put("DF", "Distrito Federal");
        System.out.println(estados);

        System.out.println(estados.size());

        estados.remove("MS", "Mato Grosso do Sul");

        System.out.println(estados);

        for (String key : estados.keySet()){
            System.out.println(estados.get(key) + " - " + key);
        }

        Iterator<String> iterator = estados.keySet().iterator();
        while(iterator.hasNext()){
            String estado = iterator.next();
            System.out.println(estados.get(estado) + " - " + estado);
        }

        for(Map.Entry<String, String> entry : estados.entrySet()){
            System.out.println(entry.getValue() + " - " + entry.getKey());
        }

        System.out.println(estados.containsKey("SC"));
        System.out.println(estados.containsValue("Maranhão"));




    }

    private static void treeMap() {

    }

    private static void hashTable() {

    }
}
