package Figuras_Geo;
import java.util.Scanner;
public class Triangulo {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Area_triangulo(double base, double altura) {
        System.out.println("Area del Triangulo: " + (base * altura) / 2);

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Perimetro_triangulo(){
        //..........................................................
        //Variables
        int x =1;
        double lado = 0;
        //..........................................................

        //..........................................................
        //Scanners
        Scanner ingreso = new Scanner(System.in);//Puede necesitar la funcion close() 'ingreso.close()'
        //..........................................................

        System.out.println("Ingresa sus lados del Triangulo");
        //Se hace un for para que vaya sumando los lados del Triangulo, ya que cada uno es diferente
        for(;x<=3;x++){
            int ingreso_lado = ingreso.nextInt();
            lado += ingreso_lado; //Se van sumando y almacenando los valores en una variable
        }
        System.out.println("Perimetro del Triangulo: " + lado);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
}