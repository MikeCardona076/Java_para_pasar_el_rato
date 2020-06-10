public class example12 {
    public static void main(String[] args) {
        int x = 5, producto = 10, cociente = 20;
       for(; x<=5; x++){
            producto *= x++;
            cociente /= ++x;

        }
       
        System.out.println("Valor de producto: "+ producto);
        System.out.println("Valor de cociente: "+ cociente);

    }
    
}