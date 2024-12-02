package com.contardigitos.app;
import java.util.Scanner;

public class IngresarNumeros {

	public static void main(String[] args) throws Exception {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Ingrese un numero entero: ");
			int numero = scan.nextInt();
			
			ContarDigitos oContar = new ContarDigitos();
			oContar.mostrarResultado(numero);
		}
	}

}
