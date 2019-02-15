package cn.ccsunny.set;

import cn.ccsunny.bean.Person;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args){
        HashSet<Person> hs = new HashSet<>();
        // Hashset不能保证自定义的对象唯一 因为每个对象都有自己的地址值
        // 重写equals方法可以解决这个问题
        hs.add(new Person("nico","39"));
        hs.add(new Person("nico","39"));
        hs.add(new Person("nico","39"));
        hs.add(new Person("nico","39"));
        hs.add(new Person("nico","39"));
        hs.add(new Person("nico","39"));
        hs.add(new Person("nico","39"));
        hs.add(new Person("nico","3"));
        System.out.println(hs);
    }
}
