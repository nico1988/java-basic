package cn.ccsunny.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        getSingle(list);
        System.out.println(list);
        for (String ls:list){
            System.out.println(ls);
        }
    }
    public static void getSingle(List<String> list){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);
        list.clear();
        list.addAll(lhs);
    }
}
