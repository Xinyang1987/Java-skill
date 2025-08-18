package Structor;

/**
 * 1、类默认自带一个无参构造器
 * 2、如果定义了有参构造器，那么类就没有无参构造器
 */
public class Student {
    String name = "null";
    public Student(){
        System.out.println("调用无参构造器");
    }
    public  Student(String name){
        System.out.println("调用有参构造器");
        this.name = name;
    }
}
