import java.util.Scanner;

public class HealthCaculator {
    public static void main(String[] args) {
        Input_And_Caculator();
    }

    public static void Input_And_Caculator(){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的身高：");
        double height = sc.nextDouble();

        System.out.println("请输入你的体重：");
        double weight = sc.nextDouble();

        System.out.println("请输入您的性别：");
        String sex = sc.next();

        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        double bmi = BMI(height, weight);
        System.out.println("BMI指数为：" + bmi);

        double bmr = BMR(height, weight, sex, age);
        System.out.println("基础代谢率：" + bmr);
    }

    public static double BMI(double height, double weight){
        double bmi = weight / (height * height);
        return bmi;
    }

    public static double BMR(double height, double weight, String sex, int age){
        double bmr;
        if (sex.equals("男")){
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }
        return bmr;
    }
}
