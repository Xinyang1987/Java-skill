package Demo;

/**
 * 继承的注意事项
 * 1、不支持多继承，但支持多层继承
 * 2、Object 类是所有类的根类(父类、基类、超类)
 * 3、继承后子类访问成员的特点，依照就近原则
 * 4、子类和父类中方法重名，如果需要调用父类方法（变量），需要用super.方法名()
 */
public class demo {
    public static void main(String[] args) {
        Teacher bob = new Teacher("Bob", 18, "Male", "Math");
        System.out.println(bob.getName());
        System.out.println(bob.getAge());
        System.out.println(bob.getSex());
        System.out.println(bob.getCourse());
    }
}
