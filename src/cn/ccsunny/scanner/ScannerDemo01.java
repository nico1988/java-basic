package cn.ccsunny.scanner;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        System.out.println(a);
        String i = scan.next();
        System.out.println("您输入的是" + i);
    }
}
