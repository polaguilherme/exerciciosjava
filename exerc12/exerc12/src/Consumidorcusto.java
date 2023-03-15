import java.util.Scanner;

public class Consumidorcusto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = sc.nextDouble();
        
        double impostos = custoFabrica * 0.45;
        double custoDistribuidor = (custoFabrica + impostos) * 0.28;
        double custoConsumidor = custoFabrica + impostos + custoDistribuidor;
        
        System.out.printf("O custo ao consumidor é de R$ %.2f", custoConsumidor);
        
        sc.close();
    }
}
