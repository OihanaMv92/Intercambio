package es.Studium.Intercambio;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1, numero2, comodin;
		System.out.println("Dame el numero 1 ");
		numero1=teclado.nextInt();
		System.out.println("Dame el numero 2 ");
		numero2=teclado.nextInt();
		teclado.close();
		comodin = numero2;
		numero2 = numero1;
		numero1 = comodin;
		System.out.println("Ahora el numero 1 vale " + numero1);
		System.out.println("Ahora el numero 2 vale " + numero2);
	
	}

}
