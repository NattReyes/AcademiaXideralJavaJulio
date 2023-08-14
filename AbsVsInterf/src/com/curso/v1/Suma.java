package com.curso.v1;

public class Suma extends Object implements Operacion, OperacionImaginarios{
	
	int x;
	int y;

	public Suma(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return x+y;
	}

	@Override
	public int ejecutaImaginarios() {
		return 9999;
	}

}
