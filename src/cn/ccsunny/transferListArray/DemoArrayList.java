package cn.ccsunny.transferListArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList  {
    public static void main(String[] args){
//        ArrayList list = new ArrayList();
//        demo1();
        int[] arr = {11,22,33,44,55};
        List list = Arrays.asList(arr);
        System.out.println(list);
        Integer[] arr1 = {11,22,33,44,55};
        List<Integer> list1 = Arrays.asList(arr1);
        System.out.println(list1);
    }

    private static void demo1() {
        String[] arr = {"a","b","c","d"};
        List<String> list = Arrays.asList(arr); //
        System.out.println(list);
        System.out.println(list.size());
    }
}
