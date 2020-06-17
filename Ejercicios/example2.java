package Ejercicios;
import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
		Scanner numero1 = new Scanner(System.in);
		Scanner numero2 = new Scanner(System.in);
		
		System.out.println("Ingresa una número ");
		int ingreso1 = numero1.nextInt();
		System.out.println("Ingresa otro número");
		int ingreso2 = numero2.nextInt();
		 
		if(ingreso1 >= ingreso2) {
			System.out.println("Este es el mayor " + ingreso1);
		}
		else {
			System.out.println("Este es el mayor "+ ingreso2);
		}

	}
    
}