package cn.ccsunny.map;

import cn.ccsunny.bean.Student;

import java.util.HashMap;

public class Demo8_HashMapHashMap {
    public static void main(String[] args){
        HashMap<Student, String> hm88 = new HashMap<>();
        hm88.put(new Student("张三","23"),"beijing");
        hm88.put(new Student("lisi","33"),"shanghai");
        hm88.put(new Student("wangwu","13"),"guangzhou");
        hm88.put(new Student("zhaoliu","43"),"tianjing");
        System.out.println(hm88);
        HashMap<Student, String> hm99 = new HashMap<>();
        hm99.put(new Student("张三","23"),"beijing");
        hm99.put(new Student("lisi","33"),"shanghai");
        hm99.put(new Student("wangwu","13"),"guangzhou");
        hm99.put(new Student("zhaoliu","43"),"tianjing");
        System.out.println(hm99);
        HashMap<HashMap<Student, String>,String> hm = new HashMap();
        hm.put(hm88,"88期基础班");
        hm.put(hm99,"99期基础班");
        System.out.println(hm);
        for (HashMap<Student, String> h : hm.keySet()) {
            String value = hm.get(h);
            for (Student key:h.keySet()){
                String value2 = h.get(key);
                System.out.println(key + "=" + value2 + "=" + value);
            }
        }
    }
}
