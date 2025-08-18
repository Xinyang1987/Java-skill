package Constructure;

/**
 * 子类所有构造器都会(且必须)调用父类的构造器
 * 1、子类全部构造器第一行默认有一个super()
 * 2、如果父类写了有参数的构造器，则子类必须显示调用父类的有参构造器
 * 3、this调用兄弟构造器，this和super只能出现一次，且都在第一行
 */
public class demo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("------------------");

        Student bob = new Student("Tom", 18);
        System.out.println(bob.getSex());
    }
}

class Zi extends Fu{
    public Zi(){
        // 默认有一个 super();
        System.out.println("子类无参构造器");
    }
}

class Fu{
//    public Fu(int a){
//        System.out.println("父类无参构造器");
//    }
}

class Student{
    private String name;
    private int age;
    private String sex;

    public Student(){}

    public Student(String name, int age){
        this(name, age, "Male");
    }

    public Student(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }
}