package Figuras_Geo;
import java.util.Scanner;
public class Triangulo {
    public void Area_triangulo(double base, double altura) {
        System.out.println("Area del Triangulo: " + (base * altura) / 2);

    }
    public void Perimetro_triangulo(){
        double lado = 0;
        int x =1;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresa sus lados del Triangulo");
        //Se hace un for para que vaya sumando los lados del Triangulo, ya que cada uno es diferente
        for(;x<=3;x++){
            int ingreso_lado = ingreso.nextInt();
            lado += ingreso_lado;
        }
        System.out.println("Perimetro del Triangulo: " + lado);
    }
    
}