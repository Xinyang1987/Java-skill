package oneDimension;

/**
 * 二维数组
 */
public class demo3 {
    public static void main(String[] args) {
        int[][] arr = getHRD(5);
        printHRD(arr);
        System.out.println("打乱顺序后的数组");
        printHRD(disorder(arr));
    }

    // 数字华容道
    public static int[][] getHRD(int n){
        int[][] arr = new int[n][n];
        int count = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = count ++;
            }
        }
        return arr;
    }

    public static void printHRD(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] disorder(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int temp = arr[i][j];
                int index = (int)(Math.random() * arr.length);
                int jndex = (int)(Math.random() * arr[i].length);
                arr[i][j] = arr[index][jndex];
                arr[index][jndex] = temp;
            }
        }
        return arr;
    }
}
