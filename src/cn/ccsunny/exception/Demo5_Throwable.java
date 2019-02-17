package cn.ccsunny.exception;

public class Demo5_Throwable {
    public static void main(String[] args){
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(111);
            System.out.println(e.toString());
            System.out.println(e);
        }
    }
}
