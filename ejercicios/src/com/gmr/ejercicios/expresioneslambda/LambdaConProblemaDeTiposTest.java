package com.gmr.ejercicios.expresioneslambda;

import com.gmr.ejercicios.interfacefuncional.CalculadoraInt;
import com.gmr.ejercicios.interfacefuncional.CalculadoraLong;

public class LambdaConProblemaDeTiposTest {

	public static void main(String[] args) {

		// La siguiente llamadda no compilaría, mostraría el error: The method engine(CalculadoraInt) is ambiguous for the type LambdaConProblemaDeTiposTest
		// engine((x, y) -> x + y);

		// Al tener sobrecargado el método, me obliga a indicar el tipo de parámetros para que pueda determinar qué método debe usar
		engine((long x, long y) -> x + y);
		engine((int x, int y) -> x + y);

		// Una alternativa es hacer un cast para indicar el tipo de expresión
		engine((CalculadoraLong)(x, y) -> x + y);
		engine((CalculadoraInt)(x, y) -> x + y);

		// Y otra alternativa es definir las expresiones lambda
		CalculadoraLong calLong = (x, y) -> x + y;
		CalculadoraInt calInt = (x, y) -> x + y;
		engine(calLong);
		engine(calInt);
	}

	public static void engine(CalculadoraInt calculadora) {
		System.out.println("Usa CalculadoraInt " + calculadora.calculate(5, 6));
	}

	public static void engine(CalculadoraLong calculadora) {
		System.out.println("Usa CalculadoraLong " + calculadora.calculate(5, 6));
	}

}
