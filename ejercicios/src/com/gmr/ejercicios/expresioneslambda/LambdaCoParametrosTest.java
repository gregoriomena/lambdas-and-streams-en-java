package com.gmr.ejercicios.expresioneslambda;

import com.gmr.ejercicios.interfacefuncional.Operaciones;

public class LambdaCoParametrosTest {

	public static void main(String[] args) {

		LambdaCoParametrosTest objeto = new LambdaCoParametrosTest();
		objeto.miMetodo((num1, num2) -> System.out.println("La suma es " + (num1 + num2)), 8, 2);
		objeto.miMetodo((num1, num2) -> System.out.println("La multiplicación es " + (num1 * num2)), 8, 2);
		objeto.miMetodo((num1, num2) -> System.out.println("La división es " + (num1 / num2)), 8, 2);
	}

	public void miMetodo(Operaciones op, int num1, int num2) {
		op.imprimeOperacion(num1, num2);
	}
}

