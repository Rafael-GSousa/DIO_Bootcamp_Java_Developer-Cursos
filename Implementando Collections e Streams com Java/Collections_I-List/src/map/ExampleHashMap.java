package map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundiaFifa = new HashMap<>();

        //Adiciona os campeões mundiais da Fifa no mapa
        campeoesMundiaFifa.put("Brasil", 5);
        campeoesMundiaFifa.put("Alemanha", 4);
        campeoesMundiaFifa.put("Itália", 4);
        campeoesMundiaFifa.put("Uruguai", 2);
        campeoesMundiaFifa.put("Argentina", 2);
        campeoesMundiaFifa.put("França", 2);
        campeoesMundiaFifa.put("Inglaterra", 1);
        campeoesMundiaFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundiaFifa.put("Brasil", 6);
        System.out.println(campeoesMundiaFifa);

        //Retorna a Argentina
        System.out.println(campeoesMundiaFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundiaFifa.containsKey("França"));

        //Remove o campeão França
        campeoesMundiaFifa.remove("França");
        System.out.println(campeoesMundiaFifa);

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundiaFifa.containsKey("França"));

        //Retorna se existe ou não alguma seleção hexa campeã
        System.out.println(campeoesMundiaFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundiaFifa.size());

        //Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : campeoesMundiaFifa.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }//Maior performance

        for (String key : campeoesMundiaFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundiaFifa.get(key));
        }//Menor performance
        System.out.println(campeoesMundiaFifa);

        //Verifica se o mapa contém a chave Estados Unidos
        System.out.println(campeoesMundiaFifa.containsKey("Estados Unidos"));

        //Verifica se o mapa contém o valor 5
        System.out.println(campeoesMundiaFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundiaFifa.size());
        campeoesMundiaFifa.clear();
        System.out.println(campeoesMundiaFifa.size());
    }
}
