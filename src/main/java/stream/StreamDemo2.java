package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @Author:tanghui
 * @Date:2018/8/31 16:09
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //流的创建
        Stream.of(list);
        list.stream();
        list.parallelStream();
        //数组创建
        Arrays.stream(new int[]{2, 3, 5});
        //使用random创建一个无限流
        new Random().ints().limit(10);
        //自己产生流
        Random random = new Random();
        Stream.generate(() -> random.nextInt()).limit(20);
    }
}
