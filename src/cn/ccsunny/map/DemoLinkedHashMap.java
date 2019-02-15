package cn.ccsunny.map;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
    public static void main(String[] args){
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("zh1", 11);
        lhm.put("zh2", 11);
        lhm.put("zh3", 11);
        lhm.put("zh4", 11);
        System.out.println(lhm);
    }
}
