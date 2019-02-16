package cn.ccsunny.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Collections {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(Collections.max(list ));
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.min(list));
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"a"));
        System.out.println(Collections.binarySearch(list,"b"));
        System.out.println(Collections.binarySearch(list,"g"));
    }
}
