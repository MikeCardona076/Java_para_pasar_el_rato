public class Figuras_geometricas {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(4, 2);

        Area_imprimir(rec);
        Perimetro_imprimir(rec);
    }

    public static void Area_imprimir(Rectangulo r) {
        r.Area_rectangulo();
        
    }
    public static void Perimetro_imprimir(Rectangulo r) {
        r.Perimetro();
        
    }

    
}