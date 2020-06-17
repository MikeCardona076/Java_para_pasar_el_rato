package Figuras_Geo;
public class Circulo extends Cuadrado{

    //..........................................................
    //Llamadas a metodos
    Cuadrado get_metodo_Cuadrado = new Cuadrado();
    //..........................................................

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Area_circulo(){
        System.out.println("Area del Circulo: " + 3.1416 * (2 * get_metodo_Cuadrado.Ingreso()));

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Perimetro_circulo(){                  //Elevar un numero
        System.out.println("Perimetro del Circulo: " + 3.1416 * (Math.pow(get_metodo_Cuadrado.Ingreso(), 2)));
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}   
