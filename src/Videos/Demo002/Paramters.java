package Videos.Demo002;

import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @description: Lambda变量
 * @author: Daniel Deen
 * @create: 2020-08-22 10:20
 */

public class Paramters {
    static int outerStaticNum;
    int outerNum;

    public static void main(String[] args) {
        Convert c1 = (num) -> {
            outerStaticNum = 123;
            System.out.println(outerStaticNum + Integer.parseInt(num));
        };
        c1.convert("123");
    }
}
