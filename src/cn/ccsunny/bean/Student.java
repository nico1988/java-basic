package cn.ccsunny.bean;

/**
 * Person里边重写了equals和hashCode方法
 */
public class Student extends Person implements Comparable<Student>{
    public Student() {
    }

    public Student(String name, String age) {
        super(name, age);
    }

    @Override
    public int compareTo(Student o) {
        int num =  0;
        return num == 0 ? this.name.compareTo(o.name):num;
    }
}
