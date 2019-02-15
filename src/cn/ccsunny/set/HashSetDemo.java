package cn.ccsunny.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        String Str = new String("www.runoob.com");
        System.out.println("字符串的哈希码为 :" + Str.hashCode() );
        HashSet<String> hs = new HashSet<>();
        hs.add("d");
        hs.add("b");
        hs.add("b");
        hs.add("c");
        hs.add("a");
        System.out.println(hs);
//        boolean b = hs.add("c");
//        System.out.println(hs);
//        System.out.println(hs);
        for (String string:hs) {
            System.out.println(string);
        }
    }
}
