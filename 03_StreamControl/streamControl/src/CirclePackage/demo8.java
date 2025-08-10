package CirclePackage;

/**
 * 找素数
 */
public class demo8 {
    public static void main(String[] args) {
        System.out.println(getCount(200));
    }

    public static boolean isPrime(int target){
        for(int i=2; i<target; i++){
            if(target % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int getCount(int target){
        int count = 0;
        for(int i=2; i<=target; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
}
