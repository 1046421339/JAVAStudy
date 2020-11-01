package com.jjli.day13;

/**
 * @ClassName TestSystem
 * @Description TODO
 * @Author Jason
 * @Date 2020/11/1
 **/
public class TestSystem {
    private static final int Max = 10000;

    public static void main(String[] args) {
        //获取当前时间毫秒值
        System.out.println(System.currentTimeMillis());
        //验证for循环打印数字1-9999所需要使用的时间（毫秒）
        long start = System.currentTimeMillis();
        for (int i = 0; i < Max; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒：" + (end - start));
    }
}