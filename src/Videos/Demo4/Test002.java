package Videos.Demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: 并行流
 * @author: Daniel Deen
 * @create: 2020-08-22 16:30
 */

public class Test002 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            Double num = Math.random()*10;
            list.add(num);
        }

        Long start = System.currentTimeMillis();
        list.stream().sorted().collect(Collectors.toList());
        Long end = System.currentTimeMillis();
        System.out.println(end - start);

        Long start1 = System.currentTimeMillis();
        list.parallelStream().sorted().collect(Collectors.toList());
        Long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);



    }
}
