package letraQueNaoSeRepete;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sequencias= new ArrayList<>();
        sequencias.add("aaabccccdeeef");
        sequencias.add("strings");
        sequencias.add("microsoft visual studio 2022");
        sequencias.add("abcedoftz");
        Map<Character,Integer> mapa= new HashMap<>();
        for(String palavra: sequencias){
            for (Character letra: palavra.toCharArray()){
                if(mapa.containsKey(letra)){
                    mapa.put(letra, mapa.get(letra)+1);
                } else {
                    mapa.put(letra,1);
                }
            }
        }
        for (Map.Entry<Character,Integer> entry: mapa.entrySet()){
            if(entry.getValue()==1)
                System.out.println(entry.getKey());
                break;
        }
    }
}
