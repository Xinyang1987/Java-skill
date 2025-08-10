package CirclePackage;

import java.util.Scanner;

/**
 * 猜随机数
 */
public class demo7 {

    public static void main(String[] args) {
        game();
    }

    public static void game(){
        int number = (int)(Math.random() * 100)  + 1;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字：");
            int user_number = sc.nextInt();

            if(user_number > number){
                System.out.println("数字太大");
            }else if(user_number < number){
                System.out.println("数字太小");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
