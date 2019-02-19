package cn.ccsunny.bean;

public class Toll<Q> {
    private Q q;

    public Q getObj() {
        return q;
    }

    public void setObj(Q q) {
        this.q = q;
    }

    public void show(Q q) {
        System.out.println(q);
    }

    public<T> void say(T q) {
        System.out.println(q);
    }

    public static<W> void print(W w){
        System.out.println(w);
    }
}
