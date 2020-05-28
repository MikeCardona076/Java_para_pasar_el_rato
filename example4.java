import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
		Scanner numero1 = new Scanner(System.in);
		
		System.out.println("Ingresa una número ");
		int ingreso1 = numero1.nextInt();
		
		if(ingreso1 <= 4) {
			System.out.println("Insuficiente");
		}
		
		if(ingreso1 == 5 ) {
			System.out.println("Suficiente");
		}
		if(ingreso1 == 6 ) {
			System.out.println("Bien");
		}
		if(ingreso1 == 8 ) {
			System.out.println("Notable");
		}
		if(ingreso1 >= 9 ) {
			System.out.println("Sobresaliente");
		}
		
	
	}
    
}