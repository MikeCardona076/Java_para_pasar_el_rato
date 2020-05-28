import java.util.Scanner;
public class example3 {

    public static void main(String[] args) {
		Scanner numero1 = new Scanner(System.in);
		
		System.out.println("Ingresa una número ");
		int ingreso1 = numero1.nextInt();
		
		while(ingreso1!=0){
			
			System.out.println(ingreso1);
			ingreso1 = ingreso1 / 10;
		}
		
	}
}