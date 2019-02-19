package cn.ccsunny.generic;

import cn.ccsunny.bean.Person;

import java.util.ArrayList;

public class generic {
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("nico","39"));
        list.add(new Person("ruirui","24"));
        System.out.println(list);
        String a = new String();
        System.out.println("nico");

    }
}
