package MikeBank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank extends Cuenta{

    //Instancia
    static Cuenta aux;
    static Cuenta Info_cliente = new Cuenta();



    // LISTAS 
    static ArrayList<Cuenta> listaClientes = new ArrayList<Cuenta>();

    // SCANNERS
    static Scanner cuentaUsuarios = new Scanner(System.in);
    static Scanner opcion = new Scanner(System.in);

    //Variables
    static String nombre;
    static String apellido;
    static String direccion;
    static Double saldo = 50.0, saldo_nuevo;
    static String telefono;
    static int numeroCuenta;
    static int i=0, llave = 0, ingreso = 0;


    public static void main(String[] args) {
        Menu_cajero();

    }


    //...... INGRESAR CUENTA NUEVA 
    public static void IngresarNuevaCuenta(){

        do {
            System.out.println("Numero de cuentas a ingresar");
            llave = cuentaUsuarios.nextInt();
            cuentaUsuarios.nextLine(); //limpiar el intro
        } 
        while (llave < 0);
        for(i =1; i <= llave; i++){
            
            System.out.println("Ingresar nombre");
            nombre = cuentaUsuarios.nextLine();
            System.out.println("\n Ingresar apellido");
            apellido = cuentaUsuarios.nextLine();
            System.out.println("\n Ingresar Direccion");
            direccion = cuentaUsuarios.nextLine();
            System.out.println("\n Ingresar Telefono");
            telefono = cuentaUsuarios.nextLine();
            System.out.println("\n Ingresar numero de cuenta");
            numeroCuenta = cuentaUsuarios.nextInt();
            cuentaUsuarios.nextLine(); //limpiar el intro

            aux = new Cuenta();
            aux.setNombre(nombre);
            aux.setApellido(apellido);
            aux.setDireccion(direccion);
            aux.setTelefono(telefono);
            aux.setNumeroCuenta(numeroCuenta);
            listaClientes.add(aux);
            
            Sub_menu();
            cuentaUsuarios.nextLine(); //limpiar el intro

        }


    }


    //........................MOSTRAR TODOS LOS CLIENTES
    //Método para mostrar todos las cuentas de clientes 
    public static void mostrarClientes(){  
        for(int i = 0; i < listaClientes.size(); i++){
            System.out.println("Nombre: " + listaClientes.get(i).getNombre());
            System.out.println("Apellido : " + listaClientes.get(i).getApellido());
            System.out.println("Direccion: " + listaClientes.get(i).getDireccion());
            System.out.println("Telefono: " + listaClientes.get(i).getTelefono());
            System.out.println("Numero de cuenta: " + listaClientes.get(i).getNumeroCuenta());
            System.out.println("Saldo actual: " + saldo);
        }
    } 


    //..............................................................
    // MENU
    public static void Menu_cajero(){
        do{
            System.out.println("Bienvenido al cajero Mike" + "\n 1. Crear nueva cuenta" + "\n 2. Ver cuentas" + "\n 3 Salir");
            ingreso = opcion.nextInt();
            switch(ingreso){
                case 1:
                    IngresarNuevaCuenta();
                    break;
                case 2:
                    mostrarClientes();
                    break;
            }
            ///FIN DE SWITCH
        }
        while(ingreso != 3);

    }


    //................ACTIVIDAD BANCARIA
    public static void Sub_menu(){
        do{
            System.out.println("Alguna actividad bancaria" + "\n 1. Deposito" + "\n 2. Retiro" + " \n 4. Salir");
            ingreso = opcion.nextInt();
            if(ingreso == 1){
                Deposito_cliente();
                
            }
            if(ingreso ==2){
                Retiro_cliente();
            }
        }
        while(ingreso != 4);
    }


    //METODO PARA DEPOSITAR
    public static double Deposito_cliente(){
        System.out.println("Ingrese cantidad a depositar");
        saldo_nuevo = cuentaUsuarios.nextDouble();
        saldo = saldo + saldo_nuevo;
        Info_cliente.setSaldo(saldo);

        System.out.println("Saldo es: " + saldo);
        return saldo;
    }


    //METODO PARA RETIRO
    public static double Retiro_cliente(){
        System.out.println("Ingrese cantidad a retirar");
        saldo_nuevo = cuentaUsuarios.nextDouble();
        saldo = saldo - saldo_nuevo;
        Info_cliente.setSaldo(saldo);

        System.out.println("Saldo es: " + saldo);
        return saldo;
    }
}