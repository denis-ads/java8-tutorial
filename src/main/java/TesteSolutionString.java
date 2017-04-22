import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * HackerRank - Super Reduced String Enunciado no final
 * 16/04/2017
 * 
 * Entradas
 * Input:lrfkqyuqfjjfquyqkfrlkxyqvnrtyssytrnvqyxkfrzrmzlygffgylzmrzrfveulqfpdbhhbdpfqluevlqdqrrcrwddwrcrrqdql
 * Output:Empty String
 *  
 * Input:aaabccddd
 * Output:abc
 *  
 * Input:baab
 * Output:Empty String
 *  
 * @author denis
 */
public class TesteSolutionString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        if(s == null){
            return;
        }
        String[] strings = s.split("");
        
        if(strings.length == 0 || strings.length >100){
            return;
        }
        //int contador = 0;
        
        int i = 0;
        boolean reduziu = false;
        while (i <= strings.length) {
            if ((i + 1) >= strings.length) {
                if (reduziu) {
                    List<String> listas = Arrays.asList(strings).stream().filter(st -> st != null).collect(Collectors.toList());
                    //System.out.println(contador + " Intermediaria: " + String.join("", listas));
                    //System.out.println(contador + " tamanho lista: " + listas.size());
                    strings = (String[]) listas.toArray(new String[listas.size()]);
                    //System.out.println(contador + " strings lenght: " + strings.length);
                    i = 0;
                    reduziu = false;
                } else {
                    break;
                }
            }
            if(strings.length == 0){
                break;
            }
            if (strings[i].equals(strings[i + 1])) {
                strings[i] = null;
                strings[i + 1] = null;
                i = i + 2;
                reduziu = true;
            } else {
                i++;
            }
            //contador++;
        }
        List<String> listas = Arrays.asList(strings).stream().filter(st -> st != null).collect(Collectors.toList());

        if (listas.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(String.join("", listas));
        }
    }

}
/**
 * Steve has a string, , consisting of  lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after operation.

Steve wants to reduce  as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Steve out by finding and printing 's non-reducible form!

Note: If the final string is empty, print Empty String .

Input Format

A single string, .

Constraints

Output Format

If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

Sample Input 0

aaabccddd
Sample Output 0

abd
Sample Case 0

Steve can perform the following sequence of operations to get the final string:

aaabccddd → abccddd
abccddd → abddd
abddd → abd
Thus, we print abd.

Sample Input 1

baab
Sample Output 1

Empty String
Explanation 1

Steve can perform the following sequence of operations to get the final string:

baab → bb
bb → Empty String
Thus, we print Empty String.

Sample Input 2

aa
Sample Output 2

Empty String
Explanation 2

Steve can perform the following sequence of operations to get the final string:

aa → Empty String
Thus, we print Empty String.
 * 
 */
