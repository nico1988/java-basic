package cn.ccsunny.inte;

public class MammalInt implements Animal {
    @Override
    public void eat() {
        System.out.println("i'm eating");
    }

    @Override
    public void traval() {
        System.out.println("i'm travaling");
    }

    public static void main(String[] args){
        new MammalInt().eat();
        new MammalInt().traval();
    }
}
