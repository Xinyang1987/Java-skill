package Static;

import java.util.Random;

/**
 * 静态方法通常写些工具类
 * 1、静态方法可以直接访问静态成员，不能直接访问实例成员
 * 2、实例方法可以直接访问静态成员和实例成员
 * 3、实例方法中库运出现this，静态方法中不能出现this
 */
public class demo2 {
    public static void main(String[] args) {
        String code = ToolUtil.getCode();
        System.out.println(code);
    }
}

