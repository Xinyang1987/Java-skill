package SwitchPackage;

import java.util.Scanner;

public class demo {

    /**
     * 值匹配用 switch，内部使用树形树结构，效率高
     * 区间匹配用if
     *
     * 1\switch表达式不支持 double\float\long\
     * 2\case 值不能重复，且值必须为字面量，不能是变量
     * 3\正常使用，break，否则会出现穿透
     *
     * @param args
     */
    public static void main(String[] args) {
        judge();
    }
    public static void judge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的性别：");
        String sex = sc.next();

        switch (sex){
            case "男":
                System.out.println("你是一个男性");
                break;
            case "女":
                System.out.println("你是一个女性");
                break;
            default:
                System.out.println("请输入正确的性别");
                break;
        }
    }
}
