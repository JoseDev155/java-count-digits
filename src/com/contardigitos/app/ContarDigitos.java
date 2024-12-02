package com.contardigitos.app;

public class ContarDigitos {
	public ContarDigitos() {
	}
	
	private int cantidadDigitos(int num) {
		int resultado;
		
		if (num < 10) {
			resultado = 1;
		}
		else {
			num /= 10;
			resultado = 1 + cantidadDigitos(num); //Recursividad
		}
		
		return resultado;
	}
	
	public void mostrarResultado(int pNum) {
		System.out.println("El numero tiene " + cantidadDigitos(pNum) + " digitos");
	}
}
