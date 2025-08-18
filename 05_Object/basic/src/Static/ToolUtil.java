package Static;

import java.util.Random;

public class ToolUtil {
    private static int index = 4;

    private ToolUtil(){

    }

    public static String getCode(){
        Random random = new Random();
        String code = "";
        for (int i = 0; i < index; i++) {
            int num = random.nextInt(10);
            code += (char)num;
        }
        return code;
    }
}