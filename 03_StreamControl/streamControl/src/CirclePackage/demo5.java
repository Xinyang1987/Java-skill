package CirclePackage;

/**
 * 程序流控制
 */
public class demo5 {
    public static void main(String[] args) {
        print1_5();
    }

    public static void print5(){
        for(int i=0;i < 10; i++){
            if(i != 5){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void print1_5(){
        for(int i=0;i < 10; i++){
            if(i == 6){
                break;
            }
            System.out.println(i);
        }
    }
}
