package cn.ccsunny.generic;

import cn.ccsunny.bean.Person;
import cn.ccsunny.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo5_Generic {
    public static void main(String[] args){
//        List<?> list = new ArrayList<String>(); // 当右边泛型不确定的时候 左边可以指定为? 可以用问号
        ArrayList<Person> list1 = new ArrayList<Person>();
        list1.add(new Person("nico","29"));
        list1.add(new Person("nico","29"));
        list1.add(new Person("nico","29"));
        list1.add(new Person("nico","29"));
        list1.add(new Person("nico","29"));
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("ruirui","24"));
        list1.addAll(list2);
        System.out.println(list1);
    }

}
