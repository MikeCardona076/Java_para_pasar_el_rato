package Figuras_Geo;
// import java.util.ArrayList;
import java.util.Scanner;
public class Figuras_geometricas {
    static int eleccion =0;// Sirve para elegir una figura geometrica 
    static Scanner ingreso = new Scanner(System.in);//Parte de eleccion
    static int eleccion_2 =0; //Evalua el segundo menu mediante la respuesta de eleccion(Variable)
    static Scanner ingreso_2 = new Scanner(System.in);
    static Rectangulo Get_elemento_rectangulo = new Rectangulo();//Obtiene un metodo de la clase Rectangulo
    static Cuadrado Get_elemento_cuadrado = new Cuadrado();

    public static void main(String[] args) {
        menu();

    }

    //Menu principal
    public static void menu() {

        do {
            System.out.println("Eliga una opción \n 1-Rectangulo \n 2-Triangulo \n 3-Cuadrado \n 4-Circulo \n 5-Vamonos");
            eleccion = ingreso.nextInt(); //Eleccion servira para evaluar el segundo menu
            if(eleccion !=5 ){
                menu_secundario(eleccion);
            }
        }
        while(eleccion != 5);
        
    }

    //Menu secundario
    public static void menu_secundario(int figura) {
        do{
            System.out.println("Eliga una opción \n 1-Area \n 2-Perimetro \n 3-Ver todo \n 4-Menu ");//Eleccion del usuario
            eleccion_2 = ingreso_2.nextInt(); 
            switch(eleccion_2){
                case 1:
                //Area
                if(eleccion == 1){
                    Get_elemento_rectangulo.Area_rectangulo(3, 4);
                }
                if(eleccion == 3){
                    Get_elemento_cuadrado.Area_cuadrado(4);
                }

                break;
                //Perimetro
                case 2:
                if(eleccion == 1){
                    Get_elemento_rectangulo.Perimetro_rectangulo(3, 4);
                }
                if(eleccion == 3){
                    Get_elemento_cuadrado.Perimetro_rectangulo(4);
                }
                break;
                //Todo Falta de desarrollar
                case 3:
                if(eleccion == 1){
                    Get_elemento_rectangulo.Area_rectangulo(3, 4);
                    Get_elemento_rectangulo.Perimetro_rectangulo(3, 4);
                }
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