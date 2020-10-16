package CookBook;

import java.util.StringTokenizer;

/**
 * @description: 将字符串分解成词
 * @author: Daniel Deen
 * @create: 2020-08-12 00:38
 */

public class StrTokDemo {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello World of Java");

        while (st.hasMoreTokens()){
            System.out.println("Token: " + st.nextToken());
        }


        StringTokenizer st2 = new StringTokenizer("Hello, World | of | Java",", |");
        while (st2.hasMoreTokens()){
            System.out.println("Token: " + st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer("First|Second||",", |",true);
        while (st3.hasMoreTokens()){
            System.out.println("Token: " + st3.nextToken());
        }

    }

}
