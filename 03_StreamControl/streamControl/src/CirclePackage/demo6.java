package CirclePackage;

import java.util.Scanner;

/**
 * 简易计算器
 */
public class demo6 {
    public static void main(String[] args) {
        while (true){
            caculator();
        }
    }

    public static void caculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入操作数一");
        double oper1 = sc.nextDouble();
        System.out.println("请输入操作数二");
        double oper2 = sc.nextDouble();
        System.out.println("请输入运算符");
        String str = sc.next();

        switch ( str){
            case "+":
                System.out.println(oper1 + oper2);
                break;
            case "-":
                System.out.println(oper1 - oper2);
                break;
            case "*":
                System.out.println(oper1 * oper2);
                break;
            case "/":
                System.out.println(oper1 / oper2);
                break;
            default:
                System.out.println("请输入正确的运算符");
                break;
        }
    }
}
