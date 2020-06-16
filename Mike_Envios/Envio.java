package Mike_Envios;

public class Envio extends Cliente{
    Cliente get_cliente = new Cliente();
    public void Informacion_Envio(String destino,String paquete, double peso){
        get_cliente.Informacion_Cliente("Juan");
        System.out.println("Destino:  " + destino + "\n Envio: " + paquete + "\n Peso: " + peso);
    }
    
}