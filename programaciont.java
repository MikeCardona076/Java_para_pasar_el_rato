import java.util.Scanner;
public class programaciont {
    public static void main(String[] args) {
        //Cálcular el área de un cuadrado
        Area_perimetro();
    }
     //Miguel Ángel Cardona Contreras
    public static void Area_perimetro() {
        int x;
        int y;
        Scanner lado1 = new Scanner(System.in);
        Scanner lado2= new Scanner(System.in);
        System.out.println("Ingresa lado 1");
        x = lado1.nextInt();
        y = lado1.nextInt();
        lado1.close();
        lado2.close();
        System.out.println("El Área es: " + x * y);
        System.out.println("Perimetro : " +x * 4);
    }
}