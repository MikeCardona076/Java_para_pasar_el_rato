package Ejercicios;

import java.util.Scanner;
public class example1 {

	public static void main(String[] args) {
		Scanner numero1 = new Scanner(System.in);
		Scanner numero2 = new Scanner(System.in);
				
		System.out.println("Ingresa una número ");
		int ingreso1 = numero1.nextInt();
		System.out.println("Ingresa otro número");
		int ingreso2 = numero2.nextInt();
		if(ingreso1 == ingreso2) {
			System.out.println("Los números son iguales apa");
		}
		else {
			System.out.println("No son iguales apa");
		}

	}

}
