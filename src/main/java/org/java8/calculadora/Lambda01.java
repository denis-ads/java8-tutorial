package org.java8.calculadora;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class Lambda01 {

	public static void main(String[] args) {
		Double multiplicar = Calculadora.calcular(40d, 2d,  (a,b) -> a*b );
		System.out.println(multiplicar);

		
		
		BigDecimal calculars = Calculadora.calculars(BigDecimal.valueOf(10), BigDecimal.valueOf(3), (a,b) -> a.add( b ));
		
		System.out.println(calculars);
		
		
	}

}
