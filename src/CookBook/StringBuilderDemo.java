package CookBook;

/**
 * @description: Stringbuilder使用Demo
 * @author: Daniel Deen
 * @create: 2020-08-19 00:45
 */

public class StringBuilderDemo {

    public static void main(String[] args) {
        String s1 = "Hello" + ", " + "World";
        System.out.println(s1);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(", ");
        sb2.append("world");

        String s2 = sb2.toString();
        System.out.println(s2);

        System.out.println(new StringBuilder().append("hi").append(", ").append("World"));
    }
}
