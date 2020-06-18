package Figuras_Geo;
import java.util.Scanner;

public class Cuadrado {
    //..........................................................
    //Variables
    private int lado =0;
    //..........................................................

    //..........................................................
    //Scanners
    Scanner ingreso = new Scanner(System.in);//Puede necesitar la funcion close() 'ingreso.close()'
    //..........................................................

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Get_Ingreso(){
        System.out.println("Ingresa lado o radio: ");
        lado = ingreso.nextInt();
        return lado;
            
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Area_cuadrado(){
        System.out.println("Area del cuadrado: " + Get_Ingreso() * Get_Ingreso());

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Perimetro_cuadrado() {
        System.out.println("Perimetro del cuadrado: " + Get_Ingreso() * 4);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
}