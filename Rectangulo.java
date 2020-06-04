public class Rectangulo {
    private static double base;
    private static double altura;

    public Rectangulo(double d, double e) {
        this.altura = d;
        this.base = e;
    }

    public void Area_rectangulo() {
        System.out.println("EL Area: " + base * altura);
 
    }
    public void Perimetro(){
        System.out.println("Perimetro: " + 2 * (base + altura));

    }
    
}
