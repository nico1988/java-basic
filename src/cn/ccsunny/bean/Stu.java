package cn.ccsunny.bean;

public class Stu {
    private String name;
    private int chinese;
    private int math;
    private int english;
    private int sum;

    public Stu() {
        super();
    }

    public Stu(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.sum = this.chinese + this.math + this.english;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum=" + sum +
                '}';
    }

    public Stu(String name) {
        this.name = name;
    }
}
