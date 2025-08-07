package method;

public class ReWrite {

    /**
     *
     * 重写方法
     * @param args
     * 只关心名称相同，参数列表（数量、类型、顺序不同）
     * 作用：只需要记一个方法名称，可以根据不同的传参情况做不同的事情
     */
    public static void main(String[] args) {
        print('s');
    }

    // 打印整数
    public static void print(int a) {
        System.out.println(a);
    }

    // 打印字符串
    public static void print(String a) {
        System.out.println(a);
    }
}
