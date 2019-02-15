package cn.ccsunny.list;

import java.util.LinkedList;

public class Demo3_Linkedlist {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst("nico");
        list.addLast("hello");
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        LinkedList list1 = new LinkedList();
        list1.addFirst("abc");
        list1.addFirst("bcd");
        list1.addFirst("def");
        list1.addLast("end");
        System.out.println(list1);
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1.removeFirst());
        System.out.println(list1.removeLast());
        System.out.println(list1);
    }

}
