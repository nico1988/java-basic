package cn.ccsunny.list;

import java.util.LinkedList;

public class Stack {
    private LinkedList list = new LinkedList();
    /**
     * 模拟进栈
     */
    public void in(Object obj){
        list.addLast(obj);
    }
    /**
     * 模拟出栈
     */
    public Object out(){
        return list.removeLast();
    }
    public int size(){
        return list.size();
    }
    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
