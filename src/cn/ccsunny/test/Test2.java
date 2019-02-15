package cn.ccsunny.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        HashSet<Character> hs = new HashSet<>();
        String line = sc.nextLine();
        char[] arr =  line.toCharArray();
        for(char c : arr){
            hs.add(c);
        }
        System.out.println(hs);
        for (char c:hs){
            System.out.println(c);
        }
    }
}
