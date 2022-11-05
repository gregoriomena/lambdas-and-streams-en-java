package com.gmr.ejercicios.expresioneslambda;

import com.gmr.ejercicios.interfacefuncional.Calculadora;

public class LambdaCoDevolucionTest {

	public static void main(String[] args) {

		engine((x, y) -> x + y);
		engine((x, y) -> x * y);
		engine((x, y) -> x / y);
	}

	public static void engine(Calculadora calculadora) {
		int x = 2;
		int y = 4;
		int resultado = calculadora.calcular(x, y);
		System.out.println("El resultado es " + resultado);
	}
}

