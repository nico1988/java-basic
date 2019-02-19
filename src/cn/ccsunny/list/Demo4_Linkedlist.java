package cn.ccsunny.list;

import java.util.LinkedList;

public class Demo4_Linkedlist {
    public static void main(String[] args){
//        LinkedList list = new LinkedList();
        Stack s = new Stack();
        s.in("a");
        s.in("a");
        s.in("a");
        s.in("a");
        s.in("a");
        s.in("a");
        while(!s.isEmpty()){
            System.out.println(s.out());
        }
        System.out.println("弹栈后的大小: " + s.size());
    }
}
