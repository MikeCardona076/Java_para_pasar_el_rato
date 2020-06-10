import java.util.Scanner;
public class example7 {
    public static void main(String[] args) {
        int ingreso= 0,x=0;
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        for(;x<=10;x++){
            ingreso += numeros.nextInt();
        }
        numeros.close();
        System.out.println("La suma es: "+ ingreso);

    }
    
}