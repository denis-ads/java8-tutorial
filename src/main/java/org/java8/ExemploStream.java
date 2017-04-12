package org.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class ExemploStream {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Joao", 32),
                        new Pessoa("Antonio", 20),     
                        new Pessoa("Maria", 18),
                        new Pessoa("Margareth", 15),
                        new Pessoa("Angela", 30));
        
        Stream<Pessoa> pessoas = listaPessoas.stream();
        Integer somaIdades = pessoas.filter(p -> p.getNome().startsWith("A")).mapToInt(p -> p.getIdade()).sum();
        System.out.println(somaIdades);
        
        Stream<Pessoa> pessoasParallel = listaPessoas.parallelStream();
        somaIdades = pessoasParallel.filter(p -> p.getNome().startsWith("M")).mapToInt(p -> p.getIdade()).sum();
        System.out.println(somaIdades);
        
        
        Stream<Pessoa> pessoasStream = listaPessoas.stream();
        Integer maiorIdade = pessoasStream
                                 .mapToInt(p-> p.getIdade()).max(). getAsInt();
        System.out.println(maiorIdade);
        
        Stream<Pessoa> pessoasStream1 = listaPessoas.stream();
        Integer menorIdade = pessoasStream1
                                .mapToInt(p -> p.getIdade()).min().getAsInt();
        System.out.println(menorIdade);
        
        
        
        
        
        Stream<Pessoa> streamPessoas = listaPessoas.stream();
        
        IntSummaryStatistics intSummStat  = streamPessoas.filter(p -> p.getNome().startsWith("A"))
                         .mapToInt(p -> p.getIdade()).summaryStatistics();
                 
        System.out.println(intSummStat.getSum());
        System.out.println(intSummStat.getMax());
        System.out.println(intSummStat.getMin());
        
        
    }
}
