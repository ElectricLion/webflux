package stream;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author:tanghui
 * @Date:2018/8/31 16:18
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        String str = "my name is 007";


        /**
         * flatMap   A下面有个集合属性B  ，它可以将集合B 中的数据都拿出来。只能拿到这层
         * flatMap和map的区别是   一个需要对数据进行处理，并返回一个固定的类型。 map 是只做类型转换，并可以返回任意类型。
         * IntStream 不是Stream 的子类需要boxed()装箱
         */
        Stream.of(str.split(" ")).map(s -> s.length()).filter(n -> n > 2).forEach(System.out::print);
        Stream.of(str.split("")).flatMap(s -> s.chars().boxed()).forEach(i -> System.out.println((char) i.intValue()));
        //并行流
        str.chars().parallel().forEach(System.out::print);
        //让其有序输出
        str.chars().parallel().forEachOrdered(System.out::print);
        //收集器
        Stream.of(str.split(" ")).collect(Collectors.toList());
        //使用reduce  来拼接字符串
        Stream.of(str.split(" ")).reduce("", (x, y) -> x + "|" + y);
        //使用reduce 来单词总长度
        Stream.of(str.split(" ")).map(s -> str.length()).reduce(0, (s1, s2) -> s1 + s2);
        Stream.of(str.split(" ")).max((s1, s2) -> s1.length() - s2.length());
        //findFirst  短路操作  只要不需流执行完，只要返回一个就终止流
        //findAny  短路操作 只要有任意一个返回就终止操作
        OptionalInt findFirst = new Random().ints().findFirst();
        System.out.println(findFirst.getAsInt());
    }
}
