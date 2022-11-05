package com.gmr.ejercicios.expresioneslambda;

import com.gmr.ejercicios.interfacefuncional.CalculadoraLong;

public class LambdaComoTipoDeMetodoTest {

	public static void main(String[] args) {
		System.out.println(create().calculate(6, 3));
	}

	private static CalculadoraLong create() {
		return (x, y) -> x / y;
	}
}
