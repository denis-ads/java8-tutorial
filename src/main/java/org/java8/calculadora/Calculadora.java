package org.java8.calculadora;

import java.util.function.BinaryOperator;

public class Calculadora {

	public static Double calcular(Double d1, Double d2, OperadorDouble op){
		return op.calcular(d1, d2);
	}
	
	
	public static <T> T calculars(T t1, T t2, BinaryOperator<T> funcao){
		return funcao.apply(t1,t2);
		
	}
	
}
