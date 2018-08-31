package stream;

import java.util.stream.IntStream;

/**
 * Stream  是一个的迭代器，不是一个数据结构，不是集合，不会保存数据。
 * Stream 目的是 高效的进行数据的处理，流水线式的处理。
 *
 * @Author:tanghui
 * @Date:2018/8/31 16:00
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int sum = 0;
        //外部迭代
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println(sum);
        }
        //内部迭代
        /*
         map中间操作 有返回流的操作，为中间操作。
         sum 终止操作
         惰性求值就是终止操作没有被执行的时候中间操作将不会被执行。
         */
        sum = IntStream.of(nums).map(i -> i * 2).sum();
        System.out.println(sum);
    }
}
