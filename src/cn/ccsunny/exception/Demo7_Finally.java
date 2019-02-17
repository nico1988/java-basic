package cn.ccsunny.exception;

public class Demo7_Finally {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
            System.out.println(222);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("catch");
            System.exit(0);
        }finally {
            System.out.println("finally");
        }
    }
}
