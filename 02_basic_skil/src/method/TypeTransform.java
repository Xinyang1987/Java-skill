package method;

public class TypeTransform {

    /**
     *
     * @param args
     * 1、在表达式中，小范围的数据类型会自动转换成大范围的数据类型
     * 2、表达式的最终数据类型为表达式中所有数据类型中范围最大的数据类型
     * 3、byte\short\char 在表达式中，会自动转换成int
     */
    public static void main(String[] args) {
        printaaa((byte)1,(byte)2);
    }

    public static void printaaa(byte a, byte b){
        System.out.println(a+b);
    }
}
