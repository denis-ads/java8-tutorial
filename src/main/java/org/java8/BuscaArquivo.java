package org.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Exemplo do video https://www.youtube.com/watch?v=KWGvYsfPCyg
 *Teste leitura de arquivo labda, com stream filter
 */
public class BuscaArquivo {

    public static void main(String[] args) throws IOException {
        String palavra = "Silva";
        String arquivo = "src/main/resources/nomes.txt";
        
        long count = Files.lines(Paths.get(arquivo)).filter(linha -> linha.contains(palavra)).count();
        System.out.println("Quantidade de palavras: " + count);
        
    }
}
