package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Suma suma = new Suma();
		
		int resultado = suma.calculaSuma(5, 8);
		
		System.out.println(resultado);
	}

}
