package lambda;

import java.util.function.Function;

/**
 * 级联表达式和柯里化
 * 柯里化将多个参数的函数转化为只有一个参数的函数
 * 柯里化的目的：函数标准化
 *
 * @Author:tanghui
 * @Date:2018/8/31 15:51
 */
public class CurryDemo {
    public static void main(String[] args) {
        //第一参数为x,第二个参数为y.实现了柯里化。此时需要分解操作
        Function<Integer, Function<Integer, Integer>> functionFunction = x -> y -> x + y;
    }
}
