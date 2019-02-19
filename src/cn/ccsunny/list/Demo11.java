package cn.ccsunny.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo11 {
    public static void main(String[] args){
        ArrayList c1 = new ArrayList();
        ((ArrayList) c1).add("nico");
        ((ArrayList) c1).add("nico");
        ((ArrayList) c1).add("nico");
        ((ArrayList) c1).add("nico");
        ((ArrayList) c1).add("nico");
        ((ArrayList) c1).add("1111");
        ((ArrayList) c1).add("2222");
        ((ArrayList) c1).add(2222);
        ArrayList newArr = new ArrayList();
        demo1(c1, newArr);
    }

    private static void demo1(ArrayList c1, ArrayList newArr) {
        Iterator it = c1.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(!newArr.contains(obj)){
                newArr.add(obj);
            }
        }
        System.out.println(newArr);
    }
}

