import java.util.Arrays;
import java.util.Scanner;

/**
 * Somar arrays com java 8
 *
 */
public class Teste2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        
        for(int i=0  ; i < size ; i++ ){
            array[i] = in.nextInt();
        }
        
        System.out.println(Arrays.stream(array).sum());
        
    }
}
