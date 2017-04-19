import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TesteSolution {
    
    
    
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N == 0) {
            return;
        }
        Map<Integer, List<String>> composicoes = new HashMap<Integer, List<String>>(N);

        int contador = 1;
        while (contador <= N) {
            if (!in.hasNext()) {
                return;
            }
            String composicao = in.next();
            composicoes.put(contador, Arrays.asList(composicao.split("")));

            contador++;
        }

        
        contador = 1;
        int resultado = 1;
        int resultaodFinal =0;


        List<String> list = composicoes.get(contador);
        contador++;
        for (String letra : list) {
            System.out.println("letra " + contador + "-" + letra);
            while (contador <= composicoes.size()) {
                if (contemValor(letra, composicoes.get(contador))) {
                    resultado ++;
                }
                contador++;
            }
            if(resultado == N){
              resultaodFinal ++;  
            }
            contador =2;
            resultado = 1;
        }
        System.out.println(resultaodFinal);
    }

    private static boolean contemValor(String letra, List<String> listas) {
        return listas.contains(letra);
    }
}
