package Figuras_Geo;
import java.util.Scanner;

public class Cuadrado {
    //..........................................................
    //Variables
    static int lado =0;
    //..........................................................

    //..........................................................
    //Scanners
    Scanner ingreso = new Scanner(System.in);//Puede necesitar la funcion close() 'ingreso.close()'
    //..........................................................

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Ingreso(){
        System.out.println("Ingresa lado o radio: ");
        int lado = ingreso.nextInt();
        return lado;
            
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Area_cuadrado(){
        System.out.println("Area del cuadrado: " + Ingreso() * Ingreso());

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Perimetro_cuadrado(){
        System.out.println("Perimetro del cuadrado: " + Ingreso() * 4);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
}