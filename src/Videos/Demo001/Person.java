package Videos.Demo001;

/**
 * @description: Demo 接口
 * @author: Daniel Deen
 * @create: 2020-08-22 09:32
 */

public interface Person {

    String say(String msg);

    default void play() {
        System.out.println("Play");
    }
}
