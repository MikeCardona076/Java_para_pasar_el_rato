package Mike_Envios;

public class Transporte extends Envio {
    Envio get_envio = new Envio();
    public void Informacion_Transporte(String unidad){
        get_envio.Informacion_Envio("TAXCO DE ALARCON GUERRERO","Plata", 12.3);
        System.out.println("Unidad: " + unidad);
    }
    
}