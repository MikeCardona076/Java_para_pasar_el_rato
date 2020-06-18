package Figuras_Geo;
// import java.util.ArrayList;
import java.util.Scanner;
public class Figuras_geometricas {

    //..........................................................
    //Variables///
    static int eleccion_uno =0;// Sirve para elegir una figura geometrica 
    static int eleccion_dos =0; //Evalua el segundo menu mediante la respuesta de eleccion_uno
    static Rectangulo Get_elemento_rectangulo = new Rectangulo();//Obtiene un metodo de la clase Rectangulo
    static Cuadrado Get_elemento_cuadrado = new Cuadrado();//Obtiene un metodo de la clase Cuadrado
    static Triangulo Get_elemento_triangulo = new Triangulo(); //Obtiene un metodo de la clase Triangulo
    static Circulo Get_elemento_circulo = new Circulo(); //Obtiene un metodo de la clase Circulo
    static int base;
    static int altura;
    ///Fin de variables///
    //..........................................................


    //..........................................................
    //Scanners///
    static Scanner primera_eleccion = new Scanner(System.in);//Parte de eleccion_uno
    static Scanner segunda_eleccion = new Scanner(System.in);//Parte de eleccion_dos
    static Scanner ingreso_base = new Scanner(System.in);//Parte de eleccion_dos
    static Scanner ingreso_altura = new Scanner(System.in);//Parte de eleccion_dos
    //Fin Scanners///
    //..........................................................


    //Main
    public static void main(String[] args) {
        menu(); //Llamada de la funcion menu

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Menu principal
    public static void menu() {

        do {
            System.out.println("Eliga una opción \n 1-Rectangulo \n 2-Triangulo \n 3-Cuadrado \n 4-Circulo \n 5-Vamonos");
            eleccion_uno = primera_eleccion.nextInt(); //Eleccion servira para evaluar el segundo menu

            if(eleccion_uno !=5 ){//Si es diferente a 5 termina el programa, mientras no lo sea, este nos llevara al segundo menu con la Figura que elegimos 
                menu_secundario(eleccion_uno);
            }
            
        }
        while(eleccion_uno != 5);
        
    } 
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Menu secundario
    public static void menu_secundario(int figura) {
        do{
            System.out.println("Eliga una opción \n 1-Area \n 2-Perimetro \n 3-Ver todo \n 4-Menu ");//Eleccion del usuario
            eleccion_dos = segunda_eleccion.nextInt(); 
            switch(eleccion_dos){
                //..........................................................
                case 1:
                //Area
                //La eleccion viene del primer menu, ya que este nos dice que figura escogimos 
                if(eleccion_uno == 1){ //Rectangulo
                    Ingresos();
                    Get_elemento_rectangulo.Set_Area_rectangulo(base, altura);
                    Get_elemento_rectangulo.Get_Area_rectangulo();
                }
                if(eleccion_uno == 2){//Triangulo
                    Ingresos();
                    Get_elemento_triangulo.Area_triangulo(base, altura);
                }
                if(eleccion_uno == 3){//Cuadrado
                    Get_elemento_cuadrado.Area_cuadrado();
                }
                if(eleccion_uno == 4){//Circulo
                    Get_elemento_circulo.Area_circulo();
                }
                break;
                //..........................................................



                //..........................................................
                //Perimetro
                case 2:
                if(eleccion_uno == 1){//Rectangulo
                    Ingresos();
                    Get_elemento_rectangulo.Set_Perimetro_rectangulo(base, altura);
                    Get_elemento_rectangulo.Get_Perimetro_rectangulo();
                }
                if(eleccion_uno == 2){//Triangulo
                    Get_elemento_triangulo.Perimetro_triangulo();
                }
                if(eleccion_uno == 3){//Cuadrado
                    Get_elemento_cuadrado.Perimetro_cuadrado();
                }
                if(eleccion_uno == 4){//Cuadrado
                    Get_elemento_circulo.Perimetro_circulo();
                }
                break;
                //..........................................................


                //..........................................................
                //Toda la info de Area y Perimetro
                case 3:
                if(eleccion_uno == 1){
                    //LLamada de toda la info Rectangulo
                    Get_elemento_rectangulo.Set_Area_rectangulo(base, altura);
                    Get_elemento_rectangulo.Get_Perimetro_rectangulo();
                }
                if(eleccion_uno == 2){
                    //LLamada de toda la info Triangulo
                    Get_elemento_triangulo.Area_triangulo(base, altura);
                    Get_elemento_triangulo.Perimetro_triangulo();
                }
                if(eleccion_uno == 3){
                    //LLamada de toda la info Cuadrado
                    Get_elemento_cuadrado.Area_cuadrado();;
                    Get_elemento_cuadrado.Perimetro_cuadrado();
                }
                if(eleccion_uno == 4){
                    //LLamada de toda la info Circulo
                    Get_elemento_circulo.Area_circulo();
                    Get_elemento_circulo.Perimetro_circulo();
                }
                break;
                //..........................................................
            }
        }
        while(eleccion_dos != 4);
        
    }

    public static void Ingresos(){
        System.out.println("Ingresa base: ");
        base = ingreso_base.nextInt();
        System.out.println("Ingresa Altura: ");
        altura = ingreso_altura.nextInt();
    }
    
}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
