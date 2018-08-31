package lambda;

import java.util.stream.IntStream;

/**
 * @Author:tanghui
 * @Date:2018/8/31 14:30
 */
public class MinDemo {
    public static void main(String[] args) {
        int[] nums = {1, 23, 4, 5};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);
        //java8 函数式编程 多线程并行执行
//        int min1 = IntStream.of(nums).min().getAsInt();
        int min1 = IntStream.of(nums).parallel().min().getAsInt();
        System.out.println(min1);
    }
}
