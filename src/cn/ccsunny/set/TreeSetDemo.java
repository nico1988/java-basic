package cn.ccsunny.set;

import cn.ccsunny.bean.Person;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
//        demo();
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("nico","33"));
        System.out.println(ts);
    }

    private static void demo() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(1);
        ts.add(1);
        ts.add(1);
        ts.add(1);
        ts.add(3);
        ts.add(3);
        ts.add(3);
        ts.add(2);
        System.out.println(ts);
    }
}
