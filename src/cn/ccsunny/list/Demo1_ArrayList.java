package cn.ccsunny.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_ArrayList {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("nico");
        list.add("1");
        list.add("2");
        list.add("1");
//        ArrayList newList = getSingle(list);
        ArrayList newList = getS(list);
        System.out.println(newList);
    }
    public static ArrayList getSingle(ArrayList list){
        ArrayList newList = new ArrayList();
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(!newList.contains(obj)){
                newList.add(obj);
            }
        }
        return newList;
    }
    public static ArrayList getS(ArrayList list){
        ArrayList newL = new ArrayList();
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(!newL.contains(obj)){
                newL.add(obj);
            }
        }
        return newL;
    }
}
