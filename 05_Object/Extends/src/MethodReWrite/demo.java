package MethodReWrite;

/**
 * 子类可以重写父类的方法
 * 1、父类中的私有、静态方法不能重写
 * 2、子类重写父类方法时，访问权限必须>=父类方法(public > protected > 缺省)
 */
public class demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shot();

        Student student = new Student("Tom", 18, "Male");
        System.out.println(student);
    }
}

class Animal{
    public void shot(){
        System.out.println("直接叫");
    }
}

class Cat extends Animal{
    @Override // 标志注解，要求方法名和形参列表一致
    public void shot(){
        System.out.println("喵喵喵");
    }
}

class Student{
    private String name;
    private int age;
    private String sex;

    public Student(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString(){
        return "姓名：" + this.name + "，年龄：" + this.age + "，性别：" + this.sex;
    }
}