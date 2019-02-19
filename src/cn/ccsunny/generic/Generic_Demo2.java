package cn.ccsunny.generic;

import cn.ccsunny.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_Demo2 {
    public static void main(String[] args){
//        demo1();
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("nico","22"));
        list.add(new Person("nico","22"));
        list.add(new Person("nico","22"));
        list.add(new Person("nico","22"));
        list.add(new Person("nico","22"));
        list.add(new Person("nico","22"));

        Iterator<Person> it  = list.iterator();
        while(it.hasNext()){
            Person p = it.next();
            System.out.println(it.next());
            System.out.println(p.getName() + "------------" + p.getAge());
        }
    }

    private static void demo1() {
        String s = "";
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ArrayList<String> list1 = new ArrayList<>();
        list.add("nico");
        list.add("nico");
        list.add("nico");
        list.add("nico");
        list.add("nico");
        Iterator<String> it1 = list.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
