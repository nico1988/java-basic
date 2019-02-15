package cn.ccsunny.test;

import cn.ccsunny.bean.Stu;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生:");
        TreeSet<Stu> ts = new TreeSet<>(new Comparator<Stu>() {
            @Override
            public int compare(Stu s1, Stu s2) {
                int num = s2.getSum()-s1.getSum();
                return num==0? 1 : 0;
            }
        });
        while (ts.size() < 5) {
            String line = sc.nextLine();
            String[] arr = line.split(",");
            int chinese = Integer.parseInt(arr[1]);
            int math = Integer.parseInt(arr[2]);
            int english = Integer.parseInt(arr[3]);
            ts.add(new Stu(arr[0], chinese, math, english));
        }
        System.out.println("排序后的学生信息");
        for (Stu s : ts) {
            System.out.println(s);
        }
    }
}
