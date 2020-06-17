package Ejercicios;
import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
		int dia, mes, anio, suerte, suma, unidad, 
		decena, centena, unidadmillar;
		
		Scanner numero1 = new Scanner(System.in);
		Scanner numero2 = new Scanner(System.in);
		Scanner numero3 = new Scanner(System.in);
		
		System.out.println("Ingresa dia");  dia  = numero1.nextInt();
		System.out.println("Ingresa mes");  mes  = numero2.nextInt();
		System.out.println("Ingresa anio"); anio  = numero3.nextInt();
		
		suma = dia + mes + anio;
		unidadmillar = suma/1000;
		centena = suma/100 % 10;
		decena = suma/10 % 10;
		unidad = suma%10;
		suerte = unidadmillar + centena + decena + unidad;
		
		System.out.println("Tu número de la suerte es: " + suerte);
		
		

		
	

	}
    
}