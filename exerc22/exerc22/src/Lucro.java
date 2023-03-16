import java.util.Scanner;

public class Lucro {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double somaPreco = 0;
        double somaPrecoVenda =0;

        for (int i = 0; i <= 40; i++) {
            System.out.println("produto"+i);
            System.out.println("Informe o preco do produto: ");
            double precoCusto = sc.nextDouble();

            System.out.println("informe o preco de venda: ");
            double precoVenda = sc.nextDouble();

            double lucro = precoVenda - precoCusto;
            
            if (lucro > 0) {
                System.out.println("produto"+i+"teve lucro.");
            }else if (lucro < 0 ) {
                System.out.println("produto"+i+"teve prejuizo");
            }else{
                System.out.println("empate");
            }

            somaPreco += precoCusto;
            somaPrecoVenda += precoVenda;

        }

        double mediaPrecoCusto = somaPreco / 40;
        double mediaPrecoVenda = somaPrecoVenda / 40;

        System.out.println("media de preco de custo: "+mediaPrecoCusto);
        System.out.println("media preco de venda: "+mediaPrecoVenda);

    }
}
