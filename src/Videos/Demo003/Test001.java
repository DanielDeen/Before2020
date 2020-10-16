package Videos.Demo003;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @description: Java原生接口
 * @author: Daniel Deen
 * @create: 2020-08-22 11:05
 */

public class Test001 {
    public static void saySomething(Consumer<String> consumer, String msg){
        consumer.accept(msg);

    }

    public static void main(String[] args) {
        Test001.saySomething((msg) -> System.out.println(msg + " is Accept"), "Ding");
    }

}
