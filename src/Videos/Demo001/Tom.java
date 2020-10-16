package Videos.Demo001;

/**
 * @description: 实现Person类
 * @author: Daniel Deen
 * @create: 2020-08-22 09:45
 */

public class Tom {
    public static void main(String[] args) {
        Person tom = (msg) -> {
            return "hello " + msg;
        };

        System.out.println(tom.say("wold"));
    }
}
