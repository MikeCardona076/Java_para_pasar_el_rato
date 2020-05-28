import java.util.Scanner;
public class example6 {
    @SuppressWarnings("null")
	public static void main(String[] args) {
	
		int estatura_media, edad_media = 0;
		int x = 1;
		int i =0;
		int sum = 0; 
		int sum_edad = 0;
		int [] edad_adulta = new int [5]; 
		int [] estatura_mayor = new int [5];
		
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		for(;x <=5; x++) {
			System.out.println("Ingresa edad"); 
			edad_media = entrada.nextInt();
			if(edad_media >= 18) {
				edad_adulta[x] = edad_media;
			}
			sum_edad = sum_edad + edad_media;
			
		}
		System.out.println("La edad media es: " + sum_edad /5 );
		System.out.println("Los alumnos mayores son: " + edad_adulta.length);
		
		//EVALUAMOS LA ESTATURA
		for(;i <=5; i++) {
			System.out.println("Ingresa estatura"); 
			estatura_media = entrada2.nextInt();
			
			if(estatura_media >= 1.75) {
				estatura_mayor[x] = estatura_media;
			}

			sum = sum + estatura_media;
			
		}
		System.out.println("La estatura media es: " + sum /5 );
		System.out.println("Los alumnos altos son: " + estatura_mayor.length);

		
	}

}