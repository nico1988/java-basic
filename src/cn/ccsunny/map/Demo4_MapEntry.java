package cn.ccsunny.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo4_MapEntry {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("a",11);
        map.put("b",12);
        map.put("c",13);
        map.put("d",14);
        map.put("e",15);
        System.out.println(map);
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String,Integer> en = it.next();
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println("key: " + "key" + ", value: " + value);
        }
        for(Map.Entry<String,Integer> en:map.entrySet()){
            System.out.println("key: " + en.getKey() + ", value: " + en.getValue());
        }
    }
}
