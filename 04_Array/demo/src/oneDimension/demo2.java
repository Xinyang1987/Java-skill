package oneDimension;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        getAverage(3);
    }

    public static void getAverage(int num){
        // 动态初始化数组
        double[] arr = new double[num];
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < num; i++){
            System.out.println("请输入第"+(i+1)+"个学生的分数");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        double avg = sum / num;
        System.out.println("平均分为：" + avg);
    }
}
