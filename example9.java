import java.util.Scanner;
public class example9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num =0;
        int cont = 0;
        ;
        int array[] = new int[3];
        for (int a = 0; a < 3; a++) {
            System.out.println("ingrese " + (a + 1) + "° elemeento al arreglo");
            array[a] = leer.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (num == array[j]) {
                    cont++;
                }
            }

        }
        if (cont > 0) {
            System.out.println("tiene elementos repetidos " + num);
        } else {
            System.out.println("no tiene elementos repetidos");
        }
    }
}

    
