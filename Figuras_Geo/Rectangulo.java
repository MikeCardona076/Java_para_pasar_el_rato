package Figuras_Geo;
public class Rectangulo {

    private int area, perimetro; //  
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Set_Area_rectangulo(int base, int altura) {
        this.area = base * altura;
    }

    public int Get_Area_rectangulo(){
        return area; 

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Set_Perimetro_rectangulo(int base, int altura){
        this.perimetro = 2 * (base + altura);
    }

    public int Get_Perimetro_rectangulo(){
        return this.perimetro;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
} 