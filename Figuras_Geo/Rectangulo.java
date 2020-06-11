package Figuras_Geo;
public class Rectangulo {
    public void Area_rectangulo(double base, double altura){
        System.out.println("Area del Rectangulo: " + base * altura);

    }
    public void Perimetro_rectangulo(double base, double altura){
        System.out.println("Perimetro del Rectangulo: " + (2 * (base + altura)));
    }
}

// Cochinero 
// private static double base;
// private static double altura;
    // public Rectangulo(double altura, double base) {
    //     super();
    //     this.altura = altura;
    //     this.base = base;
    // }

    // public double getBase(){
    //     return base;
    // }

    // public void setBase(double base){
    //     this.base = base;
    // }

    // public double getAltura(){
    //     return altura;
    // }

    // public void setAltura(double altura){
    //     this.altura = altura;
    // }

    // //Funciones para el Area 
    // public double Area_rectangulo() {
    //     return Rectangulo.CalcularArea(getBase(),getAltura());
 
    // }

    // public static double CalcularArea(double base, double altura){
    //     return base * altura;

    // }

    // //Funciones para el perimetro

    // public double Perimetro_rectangulo(){
    //     return Rectangulo.CalcularPerimetro(getBase(),getAltura());
 
    // }

    // public static double CalcularPerimetro(double base, double altura){
    //     return (2 * (base + altura));
    // }
    
    