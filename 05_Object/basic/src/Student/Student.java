package Student;

public class Student {
    String name;
    double math;
    double chinese;

    public void print() {
        System.out.println("姓名：" + name);
        System.out.println("数学：" + math);
        System.out.println("语文：" + chinese);
        System.out.println("平均：" + (math + chinese) / 2);
    }
}
