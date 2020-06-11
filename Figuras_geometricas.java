import java.util.ArrayList;
import java.util.Scanner;
public class Figuras_geometricas {
    static int eleccion =0;
    static Scanner ingreso = new Scanner(System.in);
    static int eleccion_2 =0;
    static Scanner ingreso_2 = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {

        do {
            System.out.println("Eliga una opción \n 1-Rectangulo \n 2-Triangulo \n 3-Cuadrado \n 4-Circulo ");
            eleccion = ingreso.nextInt();
            switch(eleccion){
                case 1:
                menu_secundario(eleccion);
                break;
            }
            
        
        }
        while(eleccion != 5);
        
    }

    public static void menu_secundario(int figura) {
        do{
            System.out.println("Eliga una opción \n 1-Area \n 2-Perimetro \n 3-Ver todo \n 4-Menu ");
            eleccion_2 = ingreso_2.nextInt(); 
            switch(eleccion_2){
                case 1:
                if(eleccion == 1){
                }
                break;
                case 2:
                break;
                case 3:
                break;
            }
        }
        while(eleccion_2 != 4);
        
    }
    
}


// Cochinero

    // public static void ImprimirAreasVariosRectangulos(ArrayList<Rectangulo> Lista){
    //     for(Rectangulo R:Lista){
    //         System.out.println("Area: " + R.Area_rectangulo());
    //     }
    // }

    // public static void ImprimirAreasVariosPerimetros(ArrayList<Rectangulo> Lista){
    //     for(Rectangulo R:Lista){
    //         System.out.println("Perimetro: " + R.Perimetro_rectangulo());
    //     }       
    // }

           // Area_imprimir(rec);
        // Perimetro_imprimir(rec);
    
        // ArrayList<Rectangulo> ListaRectangulo = new ArrayList<Rectangulo>();
        // ListaRectangulo.add(new Rectangulo(2, 3));
        // ListaRectangulo.add(new Rectangulo(6, 4));
        // ListaRectangulo.add(new Rectangulo(2, 3));
        // ListaRectangulo.add(new Rectangulo(6, 4));
        // 
        // ImprimirAreasVariosRectangulos(ListaRectangulo);
        // ImprimirAreasVariosPerimetros(ListaRectangulo);