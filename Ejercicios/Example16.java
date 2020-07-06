package Ejercicios;

public class Example16 { //BIBLIOTECA
    static Example15 get_metodo_libro = new Example15();

    public static void main(String[] args) {
        get_metodo_libro.setTitulo("Python Cookbook 3");
        get_metodo_libro.setPrestable(true);
        get_metodo_libro.setOriginal(false);
        System.out.print(get_metodo_libro.getTitulo());
        System.out.print(" \n" +get_metodo_libro.getPrestable());
        System.out.print(" \n" +get_metodo_libro.getOriginal());
        

        get_metodo_libro.setTitulo("Fluent Python");
        get_metodo_libro.setPrestable(false);
        get_metodo_libro.setOriginal(true);
        System.out.print(" \n" +get_metodo_libro.getTitulo());
        System.out.print(" \n" +get_metodo_libro.getPrestable());
        System.out.print(" \n" +get_metodo_libro.getOriginal());
        
    }

}