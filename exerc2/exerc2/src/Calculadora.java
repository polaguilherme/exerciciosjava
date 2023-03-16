import java.util.*;

public class Calculadora {
    public static void main(String[] args) throws Exception {
       int n1,n2,soma,div,mult,sub;

       Scanner sc = new Scanner(System.in);
       System.out.println("digite o um numero: ");
       n1 = sc.nextInt();
       System.out.println("digite outro numero: ");
       n2 = sc.nextInt();

       soma = n1 + n2;
       div = n1 / n2 ;
       mult = n1 * n2 ;
       sub = n1 - n2 ;

       System.out.println("a soma dos numeros e: "+soma);
       System.out.println("a divisão dos numeros e: "+div);
       System.out.println("a multiplicação dos numeros e: "+mult);
       System.out.println("a subtração numeros e: "+sub);


    }
}