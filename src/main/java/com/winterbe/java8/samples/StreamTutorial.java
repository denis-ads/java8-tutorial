package com.winterbe.java8.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 *
 */
public class StreamTutorial {

    public static void main(String[] args) {
        exemplo1();

        exemplo2();

        exemplo3();
        
        exemplo4();

        exemplo5();

        exemplo6();
        
        exemplo7();
        
        exemplo8();
    }

    private static void exemplo1() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }

    private static void exemplo2() {
        Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println); // a1
    }

    private static void exemplo3() {
        Stream.of("a1", "a2", "a3").findFirst().ifPresent(System.out::println); // a1
    }

    private static void exemplo4() {
        IntStream.range(1, 4).forEach(System.out::println);
    }

    private static void exemplo5() {
        Arrays.stream(new int[] {1, 2, 3}).map(n -> 2 * n + 1).average().ifPresent(System.out::println); // 5.0
    }

    private static void exemplo6() {
        Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println); // 3
    }

    private static void exemplo7() {
        IntStream.range(1, 4).mapToObj(i -> "a" + i).forEach(System.out::println);
    }

    private static void exemplo8() {
        Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).mapToObj(i -> "a" + i).forEach(System.out::println);// a1 a2 a3
    }

}
