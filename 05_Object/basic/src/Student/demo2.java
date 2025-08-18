package Student;

public class demo2 {
    public static void main(String[] args) {
        Student bob = new Student();
        bob.name = "Bob";
        bob.math = 80;
        bob.chinese = 90;

        Student alice = new Student();
        alice.name = "Alice";
        alice.math = 90;
        alice.chinese = 80;

        bob.print();
        alice.print();
    }
}
