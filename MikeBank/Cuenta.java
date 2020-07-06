package MikeBank;

public class Cuenta {
    private String nombre;
    private String apellido;
    private String direccion;
    private Double saldo;
    private String telefono;
    private int numeroCuenta;


    public Cuenta(){
        nombre = "Mike";
        apellido = "Cardona";
        direccion = "Altiplano, palabra de vida";
        saldo = 400.50;
        telefono = "7621099652";
        numeroCuenta = 1000;
    }

    /////// SETTERS:
    public void setNombre(String setNombreUsuario){
        this.nombre = setNombreUsuario;
    } 

    public void setApellido(String setApellidoUsuario){
        this.apellido = setApellidoUsuario;
    }
    public void setDireccion(String setDireccionUsuario){
        this.direccion = setDireccionUsuario;
    }
    public void setSaldo(Double setSaldoUsuario){
        this.saldo = setSaldoUsuario;
    }
    public void setTelefono(String setTelefonoUsuario){
        this.telefono = setTelefonoUsuario;
    }
    public void setNumeroCuenta(int setNumeroCuentaUsuario){
        this.numeroCuenta = setNumeroCuentaUsuario;
    }

    //// GETTERS

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getDireccion(){
        return direccion;
    }
    public double getSaldo(){
        return saldo;
    }

    public String getTelefono(){
        return telefono;
    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    // METODOS EXTRAS
    public double depositoCuenta(double ingreso){
        return saldo = saldo + ingreso;
    }

    public double retiroCuenta(double ingreso){
        return saldo = saldo - ingreso;
    }

    public void consulaSaldo(){
        System.out.println("Tu saldo es: " + saldo);
    }

}