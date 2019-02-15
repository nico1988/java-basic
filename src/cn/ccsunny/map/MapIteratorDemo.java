package cn.ccsunny.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteratorDemo {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        Integer i1 = map.put("张1", 11);
        Integer i2 = map.put("张2", 12);
        Integer i3 = map.put("张3", 13);
        Integer i4 = map.put("张4", 14);
        Integer  i = map.get("张1");
        System.out.println(i);
        // 迭代器遍历
        /*Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }*/
        // 增强for循环遍历
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
    }
}
