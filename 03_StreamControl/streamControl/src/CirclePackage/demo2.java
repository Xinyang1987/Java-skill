package CirclePackage;

/**
 * while 循环s
 * 不知道循环几次使用while
 * 知道循环次数使用for
 */

public class demo2 {
    public static void main(String[] args) {
        testWhile(1000, 0.05);
        testwhile2(8848860, 0.1);
    }

    public static void testWhile(double money, double rate){
        double now = money;
        int year = 0;
        while(now < 2 * money){
            now = now * (1 + rate);
            year++;
        }
        System.out.println("第" + year + "年后，金额变为" + now);
    }

    public static void testwhile2(double height, double start){
        int count = 0;
        while(start <= height){
            start = start * 2;
            count++;
        }
        System.out.println("第" + count + "次，高度变为" + start);
    }
}
