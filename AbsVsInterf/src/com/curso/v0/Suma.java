package com.curso.v0;

public class Suma extends Operacion{

	public Suma(int x, int y) {
		super(x, y);
	}

	@Override
	int ejecuta() {
		return x+y;
	}

}
