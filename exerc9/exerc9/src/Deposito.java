import java.util.*;

public class Deposito {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor do depositado: ");
        double valordepositado = sc.nextDouble();

        double rendimento = valordepositado * 0.007;

        double valorcomrendimento = valordepositado + rendimento;

        System.out.println("o valor com rendimento e de: "+valorcomrendimento);

        sc.close();
    }
}
