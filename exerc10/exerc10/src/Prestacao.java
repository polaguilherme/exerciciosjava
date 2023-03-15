import java.util.*;

public class Prestacao {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.println("digite o preco da compra: ");

       double valor = sc.nextDouble();

       double prestacao = valor / 5;


        System.out.println("prestacao: "+prestacao);

    }
}
