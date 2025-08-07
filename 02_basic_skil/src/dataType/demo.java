package dataType;

public class demo {
    public static void main(String[] args) {
        dataType();
    }
    public static void dataType() {
        // 基本数据类型
        // 整型 占用字节分别为 1 2 4 8
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;

        // 浮点数 占用字节分别为 4 8
        float e = 3.4028235E38f;
        double f = 1.7976931348623157E308;

        // 布尔型 占用字节为 1
        boolean g = true;
        boolean h = false;

        // 字符型 占用字节为 2
        char i = 'a';
        char j = '中';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);

    }
}
