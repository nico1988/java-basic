package cn.ccsunny.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        Integer i1 = map.put("张1", 11);
        Integer i2 = map.put("张2", 11);
        Integer i3 = map.put("张3", 11);
        Integer i4 = map.put("张4", 11);
        System.out.println(map);
    }
}
