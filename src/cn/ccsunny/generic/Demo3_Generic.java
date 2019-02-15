package cn.ccsunny.generic;

import cn.ccsunny.bean.Student;
import cn.ccsunny.bean.Toll;
import cn.ccsunny.bean.Worker;


public class Demo3_Generic {
    public static void main(String[] args){
        Toll<Student> t = new Toll();
        t.setObj(new Student("nico","29"));
        System.out.println(t);
        Toll<String> s = new Toll<>();
        s.show("nico");
        s.say(new String("this is a generic function"));
    }
}
