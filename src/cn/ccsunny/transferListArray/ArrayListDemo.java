package cn.ccsunny.transferListArray;

import cn.ccsunny.bean.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<ArrayList<Person>> list = new ArrayList();
        ArrayList<Person> first = new ArrayList<>();
        first.add(new Person("nico","22"));
        first.add(new Person("nico","22"));
        first.add(new Person("nico","22"));
        first.add(new Person("nico","22"));
        ArrayList<Person> second = new ArrayList<>();
        second.add(new Person("nico","22"));
        second.add(new Person("nico","22"));
        second.add(new Person("nico","22"));
        second.add(new Person("nico","22"));
        second.add(new Person("nico","22"));
        list.add(first);
        list.add(second);
        for (ArrayList<Person> a:list){
            for (Person p:a) {
                System.out.println(p);
                System.out.println(p.getAge());
                System.out.println(p.getName());
            }
        }
    }
}
