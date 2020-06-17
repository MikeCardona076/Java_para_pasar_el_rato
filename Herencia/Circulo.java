package Herencia;

public class Circulo {
    public void Area_circulo(double radio){
        System.out.println("Area del Circulo: " + 3.1416 * (2* radio));

    }
    public void Perimetro_circulo(double radio){                  //Elevar un numero
        System.out.println("Perimetro del Circulo: " + 3.1416 * (Math.pow(radio, 2)));
    }

}
