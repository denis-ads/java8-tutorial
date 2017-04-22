package org.java8.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Colecoes {

	public static void main(String[] args) {
		List<Pessoa> pessoas = umMetodoQueRetornaPessoas();
		
		Stream<Pessoa> streamPessoa = pessoas.stream();
		Long count = pessoas.stream().filter(pessoa -> pessoa.getSexo().equals("F")).count();
		System.out.println(count);
		
		
		
		List<String> nomes = pessoas.stream()
		        .filter(p -> p.getSexo().equals("F"))
		        .map(p -> p.getNome().toUpperCase())
		        .collect(Collectors.toList());
		
		System.out.println(nomes);
		
	}

	private static List<Pessoa> umMetodoQueRetornaPessoas() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Denis",10 ,"M"));
		pessoas.add(new Pessoa("Denis2",140 ,"M"));
		pessoas.add(new Pessoa("Denis3",40 ,"M"));
		pessoas.add(new Pessoa("Deni4s",50 ,"F"));
		pessoas.add(new Pessoa("Denis5",20 ,"F"));
		pessoas.add(new Pessoa("Deni6s",30 ,"F"));
		pessoas.add(new Pessoa("Deni7s",20 ,"M"));
		pessoas.add(new Pessoa("Deni8s",40 ,"F"));
		
		return pessoas;
	}
	
}
