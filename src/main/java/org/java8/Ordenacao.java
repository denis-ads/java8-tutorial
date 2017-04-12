package org.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Exemplos Caelum
 *
 */
public class Ordenacao {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("rodrigo", "paulo", "caelum");
        
        //
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.forEach(s -> System.out.println(s));

        //
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));
        palavras.sort(Comparator.comparingInt(String::length));

        //
        Function<String, Integer> function = s -> s.length();
        Function<String, Integer> function1 = String::length;

        //
        palavras.stream().filter(s -> s.length() < 6).forEach(System.out::println);

        //
        Stream<Integer> stream = palavras.stream().map(String::length);
        // melhor utilizar
        IntStream intStream = palavras.stream().mapToInt(String::length);

        //
        OptionalDouble media = palavras.stream().mapToInt(String::length).average();
        System.out.println(media.orElse(0));

        
        new Thread(() -> System.out.println("thread nova rodando")).start();
    }
}
