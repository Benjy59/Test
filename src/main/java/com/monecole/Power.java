package com.monecole;

public class Power {
	
	Calculette calculette = new Calculette();
	
	public Integer carre(Integer nombre) {
		if (nombre == null){
			throw new RuntimeException("impossible");
		}
		return calculette.multiplication(nombre, nombre);
	}
	
}


