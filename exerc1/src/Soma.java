import java.util.Scanner;

public class Soma {
    public static void main(String[] args) throws Exception {
       int n1,n2,soma;

       Scanner sc = new Scanner(System.in);
       System.out.println("digite o um numero: ");
       n1 = sc.nextInt();
       System.out.println("digite outro numero: ");
       n2 = sc.nextInt();

       soma = n1 + n2;

       System.out.println("a soma dos numeros e: "+soma);


    }
}
