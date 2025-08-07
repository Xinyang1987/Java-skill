package method;

public class demo {
    public static void main(String[] args) {
        System.out.println(getMax(1, 2));
    }
    // 方法修饰符 返回值类型 方法名(参数列表){}
    public static int getMax(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
}
