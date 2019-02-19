package cn.ccsunny.transferListArray;

import cn.ccsunny.bean.Person;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args){
        ArrayList<ArrayList<Person>> list = new ArrayList();
        ArrayList<Person> first = new ArrayList();
        first.add(new Person("nico", "33"));
        first.add(new Person("nico", "33"));
        first.add(new Person("nico", "33"));
        first.add(new Person("nico", "33"));
        first.add(new Person("nico", "33"));
        ArrayList<Person> second = new ArrayList<Person>();
        second.add(new Person("nico","22"));
        second.add(new Person("nico","22"));
        second.add(new Person("nico","22"));
        second.add(new Person("nico","22"));
        list.add(first);
        list.add(second);
        System.out.println(list);
    }
}
