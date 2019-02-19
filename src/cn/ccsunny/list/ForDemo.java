package cn.ccsunny.list;

import cn.ccsunny.bean.Person;

import java.util.ArrayList;

public class ForDemo {
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("nico","39"));
        list.add(new Person("nico","39"));
        list.add(new Person("nico","39"));
        list.add(new Person("nico","39"));
        list.add(new Person("nico","39"));
        for(Person person : list){
            System.out.println(person);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }
}
