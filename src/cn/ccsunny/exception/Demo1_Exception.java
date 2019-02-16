package cn.ccsunny.exception;

public class Demo1_Exception {
    public static void main(String[] args){
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
            System.out.println(19/0);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Exception thrown  :" + e);
        }catch (ArithmeticException t){
            System.out.println(t);
            System.out.println(1);
        }

        System.out.println("Out of the block");
    }
}
