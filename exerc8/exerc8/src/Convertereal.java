import java.util.*;
public class Convertereal {
    public static void main(String[] args) throws Exception {
       double real, dolar;


       Scanner sc = new Scanner(System.in);
       System.out.println("digite um valor em real: ");
       real = sc.nextDouble();

       dolar = 1 * real / 5;

       System.out.println("o valor convertido em real para dolar e de: "+dolar);
        
    }
}
