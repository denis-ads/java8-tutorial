import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Exercicio BubbleSort.
 * 
 * @author denis 
 * http://www.java2novice.com/java-sorting-algorithms/bubble-sort/
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4, 2, 9, 6, 23, 12, 34, 0, 1, 5, 4, 12, 55, 88, 77, 99, 76};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int sort(int[] array) {
        int tamanho = array.length;
        int temporario;

        for (int m = tamanho; m >= 0; m--) {
            for (int i = 0; i < tamanho - 1; i++) {
                temporario = i + 1;
                if (array[i] > array[temporario]) {
                    swapNumbers(i, temporario, array);
                }
            }

            System.out.println(Arrays.toString(array));
            // Arrays.asList(array).stream().forEach(System.out::println);
            // IntStream.of(array).forEach(System.out::println);
            // Arrays.stream(array).forEach(num -> System.out.println(num));
        }

        return 0;
    }

    private static void swapNumbers(int i, int temporario, int[] array) {
        int temp = array[i];
        array[i] = array[temporario];
        array[temporario] = temp;
    }
}
