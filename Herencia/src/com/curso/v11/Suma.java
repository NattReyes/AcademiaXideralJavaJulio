package com.curso.v11;

public class Suma extends OperacionAbs {
	
	public Suma(int x, int y) {
		super(x,y);
	}

	@Override
	public int ejecuta() {
		return x+y;
	}

	
}
