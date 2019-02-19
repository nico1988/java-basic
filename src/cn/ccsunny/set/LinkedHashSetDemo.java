package cn.ccsunny.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");
        lhs.add("d");
        int size = lhs.size();

        System.out.println(size);
        System.out.println(lhs);
    }
}
