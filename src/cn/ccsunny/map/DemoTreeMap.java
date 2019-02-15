package cn.ccsunny.map;

import cn.ccsunny.bean.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args){
//        demo1();
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        tm.put(new Student("1nico1","22"),"22");
        tm.put(new Student("2nico2","24"),"22");
        tm.put(new Student("4nico3","66"),"22");
        tm.put(new Student("3nico4","14"),"22");
        System.out.println(tm);
    }

    private static void demo1() {
        TreeMap<Student, String> tm = new TreeMap<Student, String>();
        tm.put(new Student("nico1","22"),"22");
        tm.put(new Student("nico2","24"),"22");
        tm.put(new Student("nico3","66"),"22");
        tm.put(new Student("nico4","14"),"22");
        System.out.println(tm);
    }
}
