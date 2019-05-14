package lambda;

import org.springframework.util.StringUtils;

import java.util.function.*;

/**
 * @Author:tang
 *  使用lambda 进行接口方法的覆盖，并返回一个该接口的实现类对象，具体实现了该接口方法。
 * @Date:2018/8/31 15:08
 */
public class LambdaFunction {
    public static void main(String[] args) {

        //断言函数接口，只指定参数类型.用来对一个参数进行处理并返回boolean 值。
        Predicate<String> predicate = (s) -> StringUtils.isEmpty(s); //单行时，默认带return
        //基本类型的断言函数接口。代表输入的是一个int类型的，就不需要写泛型了。基本类型的函数接口每种函数接口都有提供。
        IntPredicate predicate1 = i -> i > 0;
        predicate.test("");
        //消费函数接口，只指定参数类型，只消费，不提供.参数为一个无返回。
        Consumer<String> consumer = (s -> System.out.println(s));
        consumer.accept("");
        //Function 函数接口，指定参数类型和返回值类型。 一个参数，一个返回值。 也就是一个输入一个输出
        Function<String, String> function = s -> s + "Function";
        function.apply("");
        //两个输入的参数，一个返回值
        BiFunction<String, Integer, String> biFunction = (s, d) -> String.valueOf(d).concat(s);
        biFunction.apply("1", 1);
        //提供函数接口，指定的是返回值类型。只提供不消费 无参有返回值。
        Supplier<String> supplier = () -> "Supplier 提供";
        Supplier<String> supplier1 = String::new; //调用无参构造方法时的缩写.只有在调用构造方法的时候才会将方法名放前面
        Supplier<String> supplier2 = () -> new String(); //与上面相同
        supplier1.get(); //每次getter拿出来的对象都是不同的
        //UnaryOperator 一元函数，有输入和输出，但输入和输出类型相同。所以只需要指定一个类型
        UnaryOperator<String> unaryOperator = s -> "UnaryOperator";
        unaryOperator.apply("");
        //BinaryOperator  二元函数， 两个输入参数，一个输出。两个输入和输出类型是一样的。
        BinaryOperator<String> binaryOperator = (s, d) -> s + d;
        binaryOperator.apply("", "");

    }

}
