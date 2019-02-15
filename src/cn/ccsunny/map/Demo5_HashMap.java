package cn.ccsunny.map;

import cn.ccsunny.bean.Student;

import java.util.HashMap;

public class Demo5_HashMap {
    public static void main(String[] args){
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("zhangsan", "22"), "changsha");
        hm.put(new Student("zhangsan", "22"), "changsha");
        hm.put(new Student("zhangsan", "22"), "changsha");
        hm.put(new Student("zhangsan", "22"), "changsha");
        hm.put(new Student("zhangsan", "22"), "changsha");
        hm.put(new Student("zhangsan", "23"), "guangzhou");
        System.out.println(hm);
    }
}
