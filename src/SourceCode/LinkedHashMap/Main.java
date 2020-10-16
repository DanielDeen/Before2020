package SourceCode.LinkedHashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: Some Test when reading linkedhashmap
 * @author: Daniel Deen
 * @create: 2020-05-16 00:59
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(System.getenv());
        System.out.println(System.getProperty("java.specification.version"));

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap(5);

        linkedHashMap.put("2", "5");
        linkedHashMap.put("3", "4");
        linkedHashMap.put("4", "3");
        linkedHashMap.put("2", "2");

        Stream.of(linkedHashMap).forEach(System.out::println);

        // linkedHashMap.forEach(System.out::println);

        String[] nameArray = {"hujian", "libai", "hujian", "wanganshi"};

        Stream.of(nameArray)
                .parallel()
                .distinct()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);

        for (String s : nameArray) {
            System.out.println("->" + s);
        }

    }
}
