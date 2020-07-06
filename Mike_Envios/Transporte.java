package Mike_Envios;

public class Transporte extends Envio { 
    private int chapa;
    private String color;
    Envio get_envio = new Envio();
    
    public Transporte() { this.setColor("Blanco"); this.setChapa(100);
    }
    
    public Transporte(String unColor, int unaChapa){ this.setColor(unColor);
    this.setChapa(unaChapa);
    }
    
    //Métodos de acceso y modificación 
    public int getChapa(){
    return chapa;
    }
    public void setChapa(int unaChapa){ chapa = unaChapa;
    }
    
    public String getColor(){ return color;
    }
    
    public void setColor(String unColor){ color = unColor;
    }
    
    //SOBRE CARGO
    public String toString(){
    return "Camión de color: " + this.getColor() + " Con chapa: " + this.getChapa();
    }
    
    //PARA COMPARAR
    public boolean tieneMismoColor(Transporte unCamion){ return this.getColor().equals(unCamion.getColor());
    
    }
    
    // //INFO DEL CAMIÓN
    // Envio get_envio = new Envio();
    // public void Informacion_Transporte(String unidad){ 
    // get_envio.Informacion_Envio("TAXCO DE ALARCON GUERRERO","Plata", 12.3); 
    // System.out.println("Unidad: " + unidad);
    // }

    public void Marca_unidad(String marca){
        get_envio.Informacion_Envio("TAXCO DE ALARCON GUERRERO","Plata", 12.3);
        System.out.println("Marca: " + marca);
    }

}
