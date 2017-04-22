
/**
 * Exercicio busca binaria.
 * 
 * @author denis
 * http://www.java2novice.com/java-search-algorithms/binary-search-recursion/
 *
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {1, 3, 4, 6, 7, 8, 10, 23, 28, 39, 40, 45, 49, 50, 51, 53, 54, 58, 59, 60};
        int key = 54;
        int inicio = 0;
        int fim = array.length;
        int posicaoKey = buscaBinaria(array, inicio, fim, key);
        System.out.println("Posicao da busca: " + posicaoKey);
    }

    private static int buscaBinaria(int[] array, int inicio, int fim, int key) {

        if (inicio < fim) {
            int meio = inicio + (fim - inicio) / 2;
            
            if (key < array[meio]) {
                return buscaBinaria(array, inicio, meio, key);
            
            } else if (key > array[meio]) {
                return buscaBinaria(array, meio+1, fim, key);
            } else {
                return meio;
            }
        }
        return -(inicio + 1);
    }
}
