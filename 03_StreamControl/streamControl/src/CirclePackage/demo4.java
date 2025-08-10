package CirclePackage;

import java.util.Scanner;

/**
 * 循环嵌套
 */
public class demo4 {
    public static void main(String[] args) {
        multi();
    }

    // 打印*号
    public static void printXin(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j< col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 九九乘法表
    public static void multi(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
