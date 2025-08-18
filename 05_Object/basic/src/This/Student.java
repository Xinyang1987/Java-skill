package This;

/**
 * this就是一个变量，代指当前对象，主要用于接近变量名冲突的问题
 */
public class Student {
    String name;
    int age;
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
