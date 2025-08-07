package Operator;

public class demo_2 {
    public static void main(String[] args) {
        print(10, 5);
    }
    // 赋值运算符 (基本 = 和扩展赋值 += -= /= *= %=)
    // 扩展 a ?= b ======>  a = (a的类型) a ? b
    public static void print(double a, int b){
        a += b;
        System.out.println(a);
    }
}
