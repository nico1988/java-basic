package cn.ccsunny.number_math;

public class MathDemo01 {
    public static void main(String[] args){
        System.out.println(Math.max(11,22));
        System.out.println(Math.min(11,22));
        System.out.println(Math.sin(Math.PI/2));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        Integer x = 3;
        System.out.println(x.doubleValue());
        System.out.println(x.floatValue());
        System.out.println(x.longValue());
        System.out.println(x.byteValue());
    }
}
