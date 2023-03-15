import java.util.*;

public class Convertemp {
    public static void main(String[] args) throws Exception {
       double celsius, farenheit;
    Scanner sc = new Scanner(System.in);
       System.out.println("digite uma temperatura em celsius: ");
       celsius = sc.nextDouble();

       farenheit = celsius * 1.8 + 32;
        
        System.out.println("a temperatura convertida de celsius para farenheit e de: "+farenheit);
        
        }
    }

