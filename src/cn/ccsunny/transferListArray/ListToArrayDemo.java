package cn.ccsunny.transferListArray;

import java.util.ArrayList;

public class ListToArrayDemo {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList();
        list.add("nico");
        list.add("nico");
        list.add("nico");
        list.add("nico");
        list.add("nico");
        String[] arr = list.toArray(new String[10]);
        for (String string:arr){
            System.out.println(string);
        }
        String[] arr1 = list.toArray(new String[0]);
        for (String string:arr1){
            System.out.println(string);
        }
    }
}
