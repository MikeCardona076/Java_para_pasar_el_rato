package Figuras_Geo;
import java.util.Scanner;
public class Triangulo {
    private int area;
    double perimetro;
    private double lado;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Set_Area_triangulo(int base, int altura) {
        this.area = (base * altura) / 2;
    }

    public int Get_Area_triangulo(){
        return area;
    }

    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Set_Perimetro_triangulo(){
        //..........................................................
        //Variables
        int x =1;
        
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
        this.perimetro = lado;
    }

    public double Get_Perimetro_triangulo(){
        return perimetro;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
}