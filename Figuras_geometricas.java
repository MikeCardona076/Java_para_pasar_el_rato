import java.util.ArrayList;
public class Figuras_geometricas {
    public static void main(String[] args) {
        // Rectangulo rec = new Rectangulo(0,0);

        // Area_imprimir(rec);
        // Perimetro_imprimir(rec);

        ArrayList<Rectangulo> ListaRectangulo = new ArrayList<Rectangulo>();
        ListaRectangulo.add(new Rectangulo(2, 3));
        ListaRectangulo.add(new Rectangulo(6, 4));
        ListaRectangulo.add(new Rectangulo(2, 3));
        ListaRectangulo.add(new Rectangulo(6, 4));
        
        ImprimirAreasVariosRectangulos(ListaRectangulo);
        ImprimirAreasVariosPerimetros(ListaRectangulo);

    }

    public static void ImprimirAreasVariosRectangulos(ArrayList<Rectangulo> Lista){
        for(Rectangulo R:Lista){
            System.out.println("Area: " + R.Area_rectangulo());
        }
    }

    public static void ImprimirAreasVariosPerimetros(ArrayList<Rectangulo> Lista){
        for(Rectangulo R:Lista){
            System.out.println("Perimetro: " + R.Perimetro_rectangulo());
        }       
    }

    // public static void Area_imprimir(Rectangulo r) {
    //     r.Area_rectangulo();
        
    // }
    // public static void Perimetro_imprimir(Rectangulo r) {
    //     r.Perimetro_rectangulo();
        
    // }

    
}