package cn.ccsunny.map.test;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args){
        String s = "aaaaaaaaaabbbccc";
        char[] arr = s.toCharArray();
        System.out.println(arr);
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c:arr){
            System.out.println(c);
            hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
        }
        System.out.println(hm);
        for (Character key : hm.keySet()) {
            System.out.println(key + "=" + hm.get(key));
        }
     }
}
