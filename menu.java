import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Menu_cuadrado();
    }
    
    public static void Menu_cuadrado() {
        System.out.println("Menú del cuadrado");
        int ingreso;
        do {
            Scanner eleccion = new Scanner(System.in);
            System.out.println("Elija una opción ");
            System.out.println("1 Area, 2 Périmetro, 3 salir");
            ingreso = eleccion.nextInt();
            switch (ingreso) {
                case 1:
                    Area(Valores());
                    break;
                case 2:
                    Perimetro(Valores());
                    break;
            }
        } while (ingreso != 3);
        System.out.println("Adiós");
    }

    public static int Valores() {
        Scanner usuario_ingreso = new Scanner(System.in);
        System.out.println("Ingresa un Valor");
        int valor = usuario_ingreso.nextInt();
        return valor;
    }

    public static void Area(int i) {
        System.out.println("El  Área es:" + i * i);
    }

    public static void Perimetro(int lado) {
        System.out.println("El  Périmetro es:" + lado * 4);
    }
}