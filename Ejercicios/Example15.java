package Ejercicios;

public class Example15 { //ESTA ES La clase libro
    String titulo;
    boolean original;
    boolean prestable;

    public Example15(){
        titulo = "La Voz De Los Sueños y otros cuentos prodigiosos ";
        original = true ;
        prestable = false;
    }

    public void setOriginal(boolean esoriginal){ original = esoriginal; } 
    public void setTitulo(String sutitulo){ titulo = sutitulo;} 
    public void setPrestable(boolean esprestable){ prestable = esprestable; }
    
    public boolean getOriginal(){ return original;}
    public String getTitulo(){return titulo;}
    public boolean getPrestable(){return prestable;}
}