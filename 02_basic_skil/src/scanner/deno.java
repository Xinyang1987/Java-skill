package scanner;

import java.util.Scanner;

public class deno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的名字：");
        String name = sc.next();

        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("您的名字为:" + name);
        System.out.println("您的年龄为" +  age);
    }
}
