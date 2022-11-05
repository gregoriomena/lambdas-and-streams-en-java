package com.gmr.ejercicios;

public class LambdaSinParametrosTest {

	public static void main(String[] args) {
		
		FuncionSinParametrosTest ft = () -> System.out.println("Hola Mundo!");
		
		LambdaSinParametrosTest objeto = new LambdaSinParametrosTest();
		objeto.miMetodo(ft);
		
	}
	
	public void miMetodo(FuncionSinParametrosTest parametro) {
		parametro.saludar();
	}
}

