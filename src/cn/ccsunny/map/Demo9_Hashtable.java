package cn.ccsunny.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo9_Hashtable {
    /**
     * hashmap 和 hashtable的区别
     * @param args
     */
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(null, null);
        System.out.println(hm);
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put(null, null);
        System.out.println(ht);
    }
}
