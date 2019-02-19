package cn.ccsunny.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo102 {
    public static void main(String[] args){
        ArrayList c1 = new ArrayList();
        c1.add(1);
        c1.add(14);
        c1.add(13);
        c1.add(12);
        c1.add(12);
        ArrayList newA = new ArrayList();
        Iterator it = c1.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if(!newA.contains(obj)){
                newA.add(obj);
            }
        }
        System.out.println(newA);
    }
}
