import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCarrosAte2000 = 0;
        int totalCarros = 0;

        
        while (true) {
            System.out.print("Informe o ano do veículo (ou digite 0 para sair): ");
            int ano = sc.nextInt();

           
            if (ano == 0) {
                break;
            }

            System.out.print("Informe o valor do veículo: ");
            double valor = sc.nextDouble();

        
            double desconto;
            if (ano <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }

            double valorComDesconto = valor * (1 - desconto);
            System.out.printf("Valor do desconto: %.2f\n", valor * desconto);
            System.out.printf("Valor a ser pago: %.2f\n", valorComDesconto);

            totalCarros++;
        }

        System.out.printf("Total de carros com ano até 2000: %d\n", totalCarrosAte2000);
        System.out.printf("Total geral de carros: %d\n", totalCarros);
    }
}

