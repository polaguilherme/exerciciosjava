import java.util.*;
public class Negativo {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.println("Informe um nuemro: ");

       int num = sc.nextInt();

       if (num < 0) {
        System.out.println(num+"e negativo");
       }else if (num >= 0) {
        System.out.println(num+"e positivo");
       }
    }
}
