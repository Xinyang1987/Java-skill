package Operator;

public class demo_1 {
    public static void main(String[] args) {
        print1(10, 5);
        print2(5);
    }

    public static void print1(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    public static void print2(int a){
        System.out.println(a + "abc");
        System.out.println(a + 5);
        System.out.println("abc" + a + 'a');
        System.out.println('a' + a + "abc");
        System.out.println((char)(a + 'a'));
        System.out.println("char 5的结果为: "+ (char) 65);
    }
}
