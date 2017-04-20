import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ConversionExamples {
   
    public static void main(String[] args) throws java.lang.Exception {
        // 1 Convert `List<String>` to `List<Integer>`
        List<String> l1 = Arrays.asList("1", "2", "3");
        List<Integer> r1 = l1.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("1: " + r1);

        // 2 Convert `List<String>` to `int[]`
        int[] r2 = l1.stream().mapToInt(Integer::parseInt).toArray();
        System.out.println("2: " + Arrays.toString(r2));

        // 3 Convert `String[]` to `List<Integer>`
        String[] a1 = {"4", "5", "6"};
        List<Integer> r3 = Stream.of(a1).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("3: " + r3);

        // 4 Convert `String[]` to `int[]`
        int[] r4 = Stream.of(a1).mapToInt(Integer::parseInt).toArray();
        System.out.println("4: " + Arrays.toString(r4));

        // 5 Convert `String[]` to `List<Double>`
        List<Double> r5 = Stream.of(a1).map(Double::parseDouble).collect(Collectors.toList());
        System.out.println("5: " + r5);

        // 6 (bonus) Convert `int[]` to `String[]`
        int[] a2 = {7, 8, 9};
        String[] r6 = Arrays.stream(a2).mapToObj(Integer::toString).toArray(String[]::new);
        System.out.println("6: " + Arrays.toString(r6));


        // stream to object array in Java
        Stream<String> currencies = Stream.of("INR", "USD", "GBP", "EUR", "JPY");
        Object[] objectArray = currencies.toArray();
        System.out.println("Stream to object array in Java:");
        System.out.println(Arrays.toString(objectArray));

        // via - Stream.toArray() and lambda expression
        Integer[] primes = {2, 3, 5, 7, 11};
        List<Integer> listOfInts = new ArrayList<Integer>(Arrays.asList(primes));
        Integer[] array = listOfInts.stream().toArray(size -> new Integer[size]);
        System.out.println("Stream to Integer array using lambda expression in Java:");
        System.out.println(Arrays.toString(array));

        // via - method reference
        array = listOfInts.stream().toArray(Integer[]::new);
        System.out.println("Stream to Integer array using method reference in Java:");
        System.out.println(Arrays.toString(array));

        // via arraylist
        List<Integer> list = listOfInts.stream().collect(Collectors.toCollection(ArrayList::new));
        Integer[] iArray = list.toArray(new Integer[list.size()]);
        System.out.println("Stream to Integer array via ArrayList in Java:");
        System.out.println(list);



    }
}
