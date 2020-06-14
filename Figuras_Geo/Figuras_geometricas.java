package Figuras_Geo;
// import java.util.ArrayList;
import java.util.Scanner;
public class Figuras_geometricas {
    static int eleccion =0;// Sirve para elegir una figura geometrica 
    static Scanner ingreso = new Scanner(System.in);//Parte de eleccion
    static int eleccion_2 =0; //Evalua el segundo menu mediante la respuesta de eleccion(Variable)
    static Scanner ingreso_2 = new Scanner(System.in);
    static Rectangulo Get_elemento_rectangulo = new Rectangulo();//Obtiene un metodo de la clase Rectangulo
    static Cuadrado Get_elemento_cuadrado = new Cuadrado();//Obtiene un metodo de la clase Cuadrado
    static Triangulo Get_elemento_triangulo = new Triangulo(); //Obtiene un metodo de la clase Triangulo
    static Circulo Get_elemento_circulo = new Circulo(); //Obtiene un metodo de la clase Circulo

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
            //Si es diferente a 5 termina el programa, mientras no lo sea, este nos llevara al segundo menu con la Figura que elegimos 
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
                //Eleccion viene del primer menu, ya que este nos dice que figura escogimos 
                if(eleccion == 1){ //Rectangulo
                    Get_elemento_rectangulo.Area_rectangulo(3, 4);
                }
                if(eleccion == 2){//Triangulo
                    Get_elemento_triangulo.Area_triangulo(4, 5);
                }
                if(eleccion == 3){//Cuadrado
                    Get_elemento_cuadrado.Area_cuadrado(4);
                }
                if(eleccion == 4){//Circulo
                    Get_elemento_circulo.Area_circulo(2);
                }

                break;
                //Perimetro
                case 2:
                if(eleccion == 1){//Rectangulo
                    Get_elemento_rectangulo.Perimetro_rectangulo(3, 4);
                }
                if(eleccion == 2){//Triangulo
                    Get_elemento_triangulo.Perimetro_triangulo();
                }
                if(eleccion == 3){//Cuadrado
                    Get_elemento_cuadrado.Perimetro_cuadrado(4);
                }
                if(eleccion == 4){//Cuadrado
                    Get_elemento_circulo.Perimetro_circulo(3);
                }
                break;

                //Todo Falta de desarrollar
                case 3:
                if(eleccion == 1){
                    //LLamada de toda la info Rectangulo
                    Get_elemento_rectangulo.Area_rectangulo(3, 4);
                    Get_elemento_rectangulo.Perimetro_rectangulo(3, 4);
                }
                if(eleccion == 2){
                    //LLamada de toda la info Triangulo
                    Get_elemento_triangulo.Area_triangulo(3, 3);
                    Get_elemento_triangulo.Perimetro_triangulo();
                }
                if(eleccion == 3){
                    //LLamada de toda la info Cuadrado
                    Get_elemento_cuadrado.Area_cuadrado(4);;
                    Get_elemento_cuadrado.Perimetro_cuadrado(4);
                }
                if(eleccion == 4){
                    //LLamada de toda la info Circulo
                    Get_elemento_circulo.Area_circulo(3);
                    Get_elemento_circulo.Perimetro_circulo(4);
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