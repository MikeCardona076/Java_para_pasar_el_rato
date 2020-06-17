package Herencia;
import java.util.Scanner;

public class Triangulo extends Rectangulo {
    Rectangulo get_metodo = new Rectangulo();

    public double Area_triangulo(){
        return (get_metodo.Area_rectangulo(34, 4) / 2);

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
