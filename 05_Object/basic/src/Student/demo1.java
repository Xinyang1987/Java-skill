package Student;

public class demo1 {
    public static void main(String[] args) {
        Student bob = new Student();
        bob.name = "Bob";
        bob.math = 80;
        bob.chinese = 90;

        Student alice = new Student();
        alice.name = "Alice";
        alice.math = 90;
        alice.chinese = 80;

        // 对对象的处理可以封装到类中
        System.out.println(bob.name + "的数学成绩是" + bob.math + "，语文成绩是"
                + bob.chinese + "，平均成绩是" + (bob.math + bob.chinese) / 2);

        System.out.println(alice.name + "的数学成绩是" + alice.math + "，语文成绩是"
                + alice.chinese + "，平均成绩是" + (alice.math + alice.chinese) / 2);
    }
}
