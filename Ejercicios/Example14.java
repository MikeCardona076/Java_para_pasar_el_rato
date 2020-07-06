package Ejercicios;

public class Example14 {
    public static void main(String[] args) {

        // contador == 50; #MAL DECLARADA 
        // wihle(contador <= 60) { 
        // System.out.println(
        // contador)   #FALTAN ESPACIOS 
        // contador = #LOGICA NO ADECAUADA 
        // contador ++;
        // }

        // corrección HECHA POR MIKE PAPI
        int contador = 50;
        while(contador <= 60){
            System.out.println(contador);
            contador++;
        }
        
    }
    
}



        // int largo=18;
        // int  ancho=3;
        // double altura = 2.25;
        // System.out.println("a) largo / ancho: " + largo/ancho + 
        // " \n b) largo / altura : "+ largo/altura  +
        // " \n c) largo % ancho: " + largo%ancho  +
        // " \n d) ancho % altura:  "+ ancho%altura  +
        // " \n e) largo * ancho + altura:" + (largo * ancho) + altura  +
        // " \n f) largo + ancho * altura:" + largo + (ancho *altura)
        // );